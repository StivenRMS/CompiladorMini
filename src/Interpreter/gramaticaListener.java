// Generated from C:/Users/50230/IdeaProjects/minicompilador/src\gramatica.g4 by ANTLR 4.12.0
package Interpreter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(gramaticaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(gramaticaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#if_decl}.
	 * @param ctx the parse tree
	 */
	void enterIf_decl(gramaticaParser.If_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#if_decl}.
	 * @param ctx the parse tree
	 */
	void exitIf_decl(gramaticaParser.If_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(gramaticaParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(gramaticaParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(gramaticaParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(gramaticaParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#var_assig}.
	 * @param ctx the parse tree
	 */
	void enterVar_assig(gramaticaParser.Var_assigContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#var_assig}.
	 * @param ctx the parse tree
	 */
	void exitVar_assig(gramaticaParser.Var_assigContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(gramaticaParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(gramaticaParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#asig_op}.
	 * @param ctx the parse tree
	 */
	void enterAsig_op(gramaticaParser.Asig_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#asig_op}.
	 * @param ctx the parse tree
	 */
	void exitAsig_op(gramaticaParser.Asig_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(gramaticaParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(gramaticaParser.OperacionContext ctx);
}