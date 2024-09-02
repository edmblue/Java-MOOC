
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());

        boolean ticket = speed > 120;

        if (ticket) {
            System.out.println("Speeding ticket!");
        }
    }
}
