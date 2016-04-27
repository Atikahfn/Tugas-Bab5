package tugas.bab5;

import java.util.Scanner;

public class MainMenghitung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        Menghitung hitung = new Menghitung();
        System.out.println("========== >> Program Penghitung << ==========\n");
        System.out.println("*******Penjumlahan*******");
        System.out.print("Masukkan nilai ke 1: ");
        a = in.nextInt();
        System.out.print("Masukkan nilai ke 2: ");
        b = in.nextInt();
        Menghitung.hitungPenjumlahan(a,b);
        System.out.println("\n*******Pengurangan*******");
        System.out.print("Masukkan nilai ke 1: ");
        a = in.nextInt();
        System.out.print("Masukkan nilai ke 2: ");
        b = in.nextInt();
        Menghitung.hitungPengurangan(a, b);
        System.out.println("\n*******Perkalian*******");
        System.out.print("Masukkan nilai ke 1: ");
        a = in.nextInt();
        System.out.print("Masukkan nilai ke 2: ");
        b = in.nextInt();
        hitung.hitungPerkalian(a, b);
        System.out.println("\n*******Pembagian*******");
        System.out.print("Masukkan nilai ke 1: ");
        a = in.nextInt();
        System.out.print("Masukkan nilai ke 2: ");
        b = in.nextInt();
        hitung.hitungPembagian(a, b);
        System.out.println("\n*******Penyederhanaan*******");
        System.out.print("Masukkan nilai ke 1: ");
        a = in.nextInt();
        System.out.print("Masukkan nilai ke 2: ");
        b = in.nextInt();
        hitung.Sederhana(a,b);
    }
}
