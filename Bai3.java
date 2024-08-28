import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
            int sum = 0;
            for (int num : arr)
            {
                sum += num;
            }

            double average = (double) sum / n;

        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("Trung binh cong: " + average);
    }
}