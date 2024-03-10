// Generated from /home/andofwinds/Documents/windslang/src/main/winds.g4 by ANTLR 4.13.1
package org.forsaken;
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
	 * Enter a parse tree produced by {@link windsParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(windsParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link windsParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(windsParser.AssignContext ctx);
}