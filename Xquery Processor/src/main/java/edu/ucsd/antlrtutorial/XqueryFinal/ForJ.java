package edu.ucsd.antlrtutorial.XqueryFinal;

import java.util.ArrayList;

public class ForJ {
	ArrayList<Var> varList = null;
	ArrayList<Path> pathList = null;

	public ForJ(ArrayList<Var> varList,ArrayList<Path> xqList)
	{
		this.varList = varList;
		this.pathList = xqList;
	}
	
	public VarContext varCtx = VarContext.get();	

}
