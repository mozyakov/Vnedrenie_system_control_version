import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        SalesManager sales1 = new SalesManager(new long[]{10, 20, 30, 15, 11});

        System.out.println("Максимальная сумма одной сделки составила: " + sales1.max() + " млн $");
        System.out.println("Средняя сумма сделки составила: " + sales1.getAverageSale() + " млн $");

    }
}