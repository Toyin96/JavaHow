package Chapter6;

public class QualityPoints {

    public byte getAverage(int number) {

        if (number <= 100) {
            if (number >= 90) {
                return 4;
            } else {
                if (number >= 80) {
                    return 3;
                } else {
                    if (number >= 70) {
                        return 2;
                    } else {
                        if (number >= 60) {
                            return 1;
                        }
                    }
                }
            }
        } else {
            System.out.println("You entered an invalid average!!!");
        }
            return 0;
    }
}
