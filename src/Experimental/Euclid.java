package Experimental;

public class Euclid {
    public static int euclid(int b,int c){
        if (b % c == 0) {
            return c;
        }else{
            return euclid(c,b % c);
        }
    }
    public static int euclidMin(int b,int c) {

        if (b > c) {
            b = b - c;
        }
        if (c > b) {
            c = c - b;
        }
        if (c == b) {
            return c;
        }
        return euclidMin(b, c);
    }


    public static void main(String[] args) {
        System.out.println(euclidMin(77, 10));
    }
}
