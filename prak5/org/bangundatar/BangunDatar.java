/*
BangunDatar.java 2/4/23
Penulis : Dhiya Ulhaq
Deskripsi : kelas abstrak, berisi abstraksi bangun datar
*/

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas (double l){
        luas = 1;
    }

    public double getLuas() {
        return luas;
    }
}