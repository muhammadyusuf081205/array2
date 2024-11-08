import java.util.Scanner;

public class bioskopwithscanner16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String jawab;

        do {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan baris: ");
            int baris = scanner.nextInt();
            System.out.print("Masukkan kolom: ");
            int kolom = scanner.nextInt();
            scanner.nextLine();

            if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                penonton[baris - 1][kolom - 1] = nama;
            } else {
                System.out.println("Posisi tidak valid! Silakan masukkan baris dan kolom yang sesuai.");
            }

            System.out.print("Input penonton lainnya? (y/n): ");
            jawab = scanner.nextLine();
        } while (jawab.equalsIgnoreCase("y"));

        System.out.println("\nData Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                System.out.printf("Baris %d Kolom %d: %s%n", i + 1, j + 1, (penonton[i][j] != null ? penonton[i][j] : "Kosong"));
            }
        }

        scanner.close();
    }
}
