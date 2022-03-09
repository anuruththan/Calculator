import java.util.Scanner;

class Calculator {


    public static void main(String[] args) {

        char operator;
        Double number1, number2;

        Scanner input = new Scanner(System.in);

        for(;;){

            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);

            System.out.println("Enter first number");
            number1 = input.nextDouble();


            System.out.println("Enter second number");
            number2 = input.nextDouble();

            calculator(number1,number2,operator);


            System.out.print("If you want to quit the program (yes-press 1 else program will continue):");


            int exit=input.nextInt();


            if(exit==1){

                System.out.println("\nProgram has beed ended.......");
                break;

            }



        }



    }


    static void calculator(Double number1,Double number2,char operator){

        Double result;

        switch (operator) {


            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;



            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;



            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;




            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;


            default:
                System.out.println("Invalid operator!");
                break;


        }


    }

}

