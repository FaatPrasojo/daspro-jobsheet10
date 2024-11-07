import java.util.Scanner;
public class Tugas1_08 {
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        int[][] survey = new int[10][6];
        
        // a. Menyimpan hasil survey
        System.out.println("Masukkan nilai survei untuk6 pertanyaan (1-5):");
        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < survey[i].length; j++) {
                do {
                    System.out.print("Pertanyaan " + (j + 1) + ": ");
                    survey[i][j] = pras.nextInt();
                } while (survey[i][j] < 1 || survey[i][j] > 5);
            }
        }

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("Rata-rata untuk setiap responden:");
        for (int i = 0; i < survey.length; i++) {
            double total = 0;
            for (int j = 0; j < survey[i].length; j++) {
                total += survey[i][j];

            }
            double average = total / 6;
            System.out.println("Rata-rata responden ke-" + (i + 1) + " = " + average);
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("Rata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < survey.length; i++) {
                total += survey[i][j];
            }
            double average = total / survey.length;
            System.out.println("Rata-rata pertanyaan ke-" + (j + 1) +" = "+ average);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        double totalKeseluruhan = 0;
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double averageKeseluruhan = totalKeseluruhan / 60;
        System.out.println("Rata-rata keseluruhan :" + averageKeseluruhan);
        pras.close();
    }
}
