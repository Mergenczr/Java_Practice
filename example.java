import java.util.Scanner;
class MathOperation{

    static int add(int a ,int b){
        return a+b;
    }
    static int sub(int a ,int b){
        return a-b;

    }
    static int div(int a ,int b){
        return a/b;

    }
    static int mult(int a ,int b){
        return a*b;

    }
}



public class example {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int in = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        
        System.out.println("Sum is " + MathOperation.add(in, number2));
         System.out.println("difference " + MathOperation.sub(in, number2));
          System.out.println("fraction " + MathOperation.div(in, number2));
           System.out.println("product " + MathOperation.mult(in,number2));
    }
    input.close();

    
}
