public class flowchartarray16 {
    public static void main(String[] args) {
        int[][] survey = new int[10][6];
        survey[0][0] = 4;
        survey[0][1] = 5;

        double[] rataRataResponden = hitungRataRataResponden(survey);
        System.out.println("Rata-rata nilai setiap responden:");
        for (int i = 0; i < rataRataResponden.length; i++) {
            System.out.println("Responden " + (i+1) + ": " + rataRataResponden[i]);
        }

        double[] rataRataPertanyaan = hitungRataRataPertanyaan(survey);
        System.out.println("\nRata-rata nilai setiap pertanyaan:");
        for (int i = 0; i < rataRataPertanyaan.length; i++) {
            System.out.println("Pertanyaan " + (i+1) + ": " + rataRataPertanyaan[i]);
        }

        double rataRataKeseluruhan = hitungRataRataKeseluruhan(survey);
        System.out.println("\nRata-rata nilai keseluruhan: " + rataRataKeseluruhan);
    }

    public static double[] hitungRataRataResponden(int[][] survey) {
        double[] rataRata = new double[survey.length];
        for (int i = 0; i < survey.length; i++) {
            int jumlahNilai = 0;
            for (int j = 0; j < survey[i].length; j++) {
                jumlahNilai += survey[i][j];
            }
            rataRata[i] = (double) jumlahNilai / survey[i].length;
        }
        return rataRata;
    }

    public static double[] hitungRataRataPertanyaan(int[][] survey) {
        double[] rataRata = new double[survey[0].length];
        for (int j = 0; j < survey[0].length; j++) {
            int jumlahNilai = 0;
            for (int i = 0; i < survey.length; i++) {
                jumlahNilai += survey[i][j];
            }
            rataRata[j] = (double) jumlahNilai / survey.length;
        }
        return rataRata;
    }

    public static double hitungRataRataKeseluruhan(int[][] survey) {
        int jumlahTotal = 0;
        int jumlahData = 0;
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                jumlahTotal += survey[i][j];
                jumlahData++;
            }
        }
        return (double) jumlahTotal / jumlahData;
    }
}
