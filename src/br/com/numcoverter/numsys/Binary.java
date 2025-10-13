package br.com.numcoverter.numsys;

public class Binary {
    public static double toDecimal(String binaryNum){

        double sum = 0;
        int index = 0;

        for(int i = binaryNum.length() - 1; i >= 0; i--){
            if(binaryNum.charAt(i) == '1'){
                sum += Math.pow(2, index);
            }
            index++;
        }

        return sum;
    }
}
