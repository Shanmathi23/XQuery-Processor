// Generated from edu\u005Cucsd\antlrtutorial\XqueryFinal\Xquery.g4 by ANTLR 4.5
package edu.ucsd.antlrtutorial.XqueryFinal;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XqueryParser}.
 */
public interface XqueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XqueryParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(XqueryParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(XqueryParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(XqueryParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(XqueryParser.ApContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#ap1}.
	 * @param ctx the parse tree
	 */
	void enterAp1(XqueryParser.Ap1Context ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#ap1}.
	 * @param ctx the parse tree
	 */
	void exitAp1(XqueryParser.Ap1Context ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#ap3}.
	 * @param ctx the parse tree
	 */
	void enterAp3(XqueryParser.Ap3Context ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#ap3}.
	 * @param ctx the parse tree
	 */
	void exitAp3(XqueryParser.Ap3Context ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp(XqueryParser.RpContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp(XqueryParser.RpContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#many}.
	 * @param ctx the parse tree
	 */
	void enterMany(XqueryParser.ManyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#many}.
	 * @param ctx the parse tree
	 */
	void exitMany(XqueryParser.ManyContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#self}.
	 * @param ctx the parse tree
	 */
	void enterSelf(XqueryParser.SelfContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#self}.
	 * @param ctx the parse tree
	 */
	void exitSelf(XqueryParser.SelfContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#parent}.
	 * @param ctx the parse tree
	 */
	void enterParent(XqueryParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#parent}.
	 * @param ctx the parse tree
	 */
	void exitParent(XqueryParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(XqueryParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(XqueryParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XqueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XqueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(XqueryParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(XqueryParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XqueryParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XqueryParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(XqueryParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(XqueryParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(XqueryParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(XqueryParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#fBracket}.
	 * @param ctx the parse tree
	 */
	void enterFBracket(XqueryParser.FBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#fBracket}.
	 * @param ctx the parse tree
	 */
	void exitFBracket(XqueryParser.FBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq(XqueryParser.XqContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq(XqueryParser.XqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XqueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XqueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XqueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XqueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XqueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XqueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(XqueryParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(XqueryParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XqueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XqueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#some}.
	 * @param ctx the parse tree
	 */
	void enterSome(XqueryParser.SomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#some}.
	 * @param ctx the parse tree
	 */
	void exitSome(XqueryParser.SomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#oxq}.
	 * @param ctx the parse tree
	 */
	void enterOxq(XqueryParser.OxqContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#oxq}.
	 * @param ctx the parse tree
	 */
	void exitOxq(XqueryParser.OxqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#forJ}.
	 * @param ctx the parse tree
	 */
	void enterForJ(XqueryParser.ForJContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#forJ}.
	 * @param ctx the parse tree
	 */
	void exitForJ(XqueryParser.ForJContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(XqueryParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(XqueryParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#condJ}.
	 * @param ctx the parse tree
	 */
	void enterCondJ(XqueryParser.CondJContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#condJ}.
	 * @param ctx the parse tree
	 */
	void exitCondJ(XqueryParser.CondJContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#returnJ}.
	 * @param ctx the parse tree
	 */
	void enterReturnJ(XqueryParser.ReturnJContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#returnJ}.
	 * @param ctx the parse tree
	 */
	void exitReturnJ(XqueryParser.ReturnJContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(XqueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(XqueryParser.VarContext ctx);
}