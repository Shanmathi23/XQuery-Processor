package edu.ucsd.antlrtutorial.XqueryFinal;

import java.util.ArrayList;


import org.antlr.v4.runtime.misc.NotNull;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
 


public class XqueryMyListener extends XqueryBaseListener
{
	ParseTreeProperty<Object> PPTree = new ParseTreeProperty<Object>();
	XqueryParser.RContext Root = null;
	
	
	@Override public void exitXq(XqueryParser.XqContext ctx) 	
	{
//		Root = ctx;
		Var v = (Var)PPTree.get(ctx.var());
		String StringConstant = null;
		
		if(ctx.StringConstant() !=null)
		{
			String withQuotes = ctx.StringConstant().getText();
			StringConstant = withQuotes.substring(1, withQuotes.length()-1);
		}
		Ap ap1 = (Ap)PPTree.get(ctx.ap());
		Xquery xq1 = (Xquery) PPTree.get(ctx.xq(0));
		Xquery xq2 = (Xquery) PPTree.get(ctx.xq(1));
		Rp rp1 =(Rp)PPTree.get(ctx.rp());
		ForClause for1 = (ForClause)PPTree.get(ctx.forClause());
		LetClause let1 = (LetClause)PPTree.get(ctx.letClause());
		WhereClause wh1 = (WhereClause)PPTree.get(ctx.whereClause());
		ReturnClause ret = (ReturnClause)PPTree.get(ctx.returnClause());
		System.out.println("Xq context : "+ctx.getText());
		System.out.println("Xquery1 context "+ctx.xq(0)+" "+xq1);
		System.out.println("Xquery2 context "+ctx.xq(1)+" "+xq2);
		System.out.println("Ap context "+ctx.ap()+" "+ap1);
		System.out.println("Return context "+ctx.returnClause()+" "+ret);
		System.out.println("Return context "+ctx.returnClause()+" "+ret);
		// TODO: operation: , / //		and <tagname> 	DONE
		String op = null;
		if(ctx.getChild(1) != null)
		{
			String temp = ctx.getChild(1).getText();
			if (temp.equals("/")||temp.equals("//")||temp.equals(","))
				op = temp;
		}
		String tag = null;
		if(ctx.tagName(0) != null)
			tag = ctx.tagName(0).getText();
		Xquery xqObj = new Xquery(v,StringConstant,ap1,xq1,xq2,
				rp1,for1,let1,wh1,ret,op,tag);
		System.out.println("xq obj return : "+xqObj.return1);
		PPTree.put(ctx, xqObj);
		
	}
	
	@Override public void exitForClause(XqueryParser.ForClauseContext ctx)
	{
		//ForClause for1 = (ForClause)PPTree.get(ctx);
		//VarBinding varBindList1 = (VarBinding)PPTree.get(ctx.varBinding(0));
		//VarBinding varBindList2 = (VarBinding)PPTree.get(ctx.varBinding(1));
		ArrayList<Var> variable_list = new ArrayList<Var>();
		for(int i=0;i<ctx.var().size();i++)
		{
			String name = ctx.var().get(i).getText();
			System.out.println("In for context variable "+i+" is "+name);
			Var current_var = new Var(name);
			variable_list.add(current_var);
		}
		ArrayList<Xquery> xquery_list = new ArrayList<Xquery>();
		for(int j = 0; j<ctx.xq().size();j++)
		{
			System.out.println("In for context xquery "+j+" is "+ctx.xq(j).getText());
			xquery_list.add((Xquery)PPTree.get(ctx.xq(j)));
		}
		
		ForClause forObj = new ForClause(variable_list,xquery_list);
		PPTree.put(ctx, forObj);
		System.out.println("Inside For Context : " +ctx.getText());
		
	}	 
	 
	@Override public void exitLetClause(XqueryParser.LetClauseContext ctx)
	{ 
		//LetVarBinding letvb1 = (LetVarBinding)PPTree.get(ctx.letVarBinding(0));
		//LetVarBinding letvb2 = (LetVarBinding)PPTree.get(ctx.letVarBinding(1));
		
		ArrayList<Var> let_variable_list = new ArrayList<Var>();
		for(int i=0;i<ctx.var().size();i++)
		{
			String name = ctx.var().get(i).getText();
			Var current_var = new Var(name);
			let_variable_list.add(current_var);
		}
		ArrayList<Xquery> let_xquery_list = new ArrayList<Xquery>();
		for(int j = 0; j<ctx.xq().size();j++)
		{
			let_xquery_list.add((Xquery)PPTree.get(ctx.xq(j)));		
		}
					
		LetClause letObj = new LetClause(let_variable_list,let_xquery_list);
		PPTree.put(ctx, letObj);
		System.out.println("Inside let Context : " +ctx.getText());	
		
	}
	 
	@Override public void exitWhereClause(XqueryParser.WhereClauseContext ctx) 
	{
		Condition c1 =(Condition)PPTree.get(ctx.cond());
		//Condition c2 = (Condition)PPTree.get
		WhereClause whereObj = new WhereClause(c1);
		PPTree.put(ctx, whereObj);				
	}
	
	@Override public void exitSome(XqueryParser.SomeContext ctx) 
	{ 
		ArrayList<Var> some_variable_list = new ArrayList<Var>();
		for(int i=0;i<ctx.var().size();i++)
		{
			String name = ctx.var().get(i).getText();
			Var current_var = new Var(name);
			some_variable_list.add(current_var);
		}
		ArrayList<Xquery> some_xquery_list = new ArrayList<Xquery>();
		for(int j = 0; j<ctx.xq().size();j++)
		{
			some_xquery_list.add((Xquery)PPTree.get(ctx.xq(j)));		
		}
	    
		Condition c1 =(Condition)PPTree.get(ctx.cond());
		some someObj = new some(some_variable_list,some_xquery_list,c1);
		PPTree.put(ctx, someObj);
		
	}

	 
	@Override public void exitReturnClause(XqueryParser.ReturnClauseContext ctx)
	{
		Xquery xq1 = (Xquery)PPTree.get(ctx.xq());
		ReturnClause returnObj = new ReturnClause(xq1);
		PPTree.put(ctx,returnObj);
	}
	 
	@Override public void exitCond(XqueryParser.CondContext ctx)
	{
		Xquery xq1=(Xquery)PPTree.get(ctx.xq(0));
		Xquery xq2=(Xquery)PPTree.get(ctx.xq(1));
		Condition c1 = (Condition)PPTree.get(ctx.cond(0));
		Condition c2 = (Condition)PPTree.get(ctx.cond(1));
		some s1 = (some)PPTree.get(ctx.some());
		String op = null;
		
		if(ctx.getChild(1) != null)
		{
				String temp = ctx.getChild(1).getText();
				if (temp.equals("=")||temp.equals("==")||
				temp.equals(" eq ")||temp.equals(" and ")||temp.equals(" or ")||temp.equals(" is "))
				{
					op = temp;
					System.out.println("op : "+op);
				}
		}
		if(ctx.getChild(0) != null)
		{
			if (ctx.getChild(0).getText().equals("not "))
				op = "not ";
			System.out.println("op : "+op);
		}
		
		boolean empty = false;
		some someObj = null;
		
		if(ctx.getChild(0).getText().equals("empty "))
				empty = true;
		
		if(ctx.getChild(0).getText().equals("some "))
		    someObj = s1;
		else
		    someObj = null;
		 
		 
		Condition condObj = new Condition(xq1,xq2,c1,c2,op,empty,someObj);
		PPTree.put(ctx, condObj);		
	}
	 
	@Override public void exitVar(XqueryParser.VarContext ctx)
	{
		Var v = new Var(ctx.getText());
		//System.out.println("Variable name " + v.variable);
		PPTree.put(ctx,v);
	}
	
	@Override public void exitAp(@NotNull XqueryParser.ApContext ctx)
	{
		Ap1 ap11 = (Ap1)PPTree.get(ctx.ap1());
		Ap3 ap31 = (Ap3)PPTree.get(ctx.ap3());
		Ap ap = new Ap(ap11,ap31);
		PPTree.put(ctx, ap);
	}
	
	@Override public void exitAp1(@NotNull XqueryParser.Ap1Context ctx)
	{
		FileName f1 = (FileName)PPTree.get(ctx.fileName());
		Rp r1 = (Rp)PPTree.get(ctx.rp());
		Ap1 ap1 = new Ap1(f1,r1);
		PPTree.put(ctx, ap1);
	}
	
	@Override public void exitAp3(@NotNull XqueryParser.Ap3Context ctx)
	{
		FileName f1 = (FileName)PPTree.get(ctx.fileName());
		Rp r1 = (Rp)PPTree.get(ctx.rp());
		Ap3 ap3 = new Ap3(f1,r1);
		PPTree.put(ctx, ap3);
	}
	
	@Override public void exitAttName (@NotNull XqueryParser.AttNameContext ctx)
	{
		AttName attName1 = new AttName(ctx.getText());
		PPTree.put(ctx, attName1);
	}
	
	
	@Override public void exitF (@NotNull XqueryParser.FContext ctx)
	{
		Rp rp1 = (Rp)PPTree.get(ctx.rp(0));
		Rp rp2 = (Rp)PPTree.get(ctx.rp(1));
		F f1 = (F)PPTree.get(ctx.f(0));
		F f2 = (F)PPTree.get(ctx.f(1));
		String op = null;
		if(ctx.getChild(1) != null)
		{
			String temp = ctx.getChild(1).getText();
			if (temp.equals("=")||temp.equals("==")||
					temp.equals(" eq ")||temp.equals(" and ")||temp.equals(" or ")||temp.equals(" is "))
				op = temp;
		}
		if(ctx.not() != null)
			op = "not ";
		System.out.println("F "+(ctx.f(0)));
		F fmain = new F(rp1,rp2,f1,f2,op);
		PPTree.put(ctx, fmain);
	}

	@Override public void exitFileName (@NotNull XqueryParser.FileNameContext ctx)
	{
		FileName f = new FileName(ctx.getText().substring(1,ctx.getText().length()-1));
		PPTree.put(ctx,f);
	}
	@Override public void exitRp (XqueryParser.RpContext ctx)
	{
		Rp rp1 = (Rp)PPTree.get(ctx.rp(0));
		Rp rp2 = (Rp)PPTree.get(ctx.rp(1));
		F f1 = (F)PPTree.get(ctx.f());
		TagName tg1 = (TagName)PPTree.get(ctx.tagName());
		AttName at1 = (AttName)PPTree.get(ctx.attName());
		boolean text1 = false;
		boolean self = false;
		boolean many = false;
		boolean parent = false;
		if (ctx.text() != null)
		{
			System.out.println("Text is true");
			text1 = true;
		}
		else if (ctx.parent() != null)
			parent = true;
		else if (ctx.self() != null)
			self = true;
		else if (ctx.many() != null)
			many = true;
		String op = null;
		if(ctx.getChild(1) != null)
		{
			String temp = ctx.getChild(1).getText();
			if (temp.equals("/")||temp.equals("//")||temp.equals(","))
				op = temp;
		}
		Rp rpmain = new Rp(rp1,rp2,f1,op,tg1,text1,at1, many, parent, self);
		System.out.println("Set text to : "+rpmain.text+" for ctx : "+ctx.getText());
		PPTree.put(ctx, rpmain);
	}
	
	@Override public void exitTagName (XqueryParser.TagNameContext ctx)
	{
		TagName tg = new TagName(ctx.getText());
		//System.out.println("Tagname: " + tg.tagName);
		PPTree.put(ctx,tg);
	}
	

	// Joins
	@Override public void exitR(XqueryParser.RContext ctx)
	{
		Root = ctx;
		Xquery xq1 = (Xquery)PPTree.get(ctx.xq());
		Oxquery oxq1 = (Oxquery)PPTree.get(ctx.oxq());
		R rObj = new R(xq1,oxq1);
		PPTree.put(ctx, rObj);
	}
		
	@Override public void exitOxq(XqueryParser.OxqContext ctx)
	{
		ForJ f1 = (ForJ)PPTree.get(ctx.forJ());
		CondJ c1 = (CondJ)PPTree.get(ctx.condJ());
		ReturnJ r1 = (ReturnJ)PPTree.get(ctx.returnJ());
		Oxquery oxqObj = new Oxquery(f1,c1,r1);
		PPTree.put(ctx, oxqObj);
	} 
//oxq: 'for' forJ 'where' condJ 'return' returnJ ;
	
	@Override public void enterForJ(XqueryParser.ForJContext ctx)
	{
		ArrayList<Var> variable_list = new ArrayList<Var>();
		for(int i=0;i<ctx.var().size();i++)
		{
			String name = ctx.var().get(i).getText();
			System.out.println("In for context variable "+i+" is "+name);
			Var current_var = new Var(name);
			variable_list.add(current_var);
		}
		ArrayList<Path> path_list = new ArrayList<Path>();
		for(int j = 0; j<ctx.path().size();j++)
		{
			path_list.add((Path)PPTree.get(ctx.path(j)));
		}
		
		ForJ forObj = new ForJ(variable_list,path_list);
		PPTree.put(ctx, forObj);		
	}

	@Override public void enterPath(XqueryParser.PathContext ctx)
	{
		Var v = (Var)PPTree.get(ctx.var());
		Ap ap1 = (Ap)PPTree.get(ctx.ap());
		Rp rp1 =(Rp)PPTree.get(ctx.rp());		
		Path pathObj = new Path(v,ap1,rp1);
		PPTree.put(ctx, pathObj);
	}

	@Override public void enterCondJ(XqueryParser.CondJContext ctx)
	{
		CondJ c1 = (CondJ)PPTree.get(ctx.condJ(0));
		CondJ c2 = (CondJ)PPTree.get(ctx.condJ(1));
		Var v1 = (Var)PPTree.get(ctx.var(0));
		Var v2 = (Var)PPTree.get(ctx.var(1));
		String op = null;
		String StringConstant = null;
		
		if(ctx.StringConstant() !=null)
		{
			String withQuotes = ctx.StringConstant().getText();
			StringConstant = withQuotes.substring(1, withQuotes.length()-1);
		}		
		if(ctx.getChild(1) != null)
		{
				String temp = ctx.getChild(1).getText();
				if (temp.equals("=")||temp.equals(" eq ")||temp.equals(" and "))
				{
					op = temp;
					System.out.println("op : "+op);
				}
		}

		CondJ condjObj = new CondJ(c1,c2,op,v1,v2,StringConstant);
		PPTree.put(ctx, condjObj);		
	}

	@Override public void enterReturnJ(XqueryParser.ReturnJContext ctx)
	{
		Path path1 = (Path)PPTree.get(ctx.path());
		Var v1 = (Var)PPTree.get(ctx.var());
		ReturnJ r1 = (ReturnJ)PPTree.get(ctx.returnJ(0));
		ReturnJ r2 = (ReturnJ)PPTree.get(ctx.returnJ(1));
		String op = null;
		if(ctx.getChild(1) != null)
		{
			String temp = ctx.getChild(1).getText();
			if (temp.equals("/")||temp.equals("//")||temp.equals(","))
				op = temp;
		}
		String tag = null;
		if(ctx.tagName(0) != null)
			tag = ctx.tagName(0).getText();
		ReturnJ returnjObj = new ReturnJ(v1,r1,r2,op,tag,path1);
		PPTree.put(ctx, returnjObj);				
	}

}
