package com.tpg.question2;

import java.util.Comparator;

/**
 * Sorts students: 
 * <ul><li>According to their GPA in descending order.</li> 
 * <li>If two students have the same GPA, then arrange them according to their first name in alphabetical order.</li> 
 * <li>If those two students also have the same first name, then sort them in ascending order according to their IDs.</li></ul> 
 * <p>Assumption: No two students have the same ID.</p> 
 * @author Rey Pagatpatan
 *
 */
public class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		int gpaResult = Double.compare(o2.getGpa(), o1.getGpa());
		if(gpaResult == 0) {
			int nameResult = o1.getName().compareToIgnoreCase(o2.getName());
			if(nameResult == 0) {
				return o1.getId() - o2.getId();
			} else {
				return nameResult;
			}
		} else { 
			return gpaResult;
		}
	}
}
