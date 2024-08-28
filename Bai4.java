import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
            for (int i = 0; i < n - 1; i++) 
            {
                for (int j = 0; j < n - i - 1; j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        System.out.print("Mang sau khi sap xep: ");
        for (int num : arr)
        {
             System.out.print(num + " ");
        }
    }
}