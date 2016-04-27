package tugas.bab5;

public class PabrikJaket {

    public final double A = 100000;
    public final double B = 125000;
    public final double C = 175000;
    public int jum; //jumlah jaket
    public double total;

    public void paketA() {
        if (jum > 100) {
            System.out.println("----Anda Mendapat Potongan----");
            int harga = 95000;
            total = jum * harga;
            System.out.println("Total Harga: " + total);
        } else {
            System.out.println("--------Harga Normal--------");
            total = jum * A;
            System.out.println("Total Harga: " + total);
        }
    }

    public void paketB() {
        if (jum > 100) {
            System.out.println("----Anda Mendapat Potongan----");
            int harga = 120000;
            total = jum * harga;
            System.out.println("Total Harga: " + total);
        } else {
            System.out.println("--------Harga Normal--------");
            total = jum * B;
            System.out.println("Total Harga: " + total);
        }
    }

    public void paketC() {
        if (jum > 100) {
            System.out.println("Anda Mendapat Potongan");
            int harga = 160000;
            total = jum * harga;
            System.out.println("Total Harga: " + total);
        } else {
            System.out.println("--------Harga Normal--------");
            total = jum * C;
            System.out.println("Total Harga: " + total);
        }
    }

    public void tampilDaftar() {
        System.out.println("=======================================");
        System.out.println("|        Daftar Harga Jaket           |");
        System.out.println("=======================================");
        System.out.println("|  Jaket Bahan A = Rp. 100.000/unit   |");
        System.out.println("|  Jaket Bahan B = Rp. 125.000/unit   |");
        System.out.println("|  Jaket Bahan C = Rp. 175.000/unit   |");
        System.out.println("=======================================");
    }
}
