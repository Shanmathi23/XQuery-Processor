package edu.ucsd.antlrtutorial.XqueryFinal;

public class CondJ {
	public CondJ cond1 = null;
	public CondJ cond2 = null;
	public String op = null;
	public Var v1 = null;
	public Var v2 = null;
	public String StringConstant = null;

	public CondJ(CondJ cond1,CondJ cond2 ,String op, Var v1, Var v2, String StringConstant)
	{
		this.cond1 = cond1;
		this.cond2 = cond2;
		this.op = op;
		this.v1 = v1;
		this.v2 = v2;
		this.StringConstant = StringConstant;
	}
}
