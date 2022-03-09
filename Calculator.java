import java.util.Scanner;

public class Calculator{


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


    private static void calculator(Double number1,Double number2,char operator){

        Double result;

        switch (operator) {


            case '+':
                    addition(number1,number2);
                break;



            case '-':
                substraction(number1,number2);
                break;



            case '*':
                multiplication(number1,number2);
                break;




            case '/':
                divition(number1,number2);
                break;


            default:
                System.out.println("Invalid operator!");
                break;


        }


    }

    private static void addition(Double number1,Double number2){
        Double result;
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    private static void substraction(Double number1,Double number2){
        Double result;
        result = number1 - number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    private static void multiplication(Double number1,Double number2){
        Double result;
        result = number1 * number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    private static void divition(Double number1,Double number2){
        Double result;
        result = number1 / number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

}

