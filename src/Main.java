import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        permission(23, 34);
        permission(4, -8);
        permission(30, 20);
        permission(20, 9);
        permission(18, -3);
        permission(generateRandomAge(), 15);
    }

    public static boolean permission(int age, int temperature) {
        if (age >= 20 && age < 45 && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (age > 20 && temperature >= 0 && temperature < 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature >= 10 && temperature < 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Остовайтесь дома");
        }
        return true;
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int rundomnumber = random.nextInt();
        return rundomnumber;
    }
}