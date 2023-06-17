package UNISH.Generics;

public abstract class great {
  int shit = 10;
  abstract int shitter(int[] b);


}
interface great1{
  String name = "ahmed";
 String shitter1();


}

class servant extends great implements great1{
    @Override
    public int shitter(int[] b) {
        return b[1] + 4;
    }
    @Override
    public String shitter1() {
        return name;
    }

    public static void main(String[] args) {
        var b = new servant();
        System.out.println(b.shitter(new int[]{1, 2}));


    }
}
