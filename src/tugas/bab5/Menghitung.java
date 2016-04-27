package tugas.bab5;

public class Menghitung {
    public int  pembilang = 0,penyebut = 0;

    public static int hitungPenjumlahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil Penjumlahan: " + hasil);
        return hasil;
    }

    public static int hitungPengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil Pengurangan: " + hasil);
        return hasil;
    }

    public int hitungPerkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil Perkalian: " + hasil);
        return hasil;
    }

    public int hitungPembagian(int a, int b) {
        int hasil = a / b;
        System.out.println("Hasil Pembagian: " + hasil);
        return hasil;
    }

    public void Sederhana(int a, int b) {
        int temp;
        if (penyebut == 0) {
            System.out.println("Tidak Ada Hasil..");
        } else if (pembilang == 0) {
            System.out.println("Hasil = 1");
        } else if (pembilang == 0 && penyebut == 0) {
            System.out.println("Hasil = 0");
        } else {
            a = (pembilang < penyebut) ? pembilang : penyebut;
            b = (pembilang< penyebut ) ? penyebut : pembilang;
            for (int i = b; b != 0; i++) {
                temp = a % b;
                a = b;
                b = temp;
            }
            pembilang /= a;
            penyebut /= a;
            System.out.println("Hasil: " + pembilang + "/" + penyebut);
        }
    }
}
