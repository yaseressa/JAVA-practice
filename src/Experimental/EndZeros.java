package Experimental;

import java.util.ArrayList;
import java.util.Arrays;

public class EndZeros {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(endZeros(0, 2, 0, 2, 3, 0, 0,2 ,5, 5, 7)));
    }
//    public static Integer[] endZeros(Integer... array) {
//        var arr2 = Arrays.asList(array);
//        int count = arr2.size() - 1;
//        for (int i = count; i >= 0 ; i--) {
//            if (arr2.get(i) == 0) {
//                int temp = arr2.get(count);
//                arr2.set(count--, 0);
//                arr2.set(i, temp);
//            }
//        }
//        return array;
//    }
    public static Integer[] endZeros(Integer... array) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        int count = 0;
        for (Integer integer : array) {
            if (integer != 0) {
                arr2.add(integer);
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr2.add(0);
        }
        return arr2.toArray(new Integer[0]);
    }
}
