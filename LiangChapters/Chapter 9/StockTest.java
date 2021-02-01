package Chapter_9_Liang;

public class StockTest {

    public static void main(String[] args) {


        Stock newStock = new Stock("ORCL", "Oracle Corporation,", 34.5);

        newStock.currentPrice = 34.35;

        System.out.println(newStock.getChangePercent());

    }
}
