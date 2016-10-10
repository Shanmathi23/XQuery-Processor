package edu.ucsd.antlrtutorial.XqueryFinal;
 

import java.io.IOException;
import java.util.ArrayList;
 
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class LetClause
{
	
	ArrayList<Var> varList = null;
	ArrayList<Xquery> xqList = null;
	
	public LetClause(ArrayList<Var> varList,ArrayList<Xquery> xqList)
	{
		this.varList = varList;
		this.xqList = xqList;
	}
	
	public VarContext varCtx = VarContext.get();	
	
	public void evaluateLet() throws ParserConfigurationException, SAXException, IOException
	{
		/* TODO: how to implement for
		 * It has list of var and xq. So, evaluate the xq and store it in hashmap.
		 */
		System.out.println("LET var size is "+this.varList.size());
		System.out.println("LET query size is "+this.xqList.size());
		
		List<Node> res = new ArrayList<Node>();
		
		for (int i = 0; i<this.varList.size(); i++)
		{
			System.out.println("LET var value "+i+" is "+this.varList.get(i).variable);
			System.out.println("Evaluating xquery : "+this.xqList.get(i));
			res = this.xqList.get(i).xEvaluate();
			varCtx.putVar(this.varList.get(i).variable, res);
			System.out.println(" LET HASHMAP in LOOP value in "+this.varList.get(i).variable+" "+ varCtx.getVar(this.varList.get(i).variable));
		}
}
}