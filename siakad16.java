import java.util.Scanner;

public class siakad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nNilai Rata-rata Setiap Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalPerSiswa += nilai[i][j];
            }
            System.out.printf("Mahasiswa ke-%d: %.2f%n", (i + 1), totalPerSiswa / 3);
        }

        System.out.println("\n===================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.printf("Mata Kuliah %d: %.2f%n", (j + 1), totalPerMatkul / 4);
        }

        sc.close();
    }
}
