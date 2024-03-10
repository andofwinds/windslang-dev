// Generated from /home/andofwinds/Documents/windslang/src/main/winds.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link windsParser#funargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunargs(windsParser.FunargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(windsParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#typeofvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofvar(windsParser.TypeofvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOps(windsParser.OpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#plusop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusop(windsParser.PlusopContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#minusop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusop(windsParser.MinusopContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#firstop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstop(windsParser.FirstopContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#lastop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastop(windsParser.LastopContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(windsParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link windsParser#run}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun(windsParser.RunContext ctx);
}