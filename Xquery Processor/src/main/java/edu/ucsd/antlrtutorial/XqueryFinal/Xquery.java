package edu.ucsd.antlrtutorial.XqueryFinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Xquery
{
	public Var v = null;
	public String StringConstant = null;
	public Ap xpath = null;
	public Xquery xq1 = null;
	public Xquery xq2 = null;
	public Rp rp1= null;
	public ForClause for1 = null;
	public LetClause let1 = null;
	public WhereClause where1 = null;
	public ReturnClause return1 = null;
	public String xquery = null;
	public String op = null;
	public String tag = null;
	

	public VarContext varCtx = VarContext.get();	//Java Singleton pattern object
	public List<Node> globalResult = new ArrayList<Node>();

	public Xquery(String s)
	{
		this.xquery = null;
	}
	
	public Xquery(Var v,String StringConstant,Ap xpath,Xquery xq1,Xquery xq2,
			Rp rp1,ForClause for1,LetClause let1,WhereClause where1,ReturnClause return1,String op,String tag)
	{
		this.v = v;
		this.StringConstant = StringConstant;
		this.xpath = xpath;
		this.xq1 = xq1;
		this.xq2 = xq2;
		this.rp1 = rp1;
		this.for1 = for1;
		this.let1 = let1;
		this.where1 = where1;
		this.return1 = return1;
		this.op = op;
		this.tag = tag;
	}
	
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
       System.out.println(" TEXT "+root.getTagName()+" "+root.getTextContent());
        return nodes;
	}
	
	public List<Node> makeElem(String tag, List<Node> n1) throws ParserConfigurationException
	{
		List<Node> nodes = new ArrayList<Node>();
		DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
        DocumentBuilder build = dFact.newDocumentBuilder();
        Document doc = build.newDocument();
        Element root = doc.createElement(tag);
        doc.appendChild(root);
        for (int x = 0; x<n1.size(); x++)
        {
        	Node importedNode = doc.importNode(n1.get(x), true);
        	root.appendChild(importedNode);
        }
        nodes.add(root);
		return nodes;
	}
	
	public void writeFile(String yourXML) throws IOException{
	    BufferedWriter out = new BufferedWriter(new FileWriter("Output.xml"));
	    try { 
	        out.write(yourXML);
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        out.close();
	    }
	}
		
		
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
		
		public void stringToDom(String xmlSource) throws SAXException, ParserConfigurationException, IOException, TransformerException{
		    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder builder = factory.newDocumentBuilder();
		    Document doc = builder.parse(new InputSource(new StringReader(xmlSource)));
		    // Use a Transformer for output
		    TransformerFactory tFactory = TransformerFactory.newInstance();
		    Transformer transformer = tFactory.newTransformer();

		    DOMSource source = new DOMSource(doc);
		    StreamResult result = new StreamResult(new File("Output.xml"));
		    transformer.transform(source, result);
		}  
		
	
	
	
	
	public void evalFor(int varIndex) throws ParserConfigurationException, SAXException, IOException
	{
//	 	System.out.println("VarIndex : "+varIndex);
		if (this.for1.xqList == null || varIndex >= this.for1.xqList.size())
			return;
		//PrintWriter f0 = new PrintWriter(new FileWriter("Output.xml"));
		List<Node> temp = new ArrayList<Node>();
		System.out.println("variable : "+this.for1.varList.get(varIndex).variable+" index: "+varIndex);
		List<Node> variableNodes = this.for1.xqList.get(varIndex).xEvaluate();
		for(int i=0; i<variableNodes.size(); i++)
		{
			if (temp.size() != 0)
				temp.remove(0);
			temp.add(variableNodes.get(i));	//list of single node
			varCtx.removeVar(this.for1.varList.get(varIndex).variable);
/*			System.out.println("VarIndex : "+varIndex+ " value in context "+
					this.for1.varList.get(varIndex).variable+" ctx: "
					+varCtx.getVar(this.for1.varList.get(varIndex).variable));*/
			varCtx.putVar(this.for1.varList.get(varIndex).variable, temp);
			System.out.println("putting varctx : "+temp.get(0).getNodeName()+ " in "+this.for1.varList.get(varIndex).variable+" indexFor : "+i);
			if(temp.get(0).getNodeName().equals("SCENE"))
			{
				System.out.println("Scenes : "+temp.get(0).getFirstChild().getTextContent());
			}
			if (varIndex+1 < this.for1.xqList.size())
			{
				System.out.println("***********");
				evalFor(varIndex+1);
			}
			else
			{
				if(this.let1 != null)
				{
					this.let1.evaluateLet();
				}
				if(this.where1 == null)
				{
					List<Node> result = this.return1.evaluateReturn();
					System.out.println("Where is null");
					if(result != null)
					{
//						varCtx.putVar("Result",result);	//list of list of single nodes
						globalResult.addAll(result);
/*						System.out.println("result where :"+varCtx.getVar("Result").get(0));
						System.out.println("result SIZE:"+result.size());
						for (int x=0; x<result.size(); x++)
						{
							outputString = nodeToString(varCtx.getVar("Result").get(0));
							System.out.println("Output is : "+outputString);
							f0.println(outputString);
						}*/
					}
				}
				else
				{
					System.out.println("Where was not null");
					if(this.where1.whereEvaluate())
					{
						System.out.println("Where eval was true");
						List<Node> result = this.return1.evaluateReturn();
						if(result != null)
						{
							globalResult.addAll(result);

/*							varCtx.putVar("Result",result);	//list of list of single nodes
							System.out.println("result where :"+varCtx.getVar("Result").get(0));
							System.out.println("result SIZE:"+result.size());
							for (int x=0; x<result.size(); x++)
							{
								outputString = nodeToString(varCtx.getVar("Result").get(0));
								System.out.println("Output is : "+outputString);
								f0.println(outputString);
							}
*/						
						//writeFile(FinalOutput);
						}
					}
					else System.out.println("Where eval was false");
	//				else return;
//					System.out.println("result where3 :"+varCtx.getVar("Result").get(0).getTextContent());
				}
				System.out.println("result where4");
			}
			System.out.println("result where5");
		}
		System.out.println("result where6");
		//f0.close();	
	}
	
	public List<Node> xEvaluate() throws ParserConfigurationException, SAXException, IOException
	{
		/* TODO: how to implement xq. Cases:
		 * 		1. var
		 * 		2. ap
		 * 		3. op: xq (, or / or //) xq
		 * 		4. tagname
		 * 		5. for (let)? (where)? return
		 * 		6. let xq 
		 */
		List<Node> nodes = new ArrayList<Node>();
		if (this.v != null)
		{
			nodes = varCtx.getVar(this.v.variable);
		}
		else if(this.xpath != null)
		{
			nodes = this.xpath.globalEvaluate();
		}
		else if(this.op != null)
		{
			if(this.op.equals(","))
			{
				nodes.addAll(this.xq1.xEvaluate());
				nodes.addAll(this.xq2.xEvaluate());
			}
			else if(this.op.equals("/"))
			{
				List<Node> n1 = this.xq1.xEvaluate();
				nodes = this.rp1.evaluateSingle(n1);
			}
			else if(this.op.equals("//"))
			{
				List<Node> n1 = this.xq1.xEvaluate();
				nodes = this.rp1.evaluateDouble(n1);
			}
		}
		else if(this.tag != null)
		{
			nodes = makeElem(this.tag, this.xq1.xEvaluate());
		}
		else if(this.for1 != null)
		{
			System.out.println("found for!");
			this.evalFor(0);
			//System.out.println(varCtx.getVar("Res").get(0).getTextContent());
			/* TODO: Check for "Res" nodes in varCtx and return those nodes
			 * */
			if(globalResult.size() != 0)
			{
//				for (int i = 0; i<globalResult.size(); i++)
				System.out.println("globalresult : "+globalResult);//.get(i).getTextContent());
				nodes.addAll(globalResult);
				globalResult.clear();
			}
		}
		
		else if(this.StringConstant != null)
		{
			System.out.println("String Const");
			nodes = this.makeText(this.StringConstant);
		}
		else	//bracket case
		{
			nodes.addAll(this.xq1.xEvaluate());
		}
		List<Node> uniqueResult = new ArrayList<Node>(new LinkedHashSet<Node>(nodes));
		for(int i = 0; i<uniqueResult.size(); i++)
		{
			if(uniqueResult.get(i)!=null)
			{
				if(uniqueResult.get(i).toString().contains("TEXT"))
					System.out.println("unique res: "+i+" "+uniqueResult.get(i).getTextContent());
				else
					System.out.println("unique res: "+i+" "+uniqueResult.get(i));	
			}
		}
		return uniqueResult;
//		return nodes;
	}
	
}