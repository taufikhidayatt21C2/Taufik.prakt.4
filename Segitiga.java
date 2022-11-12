public class Segitiga extends BangunDatar{
    protected  final int alas = 3;
    protected final  int tinggi = 4;

    public  float luas(){
        return (float) (0.5 * this.alas * this.tinggi);
    }

    public float keliling(){
        return (float) (3 * this.alas);
    }
}
