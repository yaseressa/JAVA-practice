package Experimental;

import java.util.ArrayList;
import java.util.LinkedList;

public class Josephus {
//    public static void main(String[] args) {
//        System.out.println(cost(200));
//    }
//    static double cost(double iPrice){
//        if (iPrice == 675) {
//            return 0;
//        }
//        return iPrice +cost(iPrice + (iPrice / 2));
//    }
public static void main(String[] args) {
    System.out.println(josephusLastSurvivor(5, 2));
}
static int josephusLastSurvivor(int circle, int k){
    LinkedList<? super Integer> n = new LinkedList();
    for (int i = 1; i <= circle; i++) {
        n.add(i);
    }
    int i = (k-1);
    while (i < n.size()) {
        if(n.size() == 1){
            break;
        }
        n.remove(i);
        if( i + k > n.size()){
            i = (i + (k-1)) % n.size();
        }
        else{
            i += (k-1);
        }
    }



    return (int) n.getLast();
}
}
