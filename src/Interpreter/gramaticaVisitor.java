// Generated from C:/Users/50230/IdeaProjects/minicompilador/src\gramatica.g4 by ANTLR 4.12.0
package Interpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(gramaticaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#if_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_decl(gramaticaParser.If_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(gramaticaParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(gramaticaParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#var_assig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assig(gramaticaParser.Var_assigContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(gramaticaParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#asig_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig_op(gramaticaParser.Asig_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(gramaticaParser.OperacionContext ctx);
}