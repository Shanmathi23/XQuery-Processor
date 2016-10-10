package edu.ucsd.antlrtutorial.XqueryFinal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Ap3 {
	public String File = null;
	public Rp rp = null;

	public Ap3(FileName f, Rp r)
	{
		this.File = f.fileName;
		this.rp= r;
	}
	public List<Node> evaluate() throws ParserConfigurationException, SAXException, IOException
	{
		String f1 = this.File;
		DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new InputSource(f1));
        doc.getDocumentElement().normalize();
//        System.out.println(doc.getDocumentElement().getTagName());
		List<Node> inputNode = new ArrayList<Node>();
        inputNode.add(doc.getDocumentElement());
        //System.out.println("Root node from ap3:"+inputNode.toString());
        return this.rp.evaluateDouble(inputNode);
	}

}
