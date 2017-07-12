package OverloadingDemo;

public class Worker {
  
	int  id;
    String name;
    int age;
    Worker(int i,String n){ // Created 1st Parameterized Constructor
    id = i;
    name = n;
    }
    Worker(int i,String n,int a){ //  Created 2nd Parameterized Constructor
    id = i;
    name = n;
    age=a;
    }
    void display()
    {
    	System.out.println(id+" "+name+" "+age);
    	}
 
	public static void main(String[] args) {
		
		Worker w1 = new Worker(1455,"Ramu",35); // Created 1st object which will call the 1st constructor
	    Worker w2 = new Worker(6406,"Shyamu",45); // Created 2nd object which will call the 1st constructor
	    w1.display();
	    w2.display();
	   }
	}

