package tugas.bab5;

public class Aritmatika {
    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }
    
    public double hitungPembagian(String nil, String nil2){
        double n,n2,nilai;
        n = Double.parseDouble(nil);
        n2 = Double.parseDouble(nil2);
        nilai = n/n2;
        System.out.println("\nnilai pembagian adalah : "+nilai);
        return nilai;
    }
}
