import java.util.Scanner;

public class Bai1_Nhi {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Nhập tên từ người dùng
        System.out.print("Nhap ten cua ban: ");
        String ten = sc.nextLine();

        // Xuất ra màn hình
        System.out.println("Hello " + ten);

        sc.close(); // Đóng Scanner
    }
}
