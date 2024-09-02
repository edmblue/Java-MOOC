
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number");
        int number = Integer.valueOf(scan.nextLine());

        boolean isCorrect = number == 1984;

        if (isCorrect){
            System.out.println("Orwell");
        }
    }
}
