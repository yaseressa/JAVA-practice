package Experimental;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring(""));
        List<Integer> l = new ArrayList<Integer>(List.of(3, 5, 7));
        System.out.println(gameOfPiles(l, 4));
    }
    public static int lengthOfLongestSubstring(String s) {
        String test = "";
        int l = 0;
        for(int i = 0; i < s.length() ; i++){
            if(test.contains(String.valueOf(s.charAt(i)))){
                test = String.valueOf(s.charAt(i));
            }else{
                if(s.charAt(i) == 0){test += " ";}
                else{test += String.valueOf(s.charAt(i));}
                if(l < test.length()) l = test.length();
            }
        }
        return l;
    }
    public static String gameOfPiles(List<Integer> piles, int k) {
        int sam = 0, alex = 0;
        for (int i = 0; i < piles.size() ; i++) {
            while (piles.get(i) > 0) {
                if (piles.get(i) >= k) {
                    if (alex < sam) {
                        piles.set(i, piles.get(i) - k);
                        alex += 1;
                    } else {
                        piles.set(i, piles.get(i) - k);
                        sam += 1;
                    }
                } else {
                    if (alex < sam) {
                        piles.set(i, 0);
                        alex += 1;
                    } else {
                        piles.set(i, 0);
                        sam += 1;
                    }
                }
            }
        }
            if (alex < sam) {
                return ("Sam wins the game of " + piles.size() + " piles");
            }

        return ("Alex wins the game of " + piles.size() + " piles");

        }
    }
