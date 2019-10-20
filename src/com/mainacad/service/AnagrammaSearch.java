package com.mainacad.service;

public class AnagrammaSearch {
    public static int getNumberByMultiplication(){
        int result=0;
        int maxAnagramma =0;
        for(int i=1000;i<=9999;i++){
            for(int j=9999;j>=1000;j--){
                result=i*j;
                String number=Integer.toString(result);
                String reverse = new StringBuffer(number).reverse().toString();
                if(number.equals(reverse)){
                    if(result>maxAnagramma) {
                        maxAnagramma = result;
                    }
                }
            }
        }
        return maxAnagramma;
    }
}
