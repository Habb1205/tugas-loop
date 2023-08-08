import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama : Habibi");
        System.out.println("Menggunakan : For \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas angka : ");
        int n = scanner.nextInt();
        String hasil = hasilString(n);
        System.out.println(hasil);
    }

    public static String hasilString(int n) {
        String output = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output += "Klik Kanan, ";
            } else if (i % 3 == 0) {
                output += "Klik, ";
            } else if (i % 5 == 0) {
                output += "Kanan, ";
            } else {
                output += i + ", ";
            }
        }
        return output;
    }
}