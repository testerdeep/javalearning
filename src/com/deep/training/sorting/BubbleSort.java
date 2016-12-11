package com.deep.training.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
	
	int[] bubbleSort(int input[]){
		
	int len =input.length;
	
	for(int i=0;i<=len-1;i++){
		
		for(int j=0;j<=len-2;j++){
			
			if(input[j] > input[j+1]){
			
				 int a=input[j+1];
				 input[j+1]=input[j];
				 input[j]=a;
			}
			
		}
		
	}
		
		
		
		return input;
	}
	
	

}
