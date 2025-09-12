import java.util.Scanner;

public class Bai3_Linh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào hai số nguyên
        System.out.print("Nhap so nguyen thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int b = sc.nextInt();

        // Tính toán
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;  // diện tích = tích
        double thuong = 0;
        int phanDu = 0;

        if (b != 0) {
            thuong = (double) a / b;
            phanDu = a % b;
        } else {
            System.out.println("Khong the chia cho 0");
        }

        // Xuất kết quả
        System.out.println("\nKet qua:");
        System.out.println("Tong = " + tong);
        System.out.println("Hieu = " + hieu);
        System.out.println("Tich = " + tich);
        if (b != 0) {
            System.out.println("Thuong = " + thuong);
            System.out.println("Phan du = " + phanDu);
        }

        sc.close();
    }
}
