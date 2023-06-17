package Experimental;

import java.util.Arrays;

public class Arrays1{
    public static void main(String[] args) {
        Integer[] test = new Integer[]{10,5,30,15};
//        System.out.println(Arrays.toString(rotator(test)));
        System.out.println(Arrays.toString(rotatorWithOp(test, 3)));
    }
    public static <T> T[] rotator(T... array){
        T r = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];

        }
        array[array.length-1] = r;
        return array;
    }
    public static <T> T[] rotatorWithOp(T[] array, int d){
        T r = array[0];
        int[] v = new int[array.length];

        for (int i = 0; i < array.length  - 1; i++) {
            System.out.println(Arrays.toString(array));
            try{
                T temp = array[i];
                array[i] = array[i+d];
                array[i+d] = temp;
            }catch (Exception e){
                break;
            }

        }
        array[array.length-1] = r;
        return array;
    }
}
