	
public class Daire extends ikiBoyutlu {
	public double yariCapi;
	
	public Daire(double yariCapi){
		this.yariCapi=yariCapi;
	}
	
	
	public double alanHesaplama() {
		double alan= Math.pow(yariCapi,2)*PI;
		return alan;
	}
	
	
	
	public double cevreHesaplama() {
		double cevre=2*yariCapi*PI;
		return cevre;
	}
	

	
	
}
