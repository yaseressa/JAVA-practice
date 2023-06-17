package roar;

import java.util.*;

public class arrrar {
    public static void main(String[] args) {
        Set<String> b = new HashSet<>();
        b.add("red");
        b.add("yellow");
        b.add("green");
        ArrayList<String> b1 = new ArrayList<>();
        b1.add("red");
        b1.add("yellow");
        b1.add("blue");
        b.addAll(b1);
        System.out.println(b);


    }
}
