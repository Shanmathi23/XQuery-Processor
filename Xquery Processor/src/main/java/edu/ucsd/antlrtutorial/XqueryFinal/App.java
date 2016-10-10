package edu.ucsd.antlrtutorial.XqueryFinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
 

 

/**
 * Hello world!
 *
 */
public class App 
{
	public static String nodeToString(Node node) {
	    StringWriter sw = new StringWriter();
	    try {
	      Transformer t = TransformerFactory.newInstance().newTransformer();
	      t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	      t.setOutputProperty(OutputKeys.INDENT, "yes");
	      t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
	      t.transform(new DOMSource(node), new StreamResult(sw));
	    } catch (TransformerException te) {
	      System.out.println("nodeToString Transformer Exception");
	    }
	   	    return sw.toString();
	  }

	public static void main( String[] args ) throws IOException, ParserConfigurationException, SAXException 
    {
    	
		PrintWriter f0 = new PrintWriter(new FileWriter("Output.xml"));
    	BufferedReader br = new BufferedReader(new FileReader(new File("Input.xml")));
    	String line;
    	StringBuilder sb = new StringBuilder();
    	String outputString = null ;
    	while((line=br.readLine())!= null){
    	    sb.append(line);
    	}
    	String in = sb.toString();
    	in.replaceAll("\n",""); 
    	in.replaceAll("\t","");
    	/*while((line=br.readLine())!= null){
    	    sb.append(line.trim());
    	}*/
    	System.out.println("Input is" +in);
    	
    	CharStream ch = new ANTLRInputStream(in);
    	XqueryLexer lexer = new XqueryLexer(ch); 
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XqueryParser p = new XqueryParser(tokens);
        p.setBuildParseTree(true);
        XqueryMyListener hl = new XqueryMyListener();
        p.addParseListener(hl);
        ParserRuleContext t = p.r();

       // Xquery xq = (Xquery)hl.PPTree.get(hl.Root);
        R rule = (R)hl.PPTree.get(hl.Root);
        List<Node> result = rule.globalEvaluate();

        //System.out.println("tag :"+xq.tag);
        
        for (int x=0; x<result.size(); x++)
        {
        	//System.out.println("Node type is "+result.get(x).getFirstChild().getFirstChild().getNodeType()+ " node name is "+result.get(x).getFirstChild().getFirstChild().getNodeName()
        			//+"text is "+ result.get(x).getFirstChild().getFirstChild().getTextContent() );
        	
        	if( result.get(x).getNodeType() == 3 )
        	{
        	outputString =  result.get(x).getTextContent();
        	System.out.println("Output is result node : "+outputString);
        	}
        	else
        	{
        		outputString = nodeToString(result.get(x));
            	System.out.println("Output is result text : "+outputString);
            	
        	}
        	String temp = outputString.replaceAll("(\\n)+( )+<TEXT>","");
        	outputString = temp.replaceAll("</TEXT>\\r( )+","");
		 	f0.println(outputString.replaceAll("",""));
        	 
        }
        /* TODO: write to file */
        	f0.close();	
    }
}
