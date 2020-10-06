import java.util.Scanner;
/**
 * create a “multiplication table”
 * @ Gavin 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creaate a Scannner for user input
    Scanner input = new Scanner(System.in);
    
    // ask user for number
    System.out.println("Please enter a number");

    // variable for user input
     int number = input.nextInt();

    // create for loop
      for(int count = 1; count <= number; count++){  
       System.out.print(count + ", ");  
      }

    
  }
}
