/*Dhiya Ulhaq 24060121140134*/
class Mtitik{
	public static void main(String[] args)
	{
		Titik t1 = new Titik();
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);
		
		Titik t2 = new Titik();
		t2.setAbsis(3.0);
		t2.setOrdinat(4.0);
		
		int countertitik = t1.getCounterTitik();
		
		System.out.println("Jumlah objeck titik" + countertitik);
		System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
	}
}
