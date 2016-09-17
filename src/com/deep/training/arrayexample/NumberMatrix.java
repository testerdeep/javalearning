package com.deep.training.arrayexample;

public class NumberMatrix {
	
	public void numbersmatrix(){
		
		int numofRows=3;
		int numofColumns=3;
		int maxNumber=9;
		
		int [][]numberMatrix =new int[numofRows][numofColumns];
		
		for (int rowindex =0; rowindex <numofRows;rowindex++){
			
			for (int columnindex =0;columnindex<numofColumns;columnindex++){
				numberMatrix[rowindex][columnindex]=maxNumber;
				maxNumber--;
				System.out.print(numberMatrix[rowindex][columnindex] +" ");
			}
			System.out.println();
			
		}
		
		System.out.println(numberMatrix.length);
		
	}

}
