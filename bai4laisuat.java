import java.util.Scanner;

public class bai4laisuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi (VND): ");
        double soTienGui = scanner.nextDouble();
        System.out.print("Nhập lãi suất hằng năm (%): ");
        double laiSuatNam = scanner.nextDouble();
        System.out.print("Nhập số tháng gửi: ");
        int soThang = scanner.nextInt();
        double laiSuatThang = laiSuatNam / 12 / 100; 
        double tongTien = soTienGui * Math.pow(1 + laiSuatThang, soThang);
        double tienLai = tongTien - soTienGui;
        System.out.println("\n===== KẾT QUẢ =====");
        System.out.printf("Tiền lãi: %.2f VND\n", tienLai);
        System.out.printf("Tổng số tiền cuối kỳ: %.2f VND\n", tongTien);

        scanner.close();
    }
}
