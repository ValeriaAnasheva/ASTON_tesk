import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.equals("Vyacheslav")) {
            System.out.println("Hi, Vyacheslav");
        } else {
            System.out.println("No such name");
        }
    }
}