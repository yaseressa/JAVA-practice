package UNISH.proco;

public class Bamin {
    public static void main(String[] args) {
        var Ball1 = new Ball(2, 2);
        Ball1.move(3, -2);
        Ball1.move(2, -7);
        System.out.println(Ball1);

        var Ball2 = new Ball();
        Ball2.move(7, -7);
        Ball2.move(2, 4);
        System.out.println(Ball2);

        System.out.println( "Total Distance Travelled by Balls: (" + Ball.getTotDistXAllBalls() + ", " + Ball.getTotDistYAllBalls() + ").");

    }
}
