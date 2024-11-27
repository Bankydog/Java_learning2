import java.util.ArrayList;
import java.util.Scanner;

public class ex4_findValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] x = {1, 2, 3, 4, 2, 2, 6, 7};
        
        System.out.println("=== Find target value positions in the array ===");
        System.out.print("Enter a target: ");

        int target = checkTarget(input); // ตรวจสอบค่าที่รับเข้ามา
        boolean hasTarget = checkBool(target, x); // ตรวจสอบว่ามี target หรือไม่
        String indices = findIndices(target, x); // หา index ทั้งหมดที่ตรงกับ target

        if (hasTarget) {
            System.out.println("The target " + target + " exists at positions: " + indices);
        } else {
            System.out.println("The target " + target + " does not exist in the array.");
        }

        input.close();
    }

    // ฟังก์ชันสำหรับตรวจสอบค่าที่ผู้ใช้กรอก
    public static int checkTarget(Scanner input) {
        while (true) {
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.print("Invalid input. Please enter a valid number: ");
                input.next(); // ข้ามค่าอินพุตที่ไม่ถูกต้อง
            }
        }
    }

    // ฟังก์ชันตรวจสอบว่า target มีอยู่ในอาร์เรย์หรือไม่
    public static boolean checkBool(int target, int[] arr) {
        for (int data : arr) {
            if (data == target) {
                return true; // ถ้าเจอ target คืนค่า true
            }
        }
        return false; // ถ้าไม่เจอ target คืนค่า false
    }

    // ฟังก์ชันหาตำแหน่งทั้งหมดของ target ในอาร์เรย์
    public static String findIndices(int target, int[] arr) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices.add(i);
            }
        }
        return indices.toString(); 
    }
}
