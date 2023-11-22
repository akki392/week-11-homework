package calculate;

import java.util.Scanner;

public class Calculator {
     int a;
     int b;
    public void addtion(int a,int b) {
        int result = a + b;
        System.out.println(result);
    }
    public void subtraction(int a,int b) {
        int result = a - b;
        System.out.println(result);
    }
    public void multiplication(int a,int b) {
        int result = a * b;
        System.out.println(result);
    }
    public void division(int a,int b) {
        int result = a / b;
        System.out.println(result);
    }
    public void calculateResult() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = scan.nextInt();
        System.out.println("Enter the second number:");
        b= scan.nextInt();
        System.out.println("Enter the symbol(+,-,*,/):");
        char ch= scan.next().charAt(0);

        int result = 0;
        switch (ch) {
            case '+':
                result = a + b;

                System.out.println("Total: "+ result);
                break;

            case '-':
                result = a - b;
                System.out.println("Total: "+ result);
                break;

            case '*':
                result = a * b;
                System.out.println("Total: "+ result);
                break;

            case '/':
                result = a / b;
                System.out.println("Total: "+ result);
                break;

            default:
                System.out.println("Please enter valid input");
                break;

        }
        System.out.println("Would you like to do more calculation please enter 'Y'or'n'?: ");
        Scanner s=new Scanner(System.in);
        char choice = s.next().charAt(0);
        while (choice=='Y'||choice=='y')
        {
            calculateResult();
        }
        while((choice<=9)&&(choice=='N'||choice=='n')) {

            break;
        }

    }
}
