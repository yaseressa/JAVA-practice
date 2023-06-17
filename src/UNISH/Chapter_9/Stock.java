package UNISH.Chapter_9;

public class Stock {
    String name, symbol;
    double previousClosingPrice, currentPrice;
    Stock(String symbol ,String name){
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercentage(){
        return (this.currentPrice / this.previousClosingPrice);
    }

}
class stockMain{
    public static void main(String[] args) {
        var stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.previousClosingPrice = 34.5;
        stock1.currentPrice = 34.35;
        System.out.println(stock1.getChangePercentage());
    }
}
