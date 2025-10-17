package br.com.numcoverter.numsys;

public class Binary {

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

  /*  public static String toHex(String binaryNum){

        int bit = 0;
        List<Char>

        if(binaryNum.length() % 4 == 0){



                bit++;
            }
        }
        else(){

            int completeBits = binaryNum.length() + binaryNum.length() % 4;
            String newBinary = binaryNum;
            for(int i = 0; i < completeBits; i++){
                newBinary.
            }
        }

        for(int i = binaryNum.length() - 1; i >= 0; i--){
            if((bit) % 4 == 0){
                bit = 0;
            }


    }*/
}
