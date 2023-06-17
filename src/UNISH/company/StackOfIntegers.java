package UNISH.company;

public class StackOfIntegers {
private int[] elements;
private int size;

StackOfIntegers(int capacity){
    this.elements = new int[capacity];
}
public boolean empty(){
    return size == 0;
}
public void push(int[] value){
   if (size <= elements.length){
       int[] temp = new int [elements.length * 2];
       System.arraycopy(elements, 0, temp, 0, elements.length);
       elements = temp;

   }
    for(int i = 0;i< value.length; i++){
        elements[size++] = value[i];
    }

}
public int pop(){
    return elements[--size];
}
public int peak(){
    return elements[size-1];
}
public int size(){
    return this.size ;
}
}
class Stack{
    public static void main(String[] args) {
        var stackr = new StackOfIntegers(20);
        int[] b = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22,344343,434,4};
        stackr.push(b);
        while(!stackr.empty()){
            System.out.print(stackr.pop()+"\n");

        }
        System.out.println("\n" + stackr.size());

    }
}
