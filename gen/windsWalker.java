import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class windsWalker extends windsBaseListener {
    // REGISTERS & ARGS: com(rdi, rsi, rdx, rcx, r8, r9)
    private String[] registersToArgsTable = {
            "rdi",
            "rsi",
            "rdx",
            "rcx",
            "r8",
            "r9"
    };

    private String windName             = Main.Windname;
    private String windsDirectory       = windName + "/Winds";
    private String outputDirectory      = windsDirectory + "/output";
    private String sourceDirectory      = windsDirectory + "/source";
    private String stdDirectory         = windsDirectory + "/standart";
    private String outputAsmFile        = outputDirectory + "/" + windName + ".asm";

    HashMap<String, String> stringVarsMap = new HashMap<>();
    HashMap<String, Integer> integerVarsMap = new HashMap<>();
    HashMap<String, String> hexVarsMap = new HashMap<>();

    InputStream windIn;
    String windInputString;

    @Override
    public void enterCmdLine(windsParser.CmdLineContext context) {
        System.out.println("Compiling wind: " + windName + "....\n");
        generateAsmFile(windName);
        appendCommandToAsmFile( "; </! ===THERE IS AN AUTO GENERATED NASM FILE FOR " + windName + ". DON'T EDIT IT!=== !/>" );
    }

    @Override
    public void enterEveryRule(ParserRuleContext context) {
        System.out.println("Building: " + context.getText());
    }


    @Override
    public void enterAnyCommand(windsParser.AnyCommandContext context) {
        if (context.command() == null) { return; }

        switch (context.command().getText()) {
            case "global": {
                appendCommandToAsmFile("\n" +
                        context.command().getText() + " " + getString(context.args().STRING().getText() + "\n")
                );
                break;
            }

            case "extern": {
                appendCommandToAsmFile("\n" +
                        context.command().getText() + " " + getString(context.args().STRING().getText() + "\n")
                );
                break;
            }

            case "section": {
                appendCommandToAsmFile("\n" +
                        context.command().getText() + " ." + getString(context.args().STRING().getText() + "\n")
                );
                break;
            }
            case "override": {
                appendCommandToAsmFile("\n" +
                        context.args().NAME().getText() + ":"
                );
                break;
            }
            case "call": {
                List<TerminalNode> args = context.args().function().funargs().NAME();

                for (Integer i = 0; i < args.size(); i++) {
                    System.out.println(args.get(i).getText());
                    if (Objects.equals(args.get(i).getText(), "()")) {
                        appendCommandToAsmFile( "\n" +
                                "xor " + registersToArgsTable[i] + "," + registersToArgsTable[i]
                        );
                    } else {
                        appendCommandToAsmFile("\n" +
                                "mov " + registersToArgsTable[i] + "," + args.get(i)
                        );
                    }
                }
                appendCommandToAsmFile( "\n" +
                        "call " + context.args().function().NAME()
                );

                break;
            }
            case "return": {
                if (context.args().NULL() != null) { // NULL
                    appendCommandToAsmFile( "\n" +
                            "ret"
                    );
                }
            }
        }
    }

    @Override
    public void enterAssign(windsParser.AssignContext context) {
        if (context.args().STRING() != null) {  // STRING CONTEXT
            stringVarsMap.put( context.NAME().getText(), context.args().STRING().getText() );
        }
        if (context.args().INTEGER() != null) {  // INTEGER CONTEXT
            integerVarsMap.put( context.NAME().getText(), Integer.valueOf(context.args().INTEGER().getText()));
        }
        if (context.args().HEX() != null) {  // HEX CONTEXT
            hexVarsMap.put( context.NAME().getText(), context.args().HEX().getText() );
        }

        // Appending to ASM
        if (context.typeofvar().getText().isEmpty()) { // Using DB as default
            appendCommandToAsmFile( "\n" +
                    context.NAME().getText() + ":db " + context.args().getText() + ",0"
            );
        } else {
            appendCommandToAsmFile( "\n" +
                context.NAME().getText() + ":" + context.typeofvar().getText() + " " + context.args().getText()
            );
        }
    }

    @Override
    public void enterOps(windsParser.OpsContext context) {
        String[] operands = new String[2];

        if (context.minusop() != null) { // MINUS

            if (context.minusop().firstop().INTEGER() != null) { // USING INTEGER AS FIRST
                operands[0] = context.minusop().firstop().INTEGER().getText();
            }
            if (context.minusop().lastop().INTEGER() != null) { // USING INTEGER AS LAST
                operands[1] = context.minusop().lastop().INTEGER().getText();
            }

            if (context.minusop().firstop().HEX() != null) { // USING HEX AS FIRST
                operands[0] = context.minusop().firstop().HEX().getText();
            }
            if (context.minusop().lastop().HEX() != null) { // USING HEX AS LAST
                operands[1] = context.minusop().lastop().HEX().getText();
            }

            if (context.minusop().firstop().register().NAME() != null) { // USING REGISTER AS FIRST
                operands[0] = context.minusop().firstop().register().NAME().getText();
            }
            if (context.minusop().lastop().register() != null) { // USING REGISTER AS LAST
                operands[1] = context.minusop().lastop().register().NAME().getText();
            }
            appendCommandToAsmFile("\n" +
                    "sub " + operands[0] + "," + operands[1]
            );
        }
        if (context.plusop() != null) { // PLUS

            if (context.plusop().firstop().INTEGER() != null) { // USING INTEGER AS FIRST
                operands[0] = context.plusop().firstop().INTEGER().getText();
            }
            if (context.plusop().lastop().INTEGER() != null) { // USING INTEGER AS LAST
                operands[1] = context.plusop().lastop().INTEGER().getText();
            }

            if (context.plusop().firstop().HEX() != null) { // USING HEX AS FIRST
                operands[0] = context.plusop().firstop().HEX().getText();
            }
            if (context.plusop().lastop().HEX() != null) { // USING HEX AS LAST
                operands[1] = context.plusop().lastop().HEX().getText();
            }

            if (context.plusop().firstop().register().NAME() != null) { // USING REGISTER AS FIRST
                operands[0] = context.plusop().firstop().register().NAME().getText();
            }
            if (context.plusop().lastop().register() != null) { // USING REGISTER AS LAST
                operands[1] = context.plusop().lastop().register().NAME().getText();
            }

            appendCommandToAsmFile("\n" +
                    "add " + operands[0] + "," + operands[1]
            );
        }
    }

    @Override
    public void enterRun(windsParser.RunContext context) {
        CompileAndRun();
    }

    // </! =====OTHER METHODS !/>
    private void CompileAndRun() {
        System.out.print("<=====>\nEverything built. Compiling .... ");

        String[] genOutput = {
                "nasm",
                "-f",
                "elf64",
                "-o",
                outputDirectory + "/" + windName + ".o",
                outputAsmFile
        };
        String[] genBin = {
            "gcc",
            outputDirectory + "/" + windName + ".o",
            "-static",
            "-o",
            outputDirectory + "/WINDEXEC"
            //outputDirectory + "/" + windName + ".windexec"
        };
        String[] execCom = {
            "./" + outputDirectory + "/WINDEXEC"
        };



        try {
            Runtime.getRuntime().exec(genOutput);
            System.out.print("OK\nBuilding WindExec file .... ");
            Thread.sleep(100);
            Runtime.getRuntime().exec(genBin);
            System.out.println("OK");
            Thread.sleep(100);
            // Launch
            System.out.println("<=====>\nEXECUTING WIND: " + windName + "\n\n<==Output==>");
            Process windExec = Runtime.getRuntime().exec(execCom);
            windIn = windExec.getInputStream();
            windInputString = new String(windIn.readAllBytes(), StandardCharsets.UTF_8);
            System.out.println(windInputString);
            windIn.close();
            windExec.waitFor();
            windExec.destroy();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String getString(String unparsed) {
        String[] splitted   = unparsed.split("\"");
        List<String> listed = new ArrayList<>(Arrays.asList(splitted));
        listed.removeFirst();
        return listed.get(0);
    }

    private void generateAsmFile(String windName) {
        System.out.print("Generating structure of " + outputAsmFile + " .... ");

        // Clear ASM file
        try (FileWriter asmFile = new FileWriter(outputAsmFile, false)) {
            asmFile.write("");
            System.out.println("OK");
            System.out.println("Building wind....");
        } catch (IOException e) {
            System.out.println("FAIL: " + e.getMessage());
        }
    }

    private void appendCommandToAsmFile(String command) {
        try (FileWriter asmFile = new FileWriter(outputAsmFile, true)) {
            asmFile.write(command);
        } catch (IOException e) {
            System.out.println("FAIL: " + e.getMessage());
        }
    }
}
