import java.util.Scanner;
class Bai1_tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Nhap gia tri n: ");
        int so = scanner.nextInt(); 
        if (so > 0) {
            System.out.println("So " + so + " la so duong.");
        } else if (so < 0) {
            System.out.println("So " + so + " la so am.");
        } else {
            System.out.println("So ban vua nhap la so 0.");
        }
        scanner.close(); 
    }
}
