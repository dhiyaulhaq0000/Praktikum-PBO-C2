/**
* File		:	Segitiga.java 08/03/23
* Penulis	:	Dhiya Ulhaq
* Deskripsi :	representasi dasar dari objek persegi panjang, turunan kelas poligon
*/

package org.main;

import org.bangundatar.*;

public class MSegitiga{
	public static void main(String[] args){
		Segitiga segitiga = new Segitiga(3,3,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	}
}