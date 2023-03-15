/**
* File		:	MKubus.java 15/03/23
* Penulis	:	Dhiya Ulhaq
* Deskripsi :	representasi dasar dari objek poligon (segi banyak)
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Luas Kubus : "+bujurSangkar.getPanjangSisi() + ": " + kubus.hitungLuasAlas());
		System.out.println("Volume Kubus :"+bujurSangkar.getPanjangSisi() + ": " + kubus.hitungVolume());
	}
}