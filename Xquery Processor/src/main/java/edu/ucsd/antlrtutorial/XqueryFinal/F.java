package edu.ucsd.antlrtutorial.XqueryFinal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

public class F {
	public Rp rp1 = null;
	public Rp rp2 = null;
	public F f1 = null;
	public F f2 = null;
	public String op = null;

	public F(Rp r1,Rp r2,F f11,F f21,String op1)
	{
		System.out.println(r1+ " "+r2+" "+f11+" "+f21);
		this.rp1=r1;
		this.rp2=r2;
		this.f1=f11;
		this.f2=f21;
		this.op = op1;
	}
	
	public boolean valueEqual(Rp rp1, Rp rp2, List<Node> n) throws DOMException, ParserConfigurationException		//isomorphism
	{
		List<Node> n1 = rp1.evaluateSingle(n);
		List<Node> n2 = rp2.evaluateSingle(n);
		for (int i=0; i<n1.size(); i++)
		{
			Node x = n1.get(i);
			for (int j=0; j<n2.size(); j++)
			{
				Node y = n2.get(j);
				if (x.isEqualNode(y))
					return true;
			}
		}
		return false;
	}
	
	public boolean idEqual(Rp rp1, Rp rp2, List<Node> n) throws DOMException, ParserConfigurationException
	{
		List<Node> n1 = rp1.evaluateSingle(n);
		List<Node> n2 = rp2.evaluateSingle(n);
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

	public Node fEvaluate(Node n1) throws DOMException, ParserConfigurationException
	{
		System.out.println("This f element: "+n1.getNodeName());
		List<Node> temp = new ArrayList<Node>();
		temp.add(n1);
		System.out.println("Evaluating f");
		if (this.op != null)
		{
			// =, eq, ==, not, and, or, is
			if (this.op.equals(" and "))
			{
				if (this.f1.fEvaluate(n1) != null && this.f2.fEvaluate(n1)!=null)
					return n1;
				else return null;
			}
			else if(this.op.equals(" or "))
			{
				if (this.f1.fEvaluate(n1) != null || this.f2.fEvaluate(n1)!=null)
					return n1;
				else return null;
			}
			else if(this.op.equals(" eq ") || this.op.equals("="))
			{
				if (valueEqual(this.rp1, this.rp2, temp))
					return n1;
				else return null;
			}
			else if(this.op.equals(" is ") || this.op.equals("=="))
			{
				if (idEqual(this.rp1, this.rp2, temp))
					return n1;
				else return null;
			}
			else if(this.op.equals("not "))
			{
				if (this.f1.fEvaluate(n1) == null)
					return n1;
				else return null;
			}
		}
		else
		{
			if(this.f1 != null)	//bracket case
				return this.f1.fEvaluate(n1);
			else if(this.rp1 != null)
			{
				System.out.println("rp1 in f");
				List<Node> n2 = this.rp1.evaluateR(temp,temp);
				if (n2 != null && n2.size() > 0)
					return n1;
			}
		}
		return null;
	}
}
