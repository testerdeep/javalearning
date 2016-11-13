package com.deep.training.comparableexample;

import java.util.Comparator;

public class StuComparator implements Comparator<StuMarks> {

	@Override
	public int compare(StuMarks Stu1, StuMarks Stu2) {
		// TODO Auto-generated method stub
		if(Stu1.getMarks()>Stu2.getMarks()){
			return 1;
		}
		
		else if (Stu1.getMarks()==Stu2.getMarks()){
			return 0;
		}
		else{
			return -1;
		}
		
		
	}

}
