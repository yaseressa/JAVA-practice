package UNISH.press;

import java.util.Scanner;

public class CnR {
    public static void main(String[] args)throws Exception {
        java.io.File file = new java.io.File("C:\\Users\\mee\\Desktop\\sh.txt");


        try(var sc =  new Scanner(file)){
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
            }
        }



