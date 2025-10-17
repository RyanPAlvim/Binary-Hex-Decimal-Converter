import java.util.Scanner;

import br.com.numcoverter.numsys.*;

public class Converter {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("1 - Decimal");
        System.out.println("2 - Hex");
        System.out.println("3 - Binary");
        System.out.print("Choose the number system of your input: ");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        switch (choice) {
            case 1:
                System.out.println("1 - Hex");
                System.out.println("2 - Binary");
                System.out.print("Choose the number system that you wanna covert it to: ");
                int choice1 = keyboard.nextInt();
                keyboard.nextLine();

                if(choice1 == 1){

                }
                else if(choice1 == 2){
                    int decimalNum = keyboard.nextInt();
                    System.out.println("The number in a binary form is: " + Decimal.toBinary(decimalNum));
                }
                else
                {
                    System.out.println("This is not a valid option.");
                }

                break;
        
            case 2:
                System.out.println("1 - Decimal");
                System.out.println("2 - Binary");
                System.out.print("Choose the number system that you wanna covert it to: ");
                int choice2 = keyboard.nextInt();
                keyboard.nextLine();

                if(choice2 == 1){
                    String hexNum = keyboard.nextLine();
                    System.out.println("The number in a decimal form is: " + Hexadecimal.toDecimal(hexNum));
                }
                else if(choice2 == 2){

                }
                else
                {
                    System.out.println("This is not a valid option.");
                }

                break;
        
            case 3:
                System.out.println("1 - Decimal");
                System.out.println("2 - Hex");
                System.out.print("Choose the number system that you wanna covert it to: ");
                int choice3 = keyboard.nextInt();
                keyboard.nextLine();

                if(choice3 == 1){
                    String binaryNum = keyboard.nextLine();
                    
                    System.out.println("The number in a decimal form is: " + Binary.toDecimal(binaryNum));
                }
                else if(choice3 == 2){

                }
                else
                {
                    System.out.println("This is not a valid option.");
                }

                break;
            
            default:
                break;
        }

        keyboard.close();
    }
}
