package edu.ucsd.antlrtutorial.XqueryFinal;

public class ReturnJ {
	public Var v = null;
	public String op = null;
	public String tag = null;
	public ReturnJ r1 = null;
	public ReturnJ r2 = null;
	public Path p = null;
	
	public ReturnJ(Var v,ReturnJ r1,ReturnJ r2,String op,String tag,Path p)
	{
		this.v = v;
		this.r1 = r1;
		this.r2 = r2;
		this.op = op;
		this.tag = tag;
		this.p = p;
	}

}
