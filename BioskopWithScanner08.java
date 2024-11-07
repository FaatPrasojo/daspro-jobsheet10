import java.util.Scanner;
public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String [][] penonton = new String [4][2];

        System.out.println("================== Menu ==================");
        System.out.println(" - Menu 1 : Input data penonton");
        System.out.println(" - Menu 2 : Tampilkan daftar penonton");
        System.out.println(" - Menu 3 : Exit");
        System.out.println("==========================================");
        System.out.print("Pilih menu yang tersedia (1-3) : ");
        menu = pras.nextInt();

        while (true) {
            switch (menu) {
                case 1:
                System.out.print("Masukkan nama : ");
                nama = pras.nextLine();
                System.out.print("Masukkan baris : ");
                baris = pras.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom = pras.nextInt();
                pras.nextLine();

                penonton [baris-1][kolom-1] = nama;
                if (nama == null) {
                    nama = "***";
                }
                case 2 :
                for (int i = 0; i < penonton.length; i++){
                    System.out.println("Penonton pada baris ke-" + (i+1) + " : " + String.join(", ", penonton[i]));
                }
                case 3 :
                System.out.println("Exit");
                break;
            
                default:
                System.out.println("Input Invalid");
                    break;
            }

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = pras.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
