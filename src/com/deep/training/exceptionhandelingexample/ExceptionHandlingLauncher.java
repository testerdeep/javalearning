package com.deep.training.exceptionhandelingexample;

public class ExceptionHandlingLauncher {

	public static void main(String args[]) {
		try {
			int[] myindex = new int[9];
			String name = "Deep";
			try {
				int age = Integer.parseInt(name);
				System.out.println(age);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			myindex[10] = 30;
			System.out.println("not reading");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Got exception");
			e.printStackTrace();
		}

		try {
			System.out.println("continue program ewwrvrtve eete r tert r ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println(
					"surround with in eclipse .Select line of codes right click and select surround with and select try catch");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("2nd last finally");
		}
		try {
			ExceptionHandlingExample exp = new ExceptionHandlingExample();
			exp.read();
		}
		catch(NoMoodToStudyException e){
        e.printStackTrace();
        e.toString();
		}
		catch (NoBookAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.toString();
		} finally {
			System.out.println("Finally");
		}

	}

}
