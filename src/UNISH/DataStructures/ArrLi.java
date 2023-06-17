package UNISH.DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrLi extends Thread {


    public void run() {
        ArrayList<String> name = new ArrayList<>();
        name.add("Omer");
        name.add(0, "Ebrahem");
        name.add("ahmed");
        name.forEach((l) -> {
            int f = name.indexOf(l);
            name.set(f, f + 1 + ": " + l.toUpperCase());
        });
        System.out.println(name);
    }
    public static void main(String[] args) {
        Thread t = new ArrLi();
        t.start();
        try {
            sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t1 = new Thread(t) {
            public void run() {
                System.out.println("hoosh");
            }
        };
        t1.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();        }


    }
}


