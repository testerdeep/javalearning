package com.deep.training.keyword;

public class DallasInstitute extends Institute {
	
 DallasInstitute(){
	 System.out.println("DallasInstitute");
 }

 @Override
 void startBatch(){
	 System.out.println("Starting Batch in Dallas Institute");
	 
 }
 
 @Override
 JavaStudent startBatch(String subject){
	 System.out.println("Startng batch at dallas institute of subject:" +subject);
	 return(new JavaStudent());
 }
}
