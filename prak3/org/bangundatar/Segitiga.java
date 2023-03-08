/**
* File		:	Segitiga.java 08/03/23
* Penulis	:	Dhiya Ulhaq
* Deskripsi :	representasi dasar dari objek segitiga, turunan kelas poligon
*/
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double panjang, lebar;
	
	public Segitiga(double panjang, double lebar, int jumlahSisi){
		this.panjang = panjang;
		this.lebar = lebar;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return panjang * lebar;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi"+this.getJumlahSisi());
	}
}
	