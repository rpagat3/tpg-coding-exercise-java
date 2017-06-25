package com.tpg.question2;

public class Student {
	private int id;
	private String name;
	private double gpa;
	
	public Student(int id, String name, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" ").append(name).append(" ").append(gpa);
		return sb.toString();
	}
	
}
