package br.com.numcoverter.numsys;

import java.util.Map;
import static java.util.Map.entry;
import static br.com.numcoverter.numsys.Decimal.toBinary;

public class Hex {

    private static final Map<Character, Integer> hexIntMap = Map.ofEntries(
            entry('0', 0), entry('1', 1), entry('2', 2), entry('3', 3),
            entry('4', 4), entry('5', 5), entry('6', 6), entry('7', 7),
            entry('8', 8), entry('9', 9), entry('a', 10), entry('b', 11),
            entry('c', 12), entry('d', 13), entry('e', 14), entry('f', 15)
    );

    private static final Map<Character, String> hexBinMap = Map.ofEntries(
            entry('0', "0000"), entry('1', "0001"), entry('2', "0010"), entry('3', "0011"),
            entry('4', "0100"), entry('5', "0101"), entry('6', "0110"), entry('7', "0111"),
            entry('8', "1000"), entry('9', "1001"), entry('a', "1010"), entry('b', "1011"),
            entry('c', "1100"), entry('d', "1101"), entry('e', "1110"), entry('f', "1111")
    );

    public static int toDecimal(String hexNum){

        int decimalNum = 0;
        int index = hexNum.length() - 1;

        for(char digit : hexNum.toCharArray()){
            digit = Character.toLowerCase(digit);
            if(!hexIntMap.containsKey(digit)){
                System.out.println("This is not a valid hex number...");
                return 0;
            }
            decimalNum += hexIntMap.get(digit) * Math.pow(16, index);
            index--;
        }

        return decimalNum;
    }

    public static String toBinary(String hexNum){

        StringBuilder sb = new StringBuilder();

        for(char digit : hexNum.toCharArray()){
            digit = Character.toLowerCase(digit);
            if(!hexBinMap.containsKey(digit)){
                System.out.println("This is not a valid hex number...");
                return "";
            }

            sb.append(hexBinMap.get(digit));
        }

        return sb.toString();
    }

}
