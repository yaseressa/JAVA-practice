package UNISH.Chapter_6;

public class e11 {
    public static void main(String[] args) {
        System.out.println("Sales  Commission Amount");
        for (int sales = 10000; sales <= 100000; sales += 5000) {
            System.out.print(sales);
            System.out.print("____");
            System.out.print(computeCommission(sales) + "\n");
        }

    }

    public static double computeCommission(double saleAmmount) {
        double com = 0;
        if (saleAmmount <= 5000) {
            com = saleAmmount * 0.08;
        }else if (saleAmmount <= 10000) {
            saleAmmount -= 5000;
            com= (5000 * 0.08) + (saleAmmount * .10);

        } else if (saleAmmount > 10000) {
            com = (5000 * 0.08);
            saleAmmount -= 5000;

            com += (5000 * .10);
            saleAmmount -= 5000;

            com += saleAmmount * .12;
        }
        return com;
    }
}
