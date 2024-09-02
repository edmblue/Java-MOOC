
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        boolean isSmaller = year < 2015;

        if (isSmaller){
            System.out.println("Ancient history!");
        }
    }
}
