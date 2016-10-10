package edu.ucsd.antlrtutorial.XqueryFinal;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

public class Oxquery {
	public ForJ f1 = null;
	public ReturnJ r1 = null;
	public CondJ c1 = null;
	
//oxq: 'for' forJ 'where' condJ 'return' returnJ ;
	public VarContext varCtx = VarContext.get();	//Java Singleton pattern object
	
	public Oxquery(ForJ f1,CondJ c1,ReturnJ r1)
	{
		this.f1 = f1;
		this.r1 = r1;
		this.c1 = c1;
	}
	

}
