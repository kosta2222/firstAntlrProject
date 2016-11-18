// Generated from Hello.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull HelloParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull HelloParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull HelloParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull HelloParser.ValueContext ctx);
}