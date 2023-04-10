package DataStructure;

import java.util.Scanner;


public class mainClass 
{
	Scanner sc=new Scanner(System.in);
	public void getChoiceOne(){
		int choice;
		dsArray myArray = new dsArray(2);
		boolean flag=true;
		try {
			do {
				System.out.println("--------Array Implementation-------"); 
				System.out.println("1:Insert():");
				System.out.println("2:Display():");
				System.out.println("3:Delete():");
				System.out.println("4:Peek():");
				System.out.println("5:Search():");
				System.out.println("6:Update()");
				System.out.println("7:Exit");
					
				System.out.println("Enter choices:");
				choice=sc.nextInt();
	
				switch (choice)
				{
				case 1:
					System.out.println("Enter size of an array");
					int n=sc.nextInt();
					System.out.println("Enter elements of an array");
					for(int i=0;i<n;i++) 
					{
						myArray.insertItem(sc.nextInt()); 
					}
					break;
				case 2:
					myArray.printElements();
					break; 
				case 3:
					System.out.println("After pop:");           
					myArray.deleteElement();
					myArray.printElements();
					break;
				case 4:        
					System.out.println("Peek Element:"+myArray.peek()); 
					myArray.printElements();
					break;     	    	 
				case 5:
					System.out.println("Enter index for search:");
					myArray.searchElement(sc.nextInt());
					break;
				case 6:System.out.println("Enter element for update() :");
					int num=sc.nextInt();
					System.out.println("Enter Index:");
					int index=sc.nextInt();							
					myArray.updateElement(index,num);
					myArray.printElements();
					break;
				case 7:
					flag=false;
				}
			}while(flag);
		}catch(Exception e) {
			System.out.println("Exception thrown!...");
		}
	}
	
	public void getChoiceTwo(){
		int stackChoice;
		dsStack myStack = new dsStack(2);
		boolean set=true;
		try {
			do {
				System.out.println("--------Stack Implementation-------"); 
				System.out.println("1:Push():");
				System.out.println("2:Display():");
				System.out.println("3:Pop():");
				System.out.println("4:Peek():");
				System.out.println("5:Search():");
				System.out.println("6:Update()");
				System.out.println("7:Exit");	    		
				System.out.println("Enter choices:");
				stackChoice=sc.nextInt();   	 		    
		 
				switch(stackChoice) {   	    	 
					case 1:
						System.out.println("Enter size of an Stack");
						int n=sc.nextInt();
						System.out.println("Enter elements of an Stack");
						for(int i=0;i<n;i++) 
						{
							myStack.insertItem(sc.nextInt()); 
						}
						break;
					case 2:
						myStack.printElements();
						break;
					case 3:
						System.out.println("After pop:");
						myStack.deleteElement();
						myStack.printElements();
						break;
					case 4:
						System.out.println(myStack.peek());
						myStack.printElements();
						break;
					case 5:
						System.out.println("Enter index for search:");
						myStack.searchElement(sc.nextInt());
						break;
					case 6:System.out.println("Enter element for update() :");
						int num=sc.nextInt();
						System.out.println("Enter Index:");
						int index=sc.nextInt();
						
						myStack.updateElement(index,num);
						myStack.printElements();
						break;
					case 7:
						set=false;
				}
			}while(set);
		}catch(Exception e) {
			System.out.println("Exception thrown!...");
		}
	}
	
	public void getChoiceThree(){
		int chNum;
		dsQueue myQueue = new dsQueue(2);
		boolean queueOp=true;
		try {
			do { 
				System.out.println("--------Queue Implementation-------"); 
				System.out.println("1:enQueue():");
				System.out.println("2:Display():");
				System.out.println("3:deQueue():");
				System.out.println("4:Peek():");
				System.out.println("5:Search():");
				System.out.println("6:Update()");
				System.out.println("7:Exit");
					
				System.out.println("Enter choices:");
				chNum=sc.nextInt();
	
				switch (chNum)
				{ 
				case 1:
					System.out.println("Enter size of an Queue");
					int n=sc.nextInt();
					System.out.println("Enter elements of an Queue");
					for(int i=0;i<n;i++) 
					{
						myQueue.enQueue(sc.nextInt()); 
					}
					break;
				case 2:
					myQueue.printElements();
					break;						 
				case 3:
					System.out.println("After deQueue:");           
					myQueue.deQueue(); 
					myQueue.printElements();
					break;
				case 4:       
					System.out.println("Peek Element:"+myQueue.peek());
					myQueue.printElements();
					break;								 
				case 5:
					System.out.println("Enter index for search:");
					myQueue.Search(sc.nextInt());
					break;
				case 6:System.out.println("Enter element for update() :");
					int num=sc.nextInt();
					System.out.println("Enter Index:");
					int index=sc.nextInt();
					
					myQueue.updateElement(index,num);
					myQueue.printElements();
					break;
				 case 7:queueOp=false;
				}
			}while(queueOp);
		}catch(Exception e) {
			System.out.println("Exception thrown!...");
		}
	}
	
	public void getChoiceFour(){
		int chNo;
		dsLinkList la=new dsLinkList();
		boolean opLink=true;
		try {
			do {
				System.out.println("--------LinedList Implementation-------"); 
				System.out.println(" 1.Insert()");
				System.out.println("2.Update");
				System.out.println("3.Delete");
				System.out.println("4.Search");
				System.out.println("5.Exit");
				System.out.println("Enter choice");
				chNo=sc.nextInt();

				switch(chNo) {
					case 1:
						System.out.println("Enter size of an LinkedList");
						 int n=sc.nextInt();
						 System.out.println("Enter elements of an LinkedList");
						 for(int i=0;i<n;i++) 
						 {
							la.insertFirst(sc.nextInt());
						 }
						la.Display();           	    	
						break;
					case 2:
						System.out.println("Enter Index:");
						int index=sc.nextInt();
						System.out.println("Enter number:");
						int num=sc.nextInt();
						la.insert(index, num);
						la.Display();
						break;
					case 3:
						System.out.println("Enter Index:");
						int in=sc.nextInt();
						la.delete(in);
						la.Display();
						break;
					case 4:
						System.out.println("Enter number:");
						int Num=sc.nextInt();
						la.find(Num);
					case 5:
						opLink=false;
				}
			}while(opLink);
		}catch(Exception e) {
			System.out.println("Exception thrown!...");
		}
	}
	
	public void MainMenu() {
		int Choice;
		do{
			dsMainClass s1=new dsMainClass();
			Scanner sc=new Scanner(System.in);
			System.out.println("Data Structure:");
			System.out.println("1:Array");
			System.out.println("2:Stack");
			System.out.println("3:Queue");
			System.out.println("4:LinkedList");
			System.out.println("5:Exit");
			System.out.println("Enter choices:");
			Choice=sc.nextInt();
			switch(Choice)
			{
			
				case 1:getChoiceOne();
					break;
				case 2:getChoiceTwo();
					break;
				case 3:getChoiceThree();   
					break;
				case 4:getChoiceFour();
					break;
				case 5:System.exit(5);
					break;
			}
		}while(Choice!=5);
	
	}}
