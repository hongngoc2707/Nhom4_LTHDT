public class Bai2_Nhi {
    public static void main(String[] args) {
        // Khai báo các biến với kiểu dữ liệu khác nhau
        String ten = "Pham, Phuong Nhi";   // dùng String để lưu tên
        int tuoi = 19;                 // kiểu int
        double chieucao = 1.62;        // kiểu double
        char gioitinh = 'F';           // kiểu char (M = Male, F = Female)
        boolean thichLapTrinh = true;  // kiểu boolean

        // In ra màn hình thông tin cá nhân
        System.out.println("=== THONG TIN CA NHAN ===");
        System.out.println("Ho va ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Chieu cao: " + chieucao + " m");
        System.out.println("Gioi tinh: " + (gioitinh == 'M' ? "Nam" : "Nu"));
        System.out.println("Thich lap trinh: " + (thichLapTrinh ? "Co" : "Khong"));
    }
}
