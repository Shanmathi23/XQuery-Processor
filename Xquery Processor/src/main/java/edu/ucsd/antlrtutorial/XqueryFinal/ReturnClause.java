package edu.ucsd.antlrtutorial.XqueryFinal;

import java.io.IOException;
import java.util.*;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class ReturnClause
{
	public Xquery xq1 = null;
	
	public ReturnClause(Xquery xq1)
	{
		this.xq1 = xq1;
		
	}
	
	public List<Node> evaluateReturn() throws ParserConfigurationException, SAXException, IOException
	{
		List<Node> returnResult = new ArrayList<Node>();
		returnResult = this.xq1.xEvaluate();
		System.out.println("return result "+returnResult.size());
		for(int i=0; i< returnResult.size(); i++)
		{
			System.out.println(returnResult.get(i).getNodeName()+" "+returnResult.get(i).getTextContent());
		}
		return returnResult;		
	}
}