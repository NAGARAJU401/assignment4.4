package TestDemo;

import java.util.Scanner;

//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
public class Demo {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	public static void main(String[] args) {
	//Public is a keyword that is used as an access modifier for methods and variables.
	//static used to prepare a field,method or inner classes as a class field.
	//void: it is void if the method does not return a value.
	//main:it is a function name When a program starts running, it has to start execution from somewhere.
	//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
	// TODO Auto-generated method stub
		//System.out.println(Integer.parseInt(args[0]));
		//we are checking whether we gave zero or not
		//int n1=Integer.parseInt(args[0]);
		//system : system is a class in java language.lang package
		//out : out is the static member of system class.It's type PrintStream
		//println: which is used to print the output.
		int n1 = 0;//to initialize the variables.
	      if(n1==0){
	    	  System.out.println("you have entered zero");
	    	//system : system is a class in java language.lang package
	  		//out : out is the static member of system class.It's type PrintStream
	  		//println: which is used to print the output.
	    	  String char1=null;
		      //taking ASCII value ha null it prints as null
		      System.out.println("ASCII value of n is"+(char1));
		    //system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
		    //prints the ASCII value
	      }
		else if(n1<0)
	//if we pass negative arguments it will show negative value
		{
			System.out.println("you have entered negative values");
			//system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
		}else////to test various conditions
		{
			//positive arguments
			System.out.println("you have entered positive values");
		}
		   Scanner in=new Scanner(System.in);//we are using scanner to initialize the input values
		    
		   System.out.print("Enter the marks of Physics");
		   int num1=in.nextInt();
		   
		   System.out.print("Enter the marks of Chemistry");
		   int num2=in.nextInt();
		   
		   System.out.print("Enter the marks of Maths");
		   int num3=in.nextInt();
		    
		   int physics=num1,chemistry=num2,maths=num3,average;
		   //after intializing the marks it calculate the average value
		   
		   average=(physics+chemistry+maths)/3;
		    if(average>=70)
		    	//here we are using if average grater than or equal to 70
		    {
		    	//if the value is equal to input then it show the grade
		    	System.out.println("Grade A");
		    	//system : system is a class in java language.lang package
			  	//out : out is the static member of system class.It's type PrintStream
			  	//println: which is used to print the output.
		    }
	 
    if((average>=60) && (average<70))
    {
    	System.out.println("Grade B");
    }
    if(average<60)//if average grater than or equal to 60
    {
    	System.out.println("Grade C");
    	//system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.


    }

}
}
