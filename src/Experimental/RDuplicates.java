package Experimental;

import java.util.ArrayList;
import java.util.Arrays;

public class RDuplicates<T> {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(RDuplicates.rDuplicate(1, 1, 2, 2, 3, 3,111,111,33,45,45)));
    }
    @SafeVarargs
    public static <F> F[] rDuplicate (F... array){
        ArrayList<F> a = new ArrayList<F>(array.length);

        a.add(array[0]);
        int count = 0;
        for (F f : array) {
            if (f != a.get(count)) {
                count++;
                a.add(f);
            }
        }
        return (F[]) a.toArray();
    }
}
