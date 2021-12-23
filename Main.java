import java.util.Scanner;    // Needed for the Scanner class

class Main {
  public static void main(String[] args) {
    //AND, OR and NOT, are denoted by the symbols &&, || and !.
    int year;    // holds a year

      // Create a Scanner object for keyboard input.
      Scanner console = new Scanner(System.in);

      // Get the year.
      System.out.print("Enter a year : ");
      year = console.nextInt();

      // Determine whether the year is leap year.
      if ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0)))
      {
         System.out.println("A leap year");
      }
      else
      {
         System.out.println("Not a leap year");
      }
      int num1, num2, num3;    // holds three integers
      int max;                 // holds maximum value

      // Create a Scanner object for keyboard input.
    

      // Get theee integers.
      System.out.print("Enter three integers : ");
      num1 = console.nextInt();
      num2 = console.nextInt();
      num3 = console.nextInt();

      // Determine the maximum number
      if ((num1 > num2) && (num1 > num3))
      {
         max = num1;
      }
      else if (num2 > num3)
      {
         max = num2;
      }
      else
      {
         max = num3;
      }

      // Display the maximum number
      System.out.println("Maximum is " + max);
   }
}
  