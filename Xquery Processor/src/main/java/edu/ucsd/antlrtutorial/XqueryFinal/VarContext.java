package edu.ucsd.antlrtutorial.XqueryFinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Node;

public class VarContext {

	public HashMap<String,List<List<Node>>> map = new HashMap<>();

	private static VarContext self = new VarContext();
	
	public static VarContext get() { return self; }
	
	public void putVar (String var, List<Node> n1)
	{
		List<List<Node>> currentList = this.map.get(var);
		if (currentList != null)
			currentList.add(n1);
		else
		{
			currentList = new ArrayList<List<Node>>();
			currentList.add(n1);
		}
		this.map.put(var, currentList);
	}

	public List<Node> getVar (String var)
	{
		List<List<Node>> currentList = this.map.get(var);
		if (currentList == null)
			return null;
		int listIndex = currentList.size() - 1; //index starts from 0, zo subtract 1
		if (listIndex >= 0)
			return currentList.get(listIndex);
		else
			return null;
	}
	
	public void removeVar(String var)
	{
		List<List<Node>> currentList = this.map.get(var);
		if (currentList == null)
			return;
		int listIndex = currentList.size() - 1; //index starts from 0, zo subtract 1
		if (listIndex >= 0)
		{
			currentList.remove(listIndex);
		}
	}

}
