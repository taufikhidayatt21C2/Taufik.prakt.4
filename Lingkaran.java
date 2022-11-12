public class Lingkaran extends BangunDatar{
    protected  final int r = 5;

    public float luas(){
        double phi = 3.14;
        return (float) (phi * r * r);
    }

    public  float keliling(){
        double phi =  3.14;
        return (float) (2 * phi * r);
    }
}
