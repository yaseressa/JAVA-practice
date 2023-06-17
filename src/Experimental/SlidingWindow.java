package Experimental;

import java.util.Stack;

public class SlidingWindow {
    public static void main(String[] args) {
        System.out.println(SlidingWindow.opSlidingWindow(2, 5,-10,6, 90, 3));
    }
    static <T extends Number> T slidingWindow( int k, T... n){
        Stack<T> lister = new Stack<>();
        lister.push((T) new Integer(0));
        for (int i = 0; i < n.length; i++) {
            var v = new Double(0);
            for (int j = 1; j <= k; j++) {
                if(i + j <= n.length){
                    v = v + n[i+j].doubleValue();
                }

            }
            if(v > lister.peek().doubleValue()) {
                lister.push((T) v);
                return lister.peek();
            }

        }
        return lister.peek();
    }
    static int opSlidingWindow( int k, int... n){
        int cMAXIMUM = 0;
        int SUMMAX = 0;
        for(int i = 0; i < k; i++)
            cMAXIMUM += 1;
        SUMMAX = cMAXIMUM;
        for (int i = k; i < n.length; i++) {
            cMAXIMUM += (n[i] - n[i-k]);
            SUMMAX = Math.max(cMAXIMUM, SUMMAX);
        }
        return SUMMAX;
    }
}
