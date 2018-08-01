import java.util.*; 
public class JavaExcercise {

	
	

public static void main (String [] args) {
	
	/* Excercise 1 
	 * Write a java program to sum the total of anint array
	 * 
	 * 
	 */
	 int [] array = new int [4]; 
	 array[1] = 23; 
	 array[2] = 34; 
	 array[0] = 22;
	 array[3] = 55; 
	 
	 int sum = 0; 
	 for ( int i = 0; i < array.length; i++) {
		  sum += array[i]; 
		  
	 }
	 System.out.println(sum); 
	 
	
/*Excercise 2 
 Write a Java program to print the following grid.
Expected Output :

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -  
 
 
 */

int [][] a  = new int [10][10];

for (int i = 0; i < 10 ; i++ ) {
	for ( int j = 0; j <10; j++) {
		System.out.print(" " + a[i][j]);
		
	}
	System.out.println();
}

/*Excercise 3 
 *  Write a Java program to calculate the 
 *  average value of array elements. 
 *  
 * 
 */


int  b[] = {10, 50, 30, 12, 45}; 
int sum1 = 0; 
double avg = 0.0; 
	for (int i = 0; i < b.length; i++) {
		sum1 += b[i]; 
		
	}
	avg = sum1 / b.length; 
	System.out.println(avg);
/*Excercise 4 
 * Write a Java program to test if an array contains a specific value.
 * 
 */

	String  greetings[] = {"hi", "Hello", "Bonjour", "Wasssup" , "Bye" }; 
	
	for (int i = 0; i < greetings.length; i++) {
		if (greetings[i].equalsIgnoreCase("bye") ){
			System.out.println(greetings[i] + " is a farewell! Found it!") ;
		}
		else {
			System.out.println(greetings[i] + " is a salutation. Keep looking");
		}
	}

/*Excercise 5
 * Write a Java program to find the index of an array element.
 

	Scanner scan = new Scanner(System.in); 
	String [][] books = new String [2][4];
	books[0][0] = "Dune"; 
	books[0][1] = "Foundation"; 
	books[0][2] = "Welcome to Nightvale"; 
	books[0][3] = "Originals"; 
	books[1][0] = "The Righteous Mind"; 
	books[1][1] = "Alaska"; 
	books[1][2] = "Black Cherry"; 
	books[1][3] = "Call of the Wild";
	
	System.out.println("What book are you looking for amongst these? ");
	System.out.println( "see list" ); 
	
	String answer = scan.nextLine(); 
	
	for (int i = 0; i < books.length; i++ ) {
		for ( int j = 0; j < 3 ; j++) { 
			if ( answer.equalsIgnoreCase(books[i][j])) { 
				System.out.println(books[i][j] + " is on row " + (i+1) + " and in column " + (j+1)); 
			
		 
		}
			else {
			break; 
			}
		
		}
			
		
			}
		
		
		}
		*/
	
			
		
	
	}
			
	
	
	
}

	
	
	
	
	
	


