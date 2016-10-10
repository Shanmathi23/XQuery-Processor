package edu.ucsd.antlrtutorial.XqueryFinal;

public class Path {
	public Ap xpath = null;
	public Var v = null;
	public Rp rp1= null;

	public VarContext varCtx = VarContext.get();	//Java Singleton pattern object

	public Path(Var v,Ap xpath,Rp rp1)
	{
		this.v = v;
		this.xpath = xpath;
		this.rp1 = rp1;
	}

}
