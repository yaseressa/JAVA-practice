package roar;


public class Gen<G> {

    private final int cap = 10;
    private G[] b = (G[])new Object[cap];
    private int size;
    public void add(G... f) {
        for (int i = 0; i < f.length; i++) {

            if (size >= cap) {
                G[] g = (G[]) new Object[cap * 2];
                System.arraycopy(b, 0, g, 0, b.length);
                this.b = g;
            }
            b[size++] = f[i];
        }
    }
    public void  get(){
        System.out.print("[");
            for (int i = 0; i < size; i++) {
                if(i == size-1){
                    System.out.print((b[i]).toString());
                    break;
                }
                System.out.print((b[i]).toString() + ", ");

        }
        System.out.println("]");
    }
}
class tester {
    public static void main(String[] args) {
        Gen<Integer> b = (new Gen<Integer>());
        b.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20, 23, 40, 50, 60);
        b.get();


    }
}