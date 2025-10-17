package br.com.numcoverter.numsys;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import static java.util.Map.entry;

public class Decimal {

    public static final Map<Integer, Character> decimalToHexMap = Map.ofEntries(
            entry(10, 'a'), entry(11, 'b'), entry(12, 'c'), entry(13, 'd'),
            entry(14, 'e'), entry(15, 'f'), entry(0, '0'), entry(1, '1'),
            entry(2, '2'), entry(3, '3'), entry(4, '4'), entry(5, '5'),
            entry(6, '6'), entry(7, '7'), entry(8, '8'), entry(9, '9')
    );

    public static int toBinary(int decimalNum){

        int currentNum = decimalNum;
        int currentInd = 0;
        int binaryNum = 0;

        if(decimalNum < 0){
            System.out.println("This is not a valid decimal number...");
        }

        while(currentNum != 0){
            binaryNum += (currentNum % 2)*Math.pow(10,currentInd);
            currentNum = currentNum/2;
            currentInd++;
        }

        return binaryNum;
    }

    public static String toHex(int decimalNum){

        int currentNum = decimalNum;
        List<Character> hexNum = new ArrayList<>();

        if(decimalNum < 0){
            System.out.println("This is not a valid decimal number...");
            return " ";
        }

        while(currentNum != 0){
            hexNum.add(0, decimalToHexMap.get(currentNum % 16));
            currentNum = currentNum / 16;
        }

        StringBuilder sb = new StringBuilder();

        for(Character digit : hexNum){
            sb.append(digit);
        }

        return sb.toString();
    }

}
