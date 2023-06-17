package roar;

public interface lambda {
 int addition(int a, int b);
}
class test{
    public static void main(String[] args) {
        add((a, b)->{
            return(a+b);

        });
       add( new lambda(){
            @Override
          public int addition(int a, int b){
                return a+b;
            }
        });
    }
    public static void add(lambda l){
        System.out.println(l.addition(1, 4));
    }
          /*  Runnable r1 = (()->{
          i  =i + 1;
        } );
        Runnable r2 = (()-> {

            while(i < 2){}
            System.out.println(i);
        });
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        System.out.println(i);

       */
}
