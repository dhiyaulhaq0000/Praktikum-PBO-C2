/*Dhiya Ulhaq 24060121140134*/
class Titik{
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
		}	
		Titik(double a,double o){
			counterTitik++;
			absis = a;
			ordinat = o;
	}
	void setAbsis(double a){
		absis=a;
	}
	void setOrdinat (double o) {
		ordinat = o;
	}
	double getAbsis(){
		return absis;
	}
	double getOrdinat(){
		return ordinat;
	}
	int getCounterTitik(){
		return counterTitik;
	}
}
