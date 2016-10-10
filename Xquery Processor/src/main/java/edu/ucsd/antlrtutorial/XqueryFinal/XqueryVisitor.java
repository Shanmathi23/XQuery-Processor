// Generated from edu\u005Cucsd\antlrtutorial\XqueryFinal\Xquery.g4 by ANTLR 4.5
package edu.ucsd.antlrtutorial.XqueryFinal;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XqueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XqueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XqueryParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(XqueryParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp(XqueryParser.ApContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#ap1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp1(XqueryParser.Ap1Context ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#ap3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp3(XqueryParser.Ap3Context ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp(XqueryParser.RpContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#many}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMany(XqueryParser.ManyContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#self}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf(XqueryParser.SelfContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(XqueryParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XqueryParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XqueryParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(XqueryParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(XqueryParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(XqueryParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(XqueryParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#fBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFBracket(XqueryParser.FBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq(XqueryParser.XqContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XqueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XqueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XqueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(XqueryParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XqueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#some}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSome(XqueryParser.SomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#oxq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOxq(XqueryParser.OxqContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#forJ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForJ(XqueryParser.ForJContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(XqueryParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#condJ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondJ(XqueryParser.CondJContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#returnJ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnJ(XqueryParser.ReturnJContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(XqueryParser.VarContext ctx);
}