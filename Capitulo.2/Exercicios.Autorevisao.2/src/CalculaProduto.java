import java.util.Scanner;
public class CalculaProduto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, y, z, result;

        System.out.println(" Enter first integer: ");
        x = input.nextInt();

        System.out.println(" Enter second integer: ");
        y = input.nextInt();

        System.out.println(" Enter third integer: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("Product is %d", result);
    }//aqui acaba p metodo main
}//aqui acaba a classe CalculaProduto
