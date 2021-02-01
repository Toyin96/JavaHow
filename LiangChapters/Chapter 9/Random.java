package Chapter_9_Liang;

public class Random {
    public static void main(String[] args) {

        java.util.Random random = new java.util.Random();
        random.setSeed(1000);

       for (int i = 1; i < 51; i++){
           int rand = random.nextInt(100);
           System.out.println(rand);
       }
    }
}
