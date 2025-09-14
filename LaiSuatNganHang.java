
import java.util.Scanner;
public class LaiSuatNganHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhap so tien ban dau: ");
        double soTienGui = sc.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatNam = sc.nextDouble();

        System.out.print("Nhap so thang gui: ");
        int soThang = sc.nextInt();

        // Quy đổi lãi suất tháng
        double laiSuatThang = laiSuatNam / 12 / 100;

        // --- Cách 1: Tính lãi đơn ---
        double tienLaiDon = soTienGui * laiSuatThang * soThang;
        double tongTienDon = soTienGui + tienLaiDon;

        // --- Cách 2: Tính lãi kép ---
        double tongTienKep = soTienGui * Math.pow(1 + laiSuatThang, soThang);
        double tienLaiKep = tongTienKep - soTienGui;

        // In kết quả
        System.out.println("\n===== KET QUA=====");
        System.out.println("Lai don sau " + soThang + " thang: " + tienLaiDon);
        System.out.println("Tong tien (goc + lai don): " + tongTienDon);

        System.out.println("Lai kep sau " + soThang + " thang: " + tienLaiKep);
        System.out.println("Tong tien (goc + lai kep): " + tongTienKep);

        sc.close();
    }
}
