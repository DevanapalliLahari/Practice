package com.xworkz.search;


import java.util.ArrayList;
import java.util.List;

public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS dFS=new DFS(10);
		dFS.insertEdge(0, 4);
		dFS.insertEdge(0, 7);
		dFS.insertEdge(1, 8);
		dFS.insertEdge(1, 4);
		dFS.insertEdge(2, 9);
		dFS.insertEdge(2,5);
		dFS.insertEdge(3, 6);
		dFS.insertEdge(3, 8);
		System.out.println("The DFS transversal of the given  gragh starting from node 0 is:");
	    dFS.dFS(0);
	}
private int vertex;
private List<List<Integer>>adj;
public DFS(int vertex)
{
	this.vertex=vertex;
    adj = new ArrayList<>();
	for(int i=0;i<vertex;i++)
    adj.add(new ArrayList<>());

}
	public void insertEdge(int vertex1,int vertex2)
	{
		adj.get(vertex2).add(vertex1);
		adj.get(vertex1).add(vertex2);
	}
	public void dFSHelper(int vertex1,boolean visited[])
	{
		visited[vertex1]=true;
		System.out.println(vertex1+" ");
		for(int vertex2:adj.get(vertex1))
			if(!visited[vertex2])
			{
				dFSHelper(vertex2,visited);
			}
	}
	public void dFS(int vertex1)
	{
		boolean[]visited=new boolean[vertex];
		dFSHelper(vertex1,visited);
		
	}

}
