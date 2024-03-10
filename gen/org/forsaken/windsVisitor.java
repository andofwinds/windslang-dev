// Generated from /home/andofwinds/Documents/windslang/src/main/winds.g4 by ANTLR 4.13.1
package org.forsaken;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link windsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface windsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link windsParser#cmdLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLine(windsParser.CmdLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#anyCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyCommand(windsParser.AnyCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(windsParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(windsParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(windsParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(windsParser.AssignContext ctx);
}