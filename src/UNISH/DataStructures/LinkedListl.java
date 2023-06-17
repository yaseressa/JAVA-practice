package UNISH.DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinkedListl {
    static double[] b = new double[10];

    public static void main(String[] args) {
        Queue<? super Number> a = new LinkedList();
        a.offer(2);
        a.offer(3.1);
        a.offer(1);
        System.out.println(a.peek());

        Stack<? super Number> a1 = new Stack();
        a1.push(2);
        a1.push(3.1);
        a1.push(1);
        System.out.println(a1.peek());

    }
}