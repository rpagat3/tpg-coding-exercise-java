package com.tpg.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Student> students = new ArrayList<>();
		Student s1 = new Student(33, "Tina", 3.68);
		Student s2 = new Student(85, "Louis", 3.85);
		Student s3 = new Student(56, "Samil", 3.75);
		Student s4 = new Student(19, "Samar", 3.75);
		Student s5 = new Student(22, "Lorry", 3.76);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		Collections.sort(students, new StudentComparator());
		
		for(Student s : students)
			System.out.println(s);
	}
}
