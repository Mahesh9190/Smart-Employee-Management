package com.qsp.view;

import java.util.List;
import java.util.Scanner;

import com.qsp.controller.EmployeeController;
import com.qsp.module.Employee;

public class EmployeeView {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     System.out.println("*****WELCOME TO SMART EMPLOYEE MANAGEMENT SYSTEM*****");
     System.out.println();
     System.out.println();
     do {
    	 System.out.println("1 -> Insert Employee");
    	 System.out.println("2 -> Update Employee name by id");
    	 System.out.println("3 -> Fetch Employee by id ");
    	 System.out.println("4 -> Delete Employee by id ");
    	 System.out.println("5 -> Fetch All employee");
     switch(sc.nextInt()){
     case 1:{
    	 Employee e=new Employee();
    	 System.out.println("Enter Id");
    	 e.setId(sc.nextInt());
    	 
    	 System.out.println("Enter Sal ");
    	 e.setSal(sc.nextDouble());
    	 System.out.println("Enter  Name ");
    	 e.setName(sc.next());
    	 
    	 EmployeeController.insert(e);
    	 System.out.println("Inserted ");
     }
     break;
     case 2: {
    	 System.out.println("Enter Id");
    	 int id=sc.nextInt();
    	 System.out.println("Enter Name ");
    	 String name = sc.next();
    	boolean b= EmployeeController.updateNameById(id,name);
    	if(b) {
    	System.out.println("Successfully Updated");
    	}
    	else
    	{
    		System.out.println("Sorry This Id is not present ");
    	}
     }
     break;
     
     case 3: {
    	 System.out.println("Enter Id ");
    	 Employee e=EmployeeController.fetchById(sc.nextInt());
    	 System.out.println(e);
     }
     break;
     case 4: {
    	 System.out.println("Enter Id :");
    	 boolean b=EmployeeController.deleteById(sc.nextInt());
    	 if(b)
    	 {
    		 System.out.println("Successfully Deleted");
    	 }
    	 else 
    	 {
    		 System.out.println("Sorry This Id is not present.");
    	 }
    	 
     }
     break;
     case 5: {
    	 List<Employee> li=EmployeeController.fetchAll();
    	 for(Employee e:li)
    	 {
    		 System.out.println(e);
    	 }
     }
     break;
     default:
    	 System.out.println("Please select correct option ");
    	 
     }
     System.out.println("Enter "+"Y"+" to continue ");
        
	}while("y".equalsIgnoreCase(sc.next()));
	}

	
		
	}



