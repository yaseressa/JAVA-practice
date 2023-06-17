package Experimental;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
      sieveOfEratosthenes(50);
    }
 static void sieveOfEratosthenes(int n){
   boolean[] arr = new boolean[n];
     for (int i = 0; i < n; i++) {
         arr[i] = true;
     }
     for (int i = 2; i * i < n; i++) {
         if(arr[i]){
             for(int j = i * i; j < n; j+=i)
                 arr[j] = false;

         }

     }
     for (int i = 2; i < n; i++) {
      if(arr[i]){
          System.out.print(i + " ");
      }
     }

 }
}

