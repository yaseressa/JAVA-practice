package UNISH.Chapter_6;

public class e1 {
    public static void main(String[] args) {
        for(int i =1;i <= 100; i++){
        System.out.print(getPentagonalNumber(i) + ", ");
        if(i % 10 == 0){
            System.out.println("\n");
        }
        }
    }
    public static int getPentagonalNumber(int n){
        return n * ((3 * n)-1) / 2;
    }
}
