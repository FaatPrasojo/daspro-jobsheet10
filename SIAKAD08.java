import java.util.Scanner;
public class SIAKAD08 {
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        int x,y;
        
        System.out.print("Masukkan jumlah Mahasiswa : ");
        x = pras.nextInt();
        System.out.print("Masukkan jumlah mata kuliah : ");
        y = pras.nextInt();

        int [][] nilai = new int [x][y];

        for (int i = 0; i < nilai.length; i++){
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            int jumlah = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = pras.nextInt();
                totalPerSiswa += nilai[i][j];
                jumlah++; 
            }
            System.out.println("Nilai rata-rata : " + totalPerSiswa/jumlah);
        }
        for(int j = 0; j < 3; j++){
            double totalPerMatkul = 0;
            int z = 0;
            for (int i = 0; i < 4; i++){
                totalPerMatkul += nilai[i][j];
                z++;
            }
            System.out.println("Mata kuliah " + (j+1) + " : " + totalPerMatkul/z);
        }
    }
}
