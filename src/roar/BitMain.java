package roar;

import java.util.Scanner;

public class BitMain {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        int b = f.nextInt();
        int k = 0;
           int i = 0;
            while(i < 32){

               if((b & 1)== 1){
                   k++;
                   b = b >> 1;
               }
               else{
                   b = b >> 1;
               }
               i++;
            }


        System.out.println(k);
    }



}
