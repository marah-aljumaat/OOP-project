
public class Kare extends ikiBoyutlu{
	
	public Kare(double uzunluk){
		this.uzunluk=uzunluk;
	}
	
	public double alanHesaplama() {
		double alan= Math.pow(uzunluk,2);
		return alan;
		
	}
	
	public double cevreHesaplama() {
		double cevre=4*uzunluk;
		return cevre;
		
	}

}
