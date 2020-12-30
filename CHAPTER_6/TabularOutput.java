package Chapter4;

public class TabularOutput {

    public static void main(String[] args) {

        System.out.println("N\t\t10*N\t100*N\t1000*N");
        int k = 1;
        while (k <= 5) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n", k, (k * 10), (k * 100), (k * 1000));
            k++;
        }
    }
}

