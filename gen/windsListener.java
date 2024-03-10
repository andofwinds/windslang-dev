// Generated from /home/andofwinds/Documents/windslang/src/main/winds.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link windsParser}.
 */
public interface windsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link windsParser#cmdLine}.
	 * @param ctx the parse tree
	 */
	void enterCmdLine(windsParser.CmdLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#cmdLine}.
	 * @param ctx the parse tree
	 */
	void exitCmdLine(windsParser.CmdLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#anyCommand}.
	 * @param ctx the parse tree
	 */
	void enterAnyCommand(windsParser.AnyCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#anyCommand}.
	 * @param ctx the parse tree
	 */
	void exitAnyCommand(windsParser.AnyCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(windsParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(windsParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(windsParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(windsParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(windsParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(windsParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#funargs}.
	 * @param ctx the parse tree
	 */
	void enterFunargs(windsParser.FunargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#funargs}.
	 * @param ctx the parse tree
	 */
	void exitFunargs(windsParser.FunargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(windsParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(windsParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#typeofvar}.
	 * @param ctx the parse tree
	 */
	void enterTypeofvar(windsParser.TypeofvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#typeofvar}.
	 * @param ctx the parse tree
	 */
	void exitTypeofvar(windsParser.TypeofvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(windsParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(windsParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#plusop}.
	 * @param ctx the parse tree
	 */
	void enterPlusop(windsParser.PlusopContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#plusop}.
	 * @param ctx the parse tree
	 */
	void exitPlusop(windsParser.PlusopContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#minusop}.
	 * @param ctx the parse tree
	 */
	void enterMinusop(windsParser.MinusopContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#minusop}.
	 * @param ctx the parse tree
	 */
	void exitMinusop(windsParser.MinusopContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#firstop}.
	 * @param ctx the parse tree
	 */
	void enterFirstop(windsParser.FirstopContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#firstop}.
	 * @param ctx the parse tree
	 */
	void exitFirstop(windsParser.FirstopContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#lastop}.
	 * @param ctx the parse tree
	 */
	void enterLastop(windsParser.LastopContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#lastop}.
	 * @param ctx the parse tree
	 */
	void exitLastop(windsParser.LastopContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(windsParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(windsParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link windsParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(windsParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(windsParser.RunContext ctx);
}