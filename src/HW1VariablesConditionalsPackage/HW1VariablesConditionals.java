package HW1VariablesConditionalsPackage;

public class HW1VariablesConditionals {

	public static void main(String[] args) {

//	    Write an if/else statement for the following requirements:
//	        If student gets 90 or higher: console log  A
//	        If students get 80 or above: console log B
//	        If students get 70 or above: console log C
//	        If students get 55 or above: console log D
//	        Any grade lower than 55 is F
		
		int grade = 80;
		if(grade >= 90) {
			System.out.println("A");
		} else if(grade >= 80) {
			System.out.println("B");
		} else if(grade >= 70) {
			System.out.println("C");
		} else if(grade >= 55) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
//	    Using switch case, do the following:
//	        Store a number between 1-7
//	        If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
//	        Anything other than 1-7 would default to "Invalid Input"
		int numDay = 7;
		switch(numDay) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
			System.out.println("Tuesday");
		    break;
		  case 3:
				System.out.println("Wednesday");
			    break;
		  case 4:
				System.out.println("Thursday"); 
			    break;
		  case 5:
				System.out.println("Friday");
			    break;
		  case 6:
				System.out.println("Saturday");
			    break;
		  case 7:
				System.out.println("Sunday");
			    break;
		  default:
			System.out.println("Sorry Invalid Input, enter a number from 1-7");
		}

//	    Store a number in a variable called num and write an if statement: 
//	        If num is odd, display "Cool"
//	        If num is even and between 2-5, display "Not Cool"
//	        If num is even and between 6-20, display "Cool"
//	        If num is even and greater than 20, display "Not Cool
		int num = 5;
		if((num % 2 != 0) || (num % 2 == 0 || (num >= 6 && num <= 20))) {
			System.out.print("Cool");
		}
		
		if((num % 2 == 0 || num > 20) || (num % 2 == 0 || (num >= 2 && num <= 5))) {
			System.out.print("Not Cool");
		}


	}

}
