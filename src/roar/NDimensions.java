package roar;

import java.util.Arrays;

public class NDimensions {
    public static void snakeMatrix(int[][] h) {
        for (int i = 0; i < h.length; i++) {
            if (i % 2 != 0) {
                for (int j = h[i].length - 1; j >= 0; j--) {
                    System.out.print(h[i][j] + ",  ");
                }
            } else {
                for (int j = 0; j < h[i].length; j++) {
                    System.out.print(h[i][j] + ",  ");
                }
            }
        }
    }
    public static void boundaryMatrix(int[][] h) {
        for (int i = 0; i < h.length; i++) {
            if(i==0){
                for (int j = 0; j < h[i].length; j++) {
                    System.out.print(h[i][j] + ",  ");
                    if(j == h[i].length-1){
                        for (int k = 1; k < h.length; k++) {
                            System.out.print(h[k][j]  + ",  ");
                        }
                    }
                }
            }else if(i == h.length-1){
                for (int j = h[i].length-2; j >= 0; j--) {
                    System.out.print(h[i][j] + ",  ");
                    if (j == 0) {
                        for (int k = h.length - 2; k >= 1; k--) {
                            System.out.print(h[k][j] + ",  ");
                        }

                    }
                }
            }
        }
    }
    public static void transposeMatrix(int[][] h) {
        int[][] temp = Arrays.stream(h).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++) {
                temp[j][i] = h[i][j] ;
            }
        }
        System.out.println(Arrays.deepToString(temp));
    }
    public static void ninetyDegreeRotationMatrix(int[][] h) {
        int[][] temp = Arrays.stream(h).map(int[]::clone).toArray(int[][]::new);
        int[]  v = new int[h.length];
        int l = (h.length-1)/2;
        for (int i = l; i >=0 ; i--) {
            for (int j = 0; j <= l; j++) {
                System.arraycopy(h, j, v, 0, j);
                System.arraycopy(h, j,temp, i,h[j].length);


            }
        }
        System.out.println(Arrays.deepToString(temp));
    }
    public static void main(String[] args) {
        int f[][]  = {{1,2,3}, {4,5,6},{7,8,9}};
        //snakeMatrix(f);
        //boundaryMatrix(f);
//        transposeMatrix(f);
        ninetyDegreeRotationMatrix(f);
    }
}

