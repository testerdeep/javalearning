package com.deep.training.IOexample;

import java.io.*;
import java.nio.charset.Charset;

public class ReaderWriterExample {
	
	public static void main(String arg[]){
		System.out.println(System.getProperty("file.encoding"));
		
	System.out.println(Charset.availableCharsets());
	
	Reader rd= null;
	Writer wr= null;
	
	try {
		 rd= new FileReader(new File("Input.txt"));
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		wr = new FileWriter(new File("Output.txt"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	int byteRead;
	
	try {
		while((byteRead=rd.read())!=-1){
			System.out.println(byteRead);
		wr.write(byteRead);	
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	BufferedReader br=null;
	BufferedWriter bw=null;
	
	try {
		 br= new BufferedReader(new FileReader(new File("Input.txt")));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		try {
			 bw= new BufferedWriter(new FileWriter(new File("Output.txt")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String lineRead;
	try {
		while((lineRead=br.readLine())!=null){
			bw.write(lineRead);
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		br.close();
		bw.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
