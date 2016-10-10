package edu.ucsd.antlrtutorial.XqueryFinal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Condition
{
	
	public Xquery xq1 = null;
	public Xquery xq2 = null;
	public Condition cond1 = null;
	public Condition cond2 = null;
	public String op = null;
	public boolean empty = false;
	public some some = null;
	
	//public VarContext varCtx = new VarContext();
	
	public Condition(Xquery xq1,Xquery xq2,Condition cond1,Condition cond2 ,String op,boolean empty,some some)
	{
		this.xq1 = xq1;
		this.xq2 = xq2;
		this.cond1 = cond1;
		this.cond2 = cond2;
		this.op = op;
		this.empty = empty;
		this.some = some;
	}
	

	public boolean valueEqual(Xquery xq1, Xquery xq2) throws ParserConfigurationException, SAXException, IOException		//isomorphism
	{
		List<Node> n1 = xq1.xEvaluate();
		List<Node> n2 = xq2.xEvaluate();
		for (int i=0; i<n1.size(); i++)
		{
			Node x = n1.get(i);
			for (int j=0; j<n2.size(); j++)
			{
				Node y = n2.get(j);
				if (x.getNodeType() == 1 && y.getNodeType() == 1)
				{
//					System.out.println("Text values "+x.getTextContent()+" "+y.getTextContent());
					if(x.getTextContent().equals(y.getTextContent()))
						return true;				
				}
				if (x.isEqualNode(y))
					return true;
			}
		}
		return false;
	}
	
	public boolean idEqual(Xquery xq1, Xquery xq2) throws ParserConfigurationException, SAXException, IOException
	{
		List<Node> n1 = xq1.xEvaluate();
		List<Node> n2 = xq2.xEvaluate();
		for (int i=0; i<n1.size(); i++)
		{
			Node x = n1.get(i);
			for (int j=0; j<n2.size(); j++)
			{
				Node y = n2.get(j);
				if (x == y)
					return true;
			}
		}
		return false;
	}

	

	public boolean conditionEvaluate() throws ParserConfigurationException, SAXException, IOException
	{
		boolean result=false;
		List<Node> xq1 = null;
		if (this.xq1 != null)
		{
			System.out.println("xq1 in cond");
			this.xq1.xEvaluate();
		}
		List<Node> xq2 = null;
		if (this.xq2 != null)
		{
			System.out.println("xq2 in cond");
			xq2 = this.xq2.xEvaluate();
		}
		if (this.op != null)
		{
			// =, eq, ==, not, and, or, is
			if(this.op.equals(" eq ") || this.op.equals("="))
			{
				System.out.println("XQ in condition "+this.xq1.rp1 + " "+this.xq2.StringConstant);
				if (valueEqual(this.xq1, this.xq2))
				{
//					System.out.println("Value equal found!");
					result = true;
				}
				else 
					result =  false;
			}
			else if(this.op.equals(" is ") || this.op.equals("=="))
			{
				if (idEqual(this.xq1, this.xq2))
					result =  true;
				else 
					result = false;		
			}
			else if (this.op.equals(" and "))
			{
				if (this.cond1.conditionEvaluate()  && this.cond2.conditionEvaluate() )
					result = true;
				else
					result = false;
			}
			else if(this.op.equals(" or "))
			{
				if (this.cond1.conditionEvaluate()  || this.cond2.conditionEvaluate() )
					result = true;
				else
					result = false;
			}			
			else if(this.op.equals("not "))
			{
				System.out.println("not ");
				if (this.cond1.conditionEvaluate())
				{
					System.out.println("Condition was true in not");
					result = false;
				}
				else result = true;
			}
		}
		else if(this.cond1 != null)
		{
			result =this.cond1.conditionEvaluate();
		}
		
		if(this.empty)
		{
			List<Node> res = this.xq1.xEvaluate();
			System.out.println("Empty true : "+res);
			if(res == null || res.size() == 0)
			{
				System.out.println("it was empty");
				result = true;
			}
			else{
				System.out.println("Not empty");
				result = false;
			}
						
		}
		if(this.some != null)
		{
			result = this.some.evaluateSome();
		}
		return result;
	}
			
	}
	
