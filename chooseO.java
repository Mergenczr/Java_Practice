import java.util.Scanner;
class MathOperation{

    static int add(int a ,int b){
        return a+b;
    }
    static int sub(int a ,int b){
        return a-b;

    }
    static int div(int a ,int b){
        if(b==0){
            System.out.println("Cannot divide by zero");
            return 0;
    }
        return a/b;

    }
    static int mult(int a ,int b){
        return a*b;

    }
}



public class chooseO {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
    
        char again ='y';

        while(again == 'y'){
            System.out.print("Enter a number: ");
        int in = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
            System.out.print("Enter the operation (*,-,/,+) ");
        char Operation = input.next().charAt(0);
            if(Operation == '+'){
            System.out.println(MathOperation.add(in, number2));
        }
        else if(Operation == '-'){
            System.out.println(MathOperation.sub(in, number2));
        }
        else if(Operation == '/'){
            System.out.println(MathOperation.div(in, number2));
        }
        else if(Operation == '*') {
            System.out.println(MathOperation.mult(in, number2));
        }
        else{
            System.out.println("Invalid operation please Try again");
        }
        System.out.print("Do you want to continue(y/n) ");
        again = input.next().charAt(0);
    }

        input.close();
       

        
       
    }

    
}
