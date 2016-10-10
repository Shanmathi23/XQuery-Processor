package edu.ucsd.antlrtutorial.XqueryFinal;

import java.util.ArrayList;
import java.util.List;
 
 

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Rp {

	public TagName tagname=null;
	public boolean many=false;
	public boolean self=false;
	public boolean parent=false;
	public AttName attname=null;
	public boolean text=false;
	public Rp rp1 = null;
	public Rp rp2 = null;
	public F f = null;
	public String op = null;

	public List<Node> makeText(String s) throws ParserConfigurationException
	{
		List<Node> nodes = new ArrayList<Node>();
		DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
        DocumentBuilder build = dFact.newDocumentBuilder();
        Document doc = build.newDocument();
        Element root = doc.createElement("TEXT");
        doc.appendChild(root);
        root.setTextContent(s);
        nodes.add(root);
//        System.out.println(root.getTagName()+" "+root.getTextContent());
        return nodes;
	}

	public Rp(Rp r1,Rp r2,F f1,String op1,TagName tg1,
			boolean t1,AttName at1,boolean m1, boolean p1,boolean s1)
	{
		System.out.println("Setting text : "+t1);
		this.rp1=r1;
		this.rp2=r2;
		this.f=f1;
		this.text=t1;
		this.attname = at1;
		this.parent=p1;
		this.self=s1;
		this.many=m1;
		this.op = op1;
		this.tagname = tg1;
	}
	
	public List<Node> getChildren(List<Node> n1)
	{
		List<Node> childNodes = new ArrayList<Node>();
		for (int x = 0; x < n1.size(); x++ )
		{
	        Node data = n1.get(x);
			NodeList children = data.getChildNodes();
			for (int k = 0; k < children.getLength(); k++)
			{
				if(children.item(k).getNodeType() == Node.ELEMENT_NODE)
				{
					childNodes.add(children.item(k));
//					System.out.println("Getting children:"+children.item(k).getNodeName());
				}
			}
		}
		return childNodes;
	}

	public List<Node> getDescendants(List<Node> n1)
	{
		List<Node> nodes = new ArrayList<Node>();
//		System.out.println("Getting desc");
		do
		{
			n1 = getChildren(n1);
			nodes.addAll(n1);
		}while(n1.size() != 0);
/*		System.out.println("Got nodes : "+nodes.size());
		for (int i = 0; i < nodes.size(); i++)
			System.out.print(nodes.get(i).getNodeName());*/
		return nodes;
	}
	
	/*
	 * Evaluate function: Returns a list of nodes
	 * Accepts a list of nodes to act upon
	 */
	public List<Node> evaluateTagname(List<Node> n1)
	{
		List<Node> nodes = new ArrayList<Node>();
		System.out.println("Entering tagname for : "+(this.tagname.tagName));
		for (int x = 0; x < n1.size(); x++ )
		{
	        Node data = n1.get(x);
//	        System.out.println(data.getNodeName());
	        if (data.getNodeName().equals(this.tagname.tagName))
	        {
	//        	System.out.println("Node name : "+data.getNodeName());
	        	nodes.add(data);
	        }
		}
		return nodes;
	}
	
	public List<Node> evaluateParent(List<Node> n1)
	{
		List<Node> nodes = new ArrayList<Node>();
//		System.out.println("Entering parent");
		for (int x = 0; x < n1.size(); x++ )
		{
	        Node data = n1.get(x);
//	        data.ge
	  //      System.out.println(data.getNodeName());
	        nodes.add(data.getParentNode());
		}
		return(nodes);
	}
	
/*	public List<Node> evaluateMany(List<Node> n1)
	{
		List<Node> nodes = new ArrayList<Node>();
		System.out.println("Entering parent");
		for (int x = 0; x < n1.size(); x++ )
		{
	        Node data = n1.get(x);
	        System.out.println(data.getNodeName());
	        nodes.add(data.getParentNode());
		}
		return(nodes);
	}
*/
	public List<Node> evaluateR(List<Node> fromNode, List<Node> n1) throws DOMException, ParserConfigurationException
	{
		List<Node> nodes = new ArrayList<Node>();
		System.out.println("Text yes? "+this.text);
		if(this.tagname != null)
		{
//			System.out.println("eval tagname in single");
			nodes.addAll(this.evaluateTagname(n1));
		}
		else if(this.op != null)
		{
			if (this.op.equals("/"))
			{
				List<Node> nodes2 = this.rp1.evaluateSingle(fromNode);
//				System.out.println("Rp1 "+nodes2);
				nodes = this.rp2.evaluateSingle(nodes2);
//				System.out.println("Rp2 "+nodes);
			}
			else if (this.op.equals("//"))
			{
				List<Node> nodes2 = this.rp1.evaluateDouble(fromNode);
		//		System.out.println("Op "+nodes2);
				nodes = this.rp2.evaluateSingle(nodes2);
			}
			if (this.op.equals(","))
			{
			//	System.out.println("Tagname in op "+this.rp1.tagname.tagName);
				List<Node> nodes2 = this.rp1.evaluateSingle(fromNode);
			//	System.out.println("Op "+nodes2);
				nodes = nodes2;
				nodes.addAll(this.rp2.evaluateSingle(fromNode));
			}
		}
		else if(this.self == true)
		{
//			System.out.println("In self");
			nodes = fromNode;
		}
		else if(this.parent)
		{
			nodes = this.evaluateParent(fromNode);
		}
		else if(this.many)
		{
			nodes = n1;
		}
		else if(this.rp1 != null)
		{
			return this.rp1.evaluateSingle(fromNode);
		}
		else if(this.text)
		{
			List<Node> textChild = new ArrayList<Node>();
			System.out.println("Text found!");
			for(int i=0; i<n1.size(); i++)
			{
				System.out.println("Making text node "+n1.get(i).getTextContent());
				//nodes.addAll(makeText(n1.get(i).getTextContent()));
				
				textChild.add(n1.get(i).getFirstChild());
				 
			}
			nodes.addAll(textChild);
		}

		return nodes;

	}
	
	public List<Node> evaluateSingle(List<Node> n1) throws DOMException, ParserConfigurationException
	{
/*		System.out.println("EvaluateSingle on "+n1);
		if (this.tagname != null)
			System.out.println("Entering Rp Evaluate : "+this.tagname.tagName);*/
		List<Node> childNodes = getChildren(n1);
		List<Node> nodes = new ArrayList<Node>();
		if(this.text)
		{
//
			List<Node> textChild = new ArrayList<Node>();
//			System.out.println("Text found!");
			for(int i=0; i<n1.size(); i++)
			{
				  
//				System.out.println("Making text node "+n1.get(i).getTextContent());
				nodes.addAll(makeText(n1.get(i).getTextContent()));
				
				textChild.add(n1.get(i).getFirstChild());
				// 
			}
			//nodes.addAll(textChild);
		}
		else nodes.addAll(evaluateR(n1, childNodes));
        List<Node> result = new ArrayList<Node>();
//        System.out.println("Checking f");
		if(this.f != null)
		{
//			System.out.println("f context found for nodes "+nodes.size());
			for(int x = 0; x < nodes.size(); x++)
			{
//				System.out.println("Calling feval on "+nodes.get(x).getNodeName());
				Node n = (this.f.fEvaluate(nodes.get(x)));
				if(n != null)
					result.add(n);
			}
			return result;
		}
		return nodes;
	}
	
	public List<Node> evaluateDouble(List<Node> n1) throws DOMException, ParserConfigurationException
	{
//		System.out.println("Evaluating double");
		List<Node> desc = getDescendants(n1);
		return evaluateR(n1, desc);
	}
	
}
