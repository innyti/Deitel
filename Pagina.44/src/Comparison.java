import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number1;
      int number2;

      System.out.println("Enter first integer: ");
      number1 = input.nextInt(); //lê o primeiro número fornecido pelo usuário

      System.out.println("Enter second integer: ");
      number2 = input.nextInt(); //lê o segundo número fornecido pelo usuário

      if (number1 == number2){
          System.out.printf("%d == %d\n", number1, number2);
      }

      if (number1 != number2){
          System.out.printf("%d != %d\n", number1, number2);
      }

      if (number1 < number2){
          System.out.printf("%d < %d\n", number1, number2);
      }

      if (number1 > number2){
          System.out.printf("%d > %d\n", number1, number2);
      }

      if (number1 <= number2){
          System.out.printf("%d <= %d\n", number1, number2);
      }

      if (number1 >= number2){
          System.out.printf("%d >= %d\n", number1, number2);
      }
    }
}