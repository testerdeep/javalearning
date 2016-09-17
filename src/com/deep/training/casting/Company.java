package com.deep.training.casting;

public class Company {
	
	void doAppraisal(Manager manager){
		manager.getRating();
		
		if (manager instanceof QaManager){
			QaManager mgr= (QaManager)manager;
			mgr.qaRating();
		}
	}
	
public static void main(String args[]){
	
	Object obj = new Manager();
	Manager mobj=(Manager)obj;
	
	
	Manager mobjone= new ProductManager();
	ProductManager pmobj=(ProductManager)mobjone;
	
	pmobj=(ProductManager)mobjone;
	
	mobjone=pmobj;
	
	Manager mobj1=new ProductManager();
	Manager mobj2=new QaManager();
	
	ProductManager pm =new ProductManager();
	QaManager qm= new QaManager();
	
	pm=(ProductManager)mobj1;
	qm=(QaManager)mobj2;
	
	//pm=(ProductManager)mobj;
	//qm=(QaManager)mobj;
	
	//Manager manager=new Manager();
	//Manager manager=new ProductManager();
	
	Manager manager=new QaManager();
	
	/*if (manager instanceof Manager){
		System.out.println("Pointing to manager");
	}*/
	 if(manager instanceof ProductManager){
		System.out.println("Pointing to product manager");
	}
	else if(manager instanceof QaManager){
		System.out.println("Pointing to QA manager");
	}
	
	 
	 Company comp=new Company();
	 
	 comp.doAppraisal(manager);
	
}
	
}
