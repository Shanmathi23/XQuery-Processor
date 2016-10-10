package edu.ucsd.antlrtutorial.XqueryFinal;

import java.io.IOException;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Ap  {
	
	public Ap1 ap1 = null;
	public Ap3 ap3 = null;

	public Ap(Ap1 a1, Ap3 a3)
	{
		this.ap1 = a1;
		this.ap3 = a3;
	}
	public List<Node> globalEvaluate() throws ParserConfigurationException, SAXException, IOException
	{
		//System.out.println("In globalEval, ap1 :"+ap1);
		if (this.ap1 != null)
		{
			//System.out.println("Evaluating a1 under ap");
            return this.ap1.evaluate();
		}
		else if (this.ap3 != null)
		{
			//System.out.println("Evaluating a3 under ap");
            return this.ap3.evaluate();
		}
		return null;
	}
}
