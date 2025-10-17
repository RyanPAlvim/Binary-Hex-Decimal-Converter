package br.com.numcoverter.numsys;

import java.util.Map;
import static java.util.Map.entry;

public class Hexadecimal {

    protected static final Map<Character, Integer> hexMap = Map.ofEntries(
            entry('0', 0), entry('1', 1), entry('2', 2), entry('3', 3),
            entry('4', 4), entry('5', 5), entry('6', 6), entry('7', 7),
            entry('8', 8), entry('9', 9), entry('a', 10), entry('b', 11),
            entry('c', 12), entry('d', 13), entry('e', 14), entry('f', 15)
    );

    public static int toDecimal(String hexNum){

        int decimalNum = 0;
        int index = hexNum.length() - 1;

        for(char digit : hexNum.toCharArray()){
            digit = Character.toLowerCase(digit);
            if(!hexMap.containsKey(digit)){
                System.out.println("This is not a valid hex number...");
                return 0;
            }
            decimalNum += hexMap.get(digit) * Math.pow(16, index);
            index--;
        }

        return decimalNum;
    }

    //public static int toBinary(String hexNum){



    //}

}
