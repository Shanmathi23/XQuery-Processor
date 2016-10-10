package edu.ucsd.antlrtutorial.XqueryFinal;
import java.util.*;
 

import java.io.IOException;
import java.util.ArrayList;
 
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class some
{
	
	ArrayList<Var> varList = null;
	ArrayList<Xquery> xqList = null;
	Condition c = null;
	
	public some(ArrayList<Var> varList,ArrayList<Xquery> xqList, Condition c)
	{
		this.varList = varList;
		this.xqList = xqList;
		this.c = c;
	}
	
	public VarContext varCtx = new VarContext();	
	
	public boolean evaluateSome() throws ParserConfigurationException, SAXException, IOException
	{
		 
		List<Node> res = new ArrayList<Node>();
		
		for (int i = 0; i<this.varList.size(); i++)
		{
			 
			res = this.xqList.get(i).xEvaluate();
			varCtx.putVar(varList.get(i).variable, res);
			
			//System.out.println("HASHMAP in LOOP value is "+ res.toString());
		}
		
		boolean conditionResult = this.c.conditionEvaluate();
		for (int j = 0; j<this.varList.size(); j++)
		{
			 varCtx.removeVar(varList.get(j).variable);
			
		}
		return conditionResult;
}
}