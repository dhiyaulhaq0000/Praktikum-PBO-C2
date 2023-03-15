/**
* File		:	BujurSangkar.java 15/03/23
* Penulis	:	Dhiya Ulhaq
* Deskripsi :	representasi dasar dari objek poligon (segi banyak)
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas() {
		return this.panjangSisi * this.panjangSisi;
	}
	
	public double getPanjangSisi() {
		return this.panjangSisi;
	}
}