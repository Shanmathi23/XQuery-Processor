package edu.ucsd.antlrtutorial.XqueryFinal;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class WhereClause
{
	//public VarContext varCtx = new VarContext();
	
	public Condition cond1 = null;
	//public Condition cond2 = null;
	
	public WhereClause(Condition cond1 )
	{
		this.cond1 = cond1;
		//this.cond2 = cond2;
	}
	
	
	public boolean whereEvaluate() throws ParserConfigurationException, SAXException, IOException
	{
		boolean whereResult;
/*		if (varCtx.getVar("Result") != null && varCtx.getVar("Result").get(0)!=null)
			System.out.println("result where before cond :"+varCtx.getVar("Result").get(0).getTextContent());*/
		whereResult = cond1.conditionEvaluate();
		System.out.println("Where returns: "+whereResult);
/*		if (varCtx.getVar("Result") != null && varCtx.getVar("Result").get(0)!=null)
			System.out.println("result where after cond :"+varCtx.getVar("Result").get(0).getTextContent());*/
		return whereResult;
	}
}