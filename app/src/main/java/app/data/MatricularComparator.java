package app.data;

import app.sort.Comparator;

public class MatricularComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getMatriculationNumber() - o2.getMatriculationNumber() ;
	}

}
