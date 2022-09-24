public class Main {
    public static void main(String[] args) {
        SalesManager sales1 = new SalesManager(new int[]{10, 20, 30, 15, 11});

        System.out.println("Максимальная сумма одной сделки составила: " + sales1.max() + " млн $");

    }
}