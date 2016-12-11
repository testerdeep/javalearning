package com.deep.training.sorting;

public class Launcher {
	
	public static void main(String args[]){
		
		BubbleSort bb=new BubbleSort();
		SelectionSort ss=new SelectionSort();
		
		int[] input={5,30,2,56,50,500,345,007};
		//input=bb.bubbleSort(input);
		
		input=ss.selectionSort(input);
		
		for(int i : input){
		System.out.print(i + " ");
		}
		
	}

}
