# Taufik.prakt.4
Nama,Taufik Hidayat,Nim,312110066,Kelas,TI21.c2,Tugas pert.7


#Karena yang kita panggil sebenarnya adalah method luas() dan keliling() milik si induk (BangunDatar).

Objek anak dari BangunDatar belum memiliki method luas() dan keliling(), akhirnya mengambil milik induknya.

Lalu bagaimana kalau kita ingin membuat agar semua class anak memiliki method luas() dan keliling() yang berbeda dari induk?

Jawabanya: menggunakan method overriding.#


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


![image](https://user-images.githubusercontent.com/116345854/201451114-51764916-a8d9-4799-8f6a-c851f3fc32aa.png)

Method Overriding dilakukan saat kita ingin membuat ulang sebuah method pada sub-class atau class anak.

 nah jadi Inheritance adalah salah satu pilar penting dalam OOP yang harus dipahami dan di mengerti. Karena akan sering menggunakannya dalam pembuatan program.
