/*Dhiya Ulhaq 24060121140134*/
class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat *-1;
		titik.setOrdinat(ordinat);
	}
	
	public void refleksiSumbuY(Titik titik){
		titik.setAbsis(-titik.getAbsis());
	}
	
	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
	
	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}
}
	
