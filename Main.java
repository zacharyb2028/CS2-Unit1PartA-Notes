 import java.util.Scanner;

/*
This is my comment space!
*/





public class Main {

   public static void main(String []args) {
    
      // we can use println or print to produce output
      System.out.print("Hi ");
      System.out.print("there");
      System.out.print("!");

      // we can print special characters using an escape sequence \
      System.out.println("\"");
      System.out.println("\\");
      System.out.println(" I love computer sicence, \n it is so cool");
      

      System.out.println(" Today we are learning  \n escape sequences");

      // math operators + - * /
      // wehn we do int division, it truncates our answer, it returns an int
      int x = 5;
      int y = 3;

      System.out.println(x/y);

      // % gives us the remainder
      System.out.println(x%y);

      x = 6;
      y = x;
      x = 8;

      // we can also update variable assignment by incrementing and decrementing
      // incrementing adds 1 to our value
      // decrementing subtracts 1 from our value

      x = x + 1;
      // x++ updates our variable even without the equal sign
      x++;
      x = x - 1;
      // x-- updates our variable even without the equal sign
      x--;

    
      // System.out.println("Please type in a name in the input box below.");
      // Scanner scan = new Scanner(System.in);
      // String name = scan.nextLine();
      // System.out.println("Hello " + name);
      // scan.close();


      // Lesson 1.5 Casting
      // We can cast to change data types for variables we have already defines
      int intNum = 4;
      // we cast by including the new data tyoe in () before our variable name
      System.out.println((double) intNum);
      System.out.println(intNum);

      double dbNum = 4.6;
      System.out.println((int) dbNum);

      double negNum = -3.4;
      // when we cast doubles to ints, it truncates our decimal. It does NOT round
      // We can round manually using math!
      // we can round positive numbers by adding .5 and casting
      int roundedPos = (int) (dbNum + .5);
      System.out.println(roundedPos);

      // we can round negative numbers by subtracting .5 and casting
      int roundedNeg = (int) (negNum - .5);
      System.out.println(roundedNeg);

      int grade1 = 85;
      int grade2 = 97;
      int grade3 = 71;
      int sum;
      double average;
      sum = grade1 + grade2 + grade3;
      average = (double) sum / 3;
      System.out.println(average);

      // Lesson 1.6 Compound Assignment Operators
      int peanutButter = 3;
      peanutButter = peanutButter + 2;
      // we can condense our operations with Compound Assignment Operators
      // addition becomes +=
      // the order is always variable operation equals value
      peanutButter += 2;
      peanutButter -= 3;

      // addition and subtraction can also increment and decrement (only goes by 1)
      peanutButter++;
      peanutButter--;

      int score = 0;
      System.out.println(score);

      score++;                   
      System.out.println(score);

      score *= 2;                
      System.out.println(score);

      int penalty = 5;
      score -= penalty / 2;
      System.out.println(score);
      
      score += 3;
      score /= 2;
      System.out.println(score);

   }
}


