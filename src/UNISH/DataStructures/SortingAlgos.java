package UNISH.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class SortingAlgos {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        f.useDelimiter("[,|\\n]");
        System.out.print("Enter a List(t to terminate): ");
        ArrayList<Integer> b = new ArrayList<Integer>();
        while(true){
            String l = f.next();
            if (Objects.equals(l, "t")){
                break;
            }
            b.add(Integer.valueOf(l));

        }
        Integer[] bb = new Integer[b.size()];
        System.out.println(

                "Choose One of the following methods: \n"+
                "******************************\n"+
                "|   1   |  Selection Sort    |\n"+
                "******************************\n"+
                "|   2   |  Insertion Sort    |\n"+
                "******************************\n"+
                "|   3   |  Bubble Sort       |\n"+
                "******************************\n"+
                "|   4   |  Merge Sort        |\n"+
                "******************************\n"+
                "|   5   |  Quick Sort        |\n"+
                "******************************\n"+
                "|   6   |  Heap Sort         |\n"+
                "******************************\n"

        );
        System.out.print("Enter Your Sorting Method: ");
        var sc = f.nextInt();
        b.toArray(bb);
        switch(sc){
            case 1:
                System.out.println("\n \nSelection Sorting");
                System.out.println("********************************************************************************");
                System.out.println("*   before sorting ======> " + Arrays.toString(bb) + "                   *");
                selectionSort(bb);
                System.out.println("*   after sorting  ======> " + Arrays.toString(bb) + "                   *");
                System.out.println("********************************************************************************");
                break;
            case 2:
                System.out.println("\n \nInsertion Sorting");
                System.out.println("********************************************************************************");
                System.out.println("*   before sorting ======> " + b + "                   *");
                insertionSort(b);
                System.out.println("*   after sorting  ======> " + b + "                   *");
                System.out.println("********************************************************************************");
            break;
            case 3:
                System.out.println("\n \n Bubble Sorting");
                System.out.println("********************************************************************************");
                System.out.println("*   before sorting ======> " + Arrays.toString(bb) + "                   *");
                bubbleSort(bb);
                System.out.println("*   after sorting  ======> " + Arrays.toString(bb) + "                   *");
                System.out.println("********************************************************************************");
            break;
            case 4:
                System.out.println("\n \nMerge Sorting");
                System.out.println("********************************************************************************");
                System.out.println("*   before sorting ======> " + Arrays.toString(bb) + "                   *");
                mergeSort(bb);
                System.out.println("*   after sorting  ======> " + Arrays.toString(bb) + "                   *");
                System.out.println("********************************************************************************");
            break;
            case 5:
                System.out.println("\n \nQuick Sorting");
                System.out.println("********************************************************************************");
                System.out.println("*   before sorting ======> " + Arrays.toString(bb) + "                   *");
                quickSort(bb);
                System.out.println("*   after sorting  ======> " + Arrays.toString(bb) + "                   *");
                System.out.println("********************************************************************************");
                break;
            case 6:
                System.out.println("\n \nHeap Sorting");
                System.out.println("********************************************************************************");
                System.out.println("*   before sorting ======> " + Arrays.toString(bb) + "                   *");
                Heap.heapSort(bb);
                System.out.println("*   after sorting  ======> " + Arrays.toString(bb) + "                   *");
                System.out.println("********************************************************************************");
                break;
        }

    }
    static void selectionSort(Integer[] g){
        for (int i = 0; i < g.length-1; i++) {
            int h = i;
            for (int j = i+1; j < g.length; j++) {
                if(g[h] > g[j]){
                    h = j;
                }
                int temp = g[h];
                g[h] = g[i];
                g[i] = temp;
            }
        }
    }

         public static void bubbleSort(Integer[] list) {
             boolean needNextPass = true;

             for (int k = 1; k < list.length && needNextPass; k++) {

                 needNextPass = false;
                 for (int i = 0; i < list.length - k; i++) {
                     if (list[i] > list[i + 1]) {

                         int temp = list[i];
                         list[i] = list[i + 1];
                         list[i + 1] = temp;

                         needNextPass = true;
                     }
                 }
             }
         }




    public static void insertionSort(ArrayList<Integer> entry) {
        for (int i = 1; i < entry.size(); i++) {

            int currentElement = entry.get(i);
            int k;
            for (k = i - 1; k >= 0 && entry.get(k) > currentElement; k--) {
                entry.set(k + 1, entry.get(k));
            }
            entry.set(k + 1, currentElement);
        }
    }



        public static void mergeSort(Integer[] list) {
            if (list.length > 1) {
                Integer[] firstHalf = new Integer[list.length / 2];
                System.arraycopy(list, 0, firstHalf, 0, list.length/ 2);
                mergeSort(firstHalf);
                int secondHalfLength = list.length - list.length / 2;
                Integer[] secondHalf = new Integer[secondHalfLength];
                System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
                mergeSort(secondHalf);


                merge(firstHalf, secondHalf, list);
            }
        }


        public static void merge(Integer[] list1, Integer[] list2, Integer[] temp) {
            int current1 = 0;
            int current2 = 0;
            int current3 = 0;
            while (current1 < list1.length && current2 < list2.length) {
                if (list1[current1] < list2[current2])
                    temp[current3++] = list1[current1++];
                else
                    temp[current3++] = list2[current2++];
            }

            while (current1 < list1.length)
                temp[current3++] = list1[current1++];

            while (current2 < list2.length)
                temp[current3++] = list2[current2++];
        }

 public static void quickSort(Integer[] list) {
             quickSort(list, 0, list.length - 1);
             }

         public static void quickSort(Integer[] list, int first, int last) {
             if (last > first) {
                 int pivotIndex = partition(list, first, last);
                 quickSort(list, first, pivotIndex - 1);
                 quickSort(list, pivotIndex + 1, last);

             }
 }


         public static int partition(Integer[] list, int first, int last) {
         int pivot = list[first];
         int low = first + 1;
         int high = last;

         while (high > low) {
             // Search forward from left
             while (low <= high && list[low] <= pivot) {
                 low++;
             }

             while (low <= high && list[high] > pivot) {
                 high--;
             }

             if (high > low) {
                 int temp = list[high];
                 list[high] = list[low];
                 list[low] = temp;
                 }
             }

        while (high > first && list[high] >= pivot) {
            high--;
        }
         if (pivot > list[high]) {
             list[first] = list[high];
             list[high] = pivot;
             System.out.println(Arrays.toString(list));
             return high;
             }
         else {
             System.out.println(Arrays.toString(list));
             return first;
             }
         }

}
 class Heap<E extends Comparable<E>> {
    private final java.util.ArrayList<E> list = new java.util.ArrayList<>();


    public Heap() {
    }

    public Heap(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }


    public void add(E newObject) {
        list.add(newObject);
        int currentIndex = list.size() - 1;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;

            if (list.get(currentIndex).compareTo(
                    list.get(parentIndex)) > 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            } else
                break;

            currentIndex = parentIndex;
        }
    }


    public E remove() {
        if (list.size() == 0) return null;

        E removedObject = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while (currentIndex < list.size()) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;


            if (leftChildIndex >= list.size()) break;
            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()) {
                if (list.get(maxIndex).compareTo(
                        list.get(rightChildIndex)) < 0) {
                    maxIndex = rightChildIndex;
                }
            }


            if (list.get(currentIndex).compareTo(
                    list.get(maxIndex)) < 0) {
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
            } else
                break;
        }

        return removedObject;
    }

    public int getSize() {
        return list.size();
    }

    public static <E extends Comparable<E>> void heapSort(E[] list) {

        Heap<E> heap = new Heap<>();


        for (int i = 0; i < list.length; i++) {
            heap.add(list[i]);
        }


        for (int i = list.length - 1; i >= 0; i--) {
            list[i] = heap.remove();
        }
    }
}
