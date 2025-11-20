package br.com.numcoverter.numsys;

import java.util.Map;
import static java.util.Map.entry;

public class Binary {

    private static final Map<String, Character> binHexMap = Map.ofEntries(
            entry("0000", '0'), entry("0001", '1'), entry("0010", '2'), entry("0011", '3'),
            entry("0100", '4'), entry("0101", '5'), entry("0110", '6'), entry("0111", '7'),
            entry("1000", '8'), entry("1001", '9'), entry("1010", 'a'), entry("1011", 'b'),
            entry("1100", 'c'), entry("1101", 'd'), entry("1110", 'e'), entry("1111", 'f')
    );


    public static int toDecimal(String binaryNum){

        int sum = 0;
        int index = 0;

        for(int i = binaryNum.length() - 1; i >= 0; i--){
            if(binaryNum.charAt(i) != '1' && binaryNum.charAt(i) != '0'){
                System.out.println("This is not a valid binary number...");
                return 0;
            }
            if(binaryNum.charAt(i) == '1'){
                sum += Math.pow(2, index);
            }
            index++;
        }

        return sum;
    }

   public static String toHex(String binaryNum) {

       StringBuilder byte_ = new StringBuilder();
       StringBuilder hexNum = new StringBuilder();

       int bitsLeft = 4;

       for(int i = binaryNum.length() - 1; i >= 0; i--){
           if(binaryNum.toCharArray()[i] != '1' || binaryNum.toCharArray()[i] != '1'){
               System.out.println("This is not a valid binary number...");
               return "0";
           }
           byte_.insert(0, binaryNum.toCharArray()[i]);
           bitsLeft--;
           if(i == 0){
               for(int j = 0; j < bitsLeft; j++){
                   byte_.insert(0, '0');
               }
               bitsLeft = 0;
           }
           if(bitsLeft == 0){
               hexNum.insert(0, binHexMap.get(byte_.toString()));
               byte_.setLength(0);
               bitsLeft = 4;
           }
       }

       return hexNum.toString().toUpperCase();
   }
}
