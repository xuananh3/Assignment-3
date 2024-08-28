import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String check;
        do {
            int n = (int) (Math.random() * 100) + 1;
            System.out.print("Nhap check (yes de tiep tuc): ");
            check = scanner.nextLine();

            if (check.equalsIgnoreCase("yes")) {
                System.out.println(n + " la so " + (n % 2 == 0 ? "chan" : "le"));
            } else {
                System.out.println(n + " la so " + (n % 2 == 0 ? "chan" : "le"));
                break;
            }
        } while (true);
    }
}