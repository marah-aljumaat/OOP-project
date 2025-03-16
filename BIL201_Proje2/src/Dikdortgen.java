
public class Dikdortgen extends ikiBoyutlu{
	
	public Dikdortgen(double uzunluk,double genislik){
		this.genislik=genislik;
		this.uzunluk=uzunluk;
	}
	
	
	
	public double alanHesaplama() {
		double alan= uzunluk*genislik;
		return alan;
		
	}
	
	public double cevreHesaplama() {
		double cevre=2*(uzunluk+genislik);
		return cevre;
	}

}
