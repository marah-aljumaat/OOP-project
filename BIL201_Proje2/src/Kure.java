
public class Kure extends ucBoyutlu {
	public double yariCapi;
	
	public Kure(double yariCapi){
		this.yariCapi=yariCapi;
	}
	
	public double alanHesaplama() {
		double alan= 4*Math.pow(yariCapi,2)*PI;
		return alan;
		
	}
	
	public double hacimHesaplama() {
		double hacim=1.33*PI*Math.pow(yariCapi,3);
		return hacim;
		
	}
}
