package roar;

import java.util.Arrays;

public class TowerOfHanoi {
    public static void main(String[] args) {
        //  towerOfHanoi(3, 'a', 'b', 'c');
        //  ArrayGreatest(1,11,2,3,10);
        //ArrayDuplicate(1, 2, 1, 3, 2, 3,11,10,11,7,8,12,12,22,33,44,22,1,90,45,22);
        System.out.println(binarySearch(5,1,2,3,4,5));
    }
//
//    public static void towerOfHanoi(int n, char a, char b, char c) {
//        if (n == 1) {
//            System.out.println("move 1 from " + a + " to " + c);
//            return;
//        }
//        towerOfHanoi(n - 1, a, c, b);
//        System.out.println("move " + n + " from " + a + " to " + c);
//        towerOfHanoi(n - 1, b, a, c);
//    }
//
//    public static void ArrayGreatest(int... b) {
//        int o = 0;
//
//        for (int i = 0; i < b.length; i++) {
//            int v = 0;
//            for (int j = 0; j <= b.length - 1; j++) {
//                if (b[i] > b[j] && b[i] != b[j]) {
//                    ++v;
//                }
//            }
//            if (v == b.length - 3) {
//                o = i;
//            }
//
//        }
//        System.out.println(b[o]);
//    }
//
//    public static void ArrayDuplicate(int... b) {
//        int size = b.length;
//        System.out.println(size);
//        for (int i = 0; i <= size; i++) {
//            for (int j = 0; j <= size; j++) {
//                if (i == j) continue;
//                if (b[i] == b[j]) {
//                    size--;
//                    System.out.println(size);
//                    if (size - j >= 0) System.arraycopy(b, j + 1, b, j, size - j);
//                }
//            }
//        }
//
//        int[] temp = new int[size+1];
//        System.arraycopy(b, 0, temp, 0, size+1);
//        System.out.println(Arrays.toString(temp));
//    }
  public static int binarySearch (int i, int... array){
        int l = (array.length) / 2;
      System.out.println(Arrays.toString(array) +  "         " + l);

        if(array[l] == i){
            System.out.println(l);
            return(l);
        }
        if(array[l] > i){
            int[] temp = new int[array.length - (l+1)];
            System.arraycopy(array, 0, temp,0, array.length - (l+1));
            binarySearch(i, temp);
            System.out.println(Arrays.toString(temp));
        }if(array[l] < i){
            if(l > 1) {
                int[] temp = new int[l];
                System.arraycopy(array, l+1, temp, 0, l);
                binarySearch(i, temp);
            }else{
                int[] temp = new int[l];
                System.arraycopy(array, l-1, temp, 0, l);
                binarySearch(i, temp);
            }
      }

        return -1;
  }
}