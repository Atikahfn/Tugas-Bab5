package tugas.bab5;

import java.util.Scanner;

public class MainPabrikJaket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PabrikJaket jaket = new PabrikJaket();
        System.out.println("========== >> Jaket Labkomdas << ==========\n");
        jaket.tampilDaftar();
        while (true) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Jaket A");
            System.out.println("2. Jaket B");
            System.out.println("3. Jaket C");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            int pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukkan jumlah jaket: ");
                    jaket.jum = in.nextInt();
                    jaket.paketA();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah jaket: ");
                    jaket.jum = in.nextInt();
                    jaket.paketB();
                    break;
                case 3:
                    System.out.print("Masukkan jumlah jaket: ");
                    jaket.jum = in.nextInt();
                    jaket.paketC();
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }
}
