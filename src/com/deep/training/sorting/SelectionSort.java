package com.deep.training.sorting;

public class SelectionSort {
	
	int[] selectionSort(int input[]){
		
		
		
		for(int i=0;i<=input.length-1;i++){
			
			
			for(int j=i+1;j<=input.length-1;j++){
				if(input[j]<input[i]){
					//min=j;
					int a=input[i];
					input[i]=input[j];
					input[j]=a;
					
					
					
				}
				else
					continue;
			}
			
		
		}
		
		
		return input;
	}

}
