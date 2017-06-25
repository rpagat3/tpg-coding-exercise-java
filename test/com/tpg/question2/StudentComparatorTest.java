package com.tpg.question2;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class StudentComparatorTest {

	@Test
	public void testCompare() {
		// Given
		List<Student> actualStudents = new ArrayList<>();
		Student s1 = new Student(33, "Tina", 3.68);
		Student s2 = new Student(85, "Louis", 3.85);
		Student s3 = new Student(56, "Samil", 3.75);
		Student s4 = new Student(19, "Samar", 3.75);
		Student s5 = new Student(22, "Lorry", 3.76);
		
		actualStudents.add(s1);
		actualStudents.add(s2);
		actualStudents.add(s3);
		actualStudents.add(s4);
		actualStudents.add(s5);
				
		// When
		Collections.sort(actualStudents, new StudentComparator());
		
		// Then
		List<Student> expectedStudents = new ArrayList<>();
		expectedStudents.add(s2);
		expectedStudents.add(s5);
		expectedStudents.add(s4);
		expectedStudents.add(s3);
		expectedStudents.add(s1);
		assertThat(actualStudents, is(expectedStudents));
	}

	@Test
	public void testCompareWithTheSameName() {
		// Given
		List<Student> actualStudents = new ArrayList<>();
		Student s1 = new Student(33, "Tina", 3.68);
		Student s2 = new Student(85, "Louis", 3.85);
		Student s3 = new Student(19, "Samil", 3.75);
		Student s4 = new Student(56, "Samil", 3.75);
		Student s5 = new Student(22, "Lorry", 3.76);
		
		actualStudents.add(s1);
		actualStudents.add(s2);
		actualStudents.add(s3);
		actualStudents.add(s4);
		actualStudents.add(s5);
				
		// When
		Collections.sort(actualStudents, new StudentComparator());
		
		// Then
		List<Student> expectedStudents = new ArrayList<>();
		expectedStudents.add(s2);
		expectedStudents.add(s5);
		expectedStudents.add(s3);
		expectedStudents.add(s4);
		expectedStudents.add(s1);
		assertThat(actualStudents, is(expectedStudents));
	}
}
