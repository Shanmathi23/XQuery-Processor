package edu.ucsd.antlrtutorial.XqueryFinal;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class R {
	public Oxquery oxq = null;
	public Xquery xq = null;

	public R(Xquery xq, Oxquery oxq)
	{
		this.oxq = oxq;
		this.xq = xq;
	}

	public List<Node> globalEvaluate() throws ParserConfigurationException, SAXException, IOException
	{
		//System.out.println("In globalEval, ap1 :"+ap1);
		if (this.xq != null)
		{
			//System.out.println("Evaluating a1 under ap");
            return this.xq.xEvaluate();
		}
		else if (this.oxq != null)
		{
			//System.out.println("Evaluating a3 under ap");
            //return this.ap3.evaluate();
		}
		return null;
	}

}
