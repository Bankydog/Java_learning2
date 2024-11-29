import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าจำนวนชั้นของปิรามิดจากผู้ใช้
        System.out.print("Enter a number for flour of Pyramid: ");
        int n = scanner.nextInt();

        // วนลูปสร้างปิรามิด
        for (int i = 1; i <= n; i++) {
            // พิมพ์ช่องว่างด้านซ้าย
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // พิมพ์ตัวเลขในแต่ละชั้น
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // ขึ้นบรรทัดใหม่เมื่อจบแต่ละชั้น
            System.out.println();
        }

        scanner.close();
    }
}
