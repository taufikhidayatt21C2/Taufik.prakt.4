public class Main {
    public static void main(String[] args) {
       Lingkaran lingkaran = new Lingkaran();
       Segitiga segitiga = new Segitiga();
       Persegi persegi = new Persegi();

       System.out.println("Luas Lingkaran : " + lingkaran.luas());
       System.out.println("Keliling Lingkaran: " + lingkaran.keliling() + "\n");

       System.out.println("Luas Segitiga: " + lingkaran.luas());
       System.out.println("Keliling Segitiga: " + lingkaran.keliling() + "\n");

       System.out.println("Luas Segitiga:" + segitiga.luas());
       System.out.println("Keliling Segitiga: " + segitiga.keliling() + "\n");
    }
}