/**
* File		:	kubus.java 15/03/23
* Penulis	:	Dhiya Ulhaq
* Deskripsi :	representasi dasar dari objek poligon (segi banyak)
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan) {
		this.permukaan = permukaan;
	}
	
	public double hitungLuasAlas() {
		return this.permukaan.hitungLuas();
	}
	
	public double hitungVolume() {
		return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
	}
}