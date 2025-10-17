package br.com.numcoverter.numsys;

public class Decimal {

    public static int toBinary(int decimalNum){

        int currentNum = decimalNum;
        int currentInd = 0;
        int binaryNum = 0;

        while(currentNum != 0){
            binaryNum += (currentNum % 2)*Math.pow(10,currentInd);
            currentNum = currentNum/2;
            currentInd++;
        }

        return binaryNum;
    }

}
