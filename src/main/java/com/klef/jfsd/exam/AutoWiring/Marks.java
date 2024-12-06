package com.klef.jfsd.exam.AutoWiring;

public class Marks 
{
	private int id;
	private String name;
	private double Totalmarks;
	
	@Override
	public String toString() {
		return "Marks [id=" + id + ", name=" + name + ", Totalmarks=" + Totalmarks + "]";
	}

	public Marks(int id, String name, double totalmarks) {
		super();
		this.id = id;
		this.name = name;
		Totalmarks = totalmarks;
	}

}
