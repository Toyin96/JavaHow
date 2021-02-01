package Chapter_9_Liang;

public class Stock {

    private String symbol;
    private String name;
    double previousClosingPrice;
    double currentPrice;


    public Stock(String symbol, String name, double closingPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = closingPrice;
    }

    public double getChangePercent(){
        return (previousClosingPrice - currentPrice) / 100;
    }
}
