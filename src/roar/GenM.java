package roar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GenM {
    private int points;
    public static <G extends  Comparable> int maximum(G a,G b){
        return(a.compareTo(b));
    }

    public static <G extends  String, F extends Number> String map(G a,F b){
        return(a.toUpperCase() + ": " + b);
    }
}

