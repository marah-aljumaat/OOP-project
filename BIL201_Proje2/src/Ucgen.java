
public class Ucgen extends ikiBoyutlu{
	public double taban;
	public double yukseklik;
	public double uzunluk2;
	public double uzunluk3;
	
	public Ucgen(double taban,double yukseklik,double uzunluk,double uzunluk2,double uzunluk3){
		this.taban=taban;
		this.yukseklik=yukseklik;
		this.uzunluk=uzunluk;
		this.uzunluk2=uzunluk2;
		this.uzunluk3=uzunluk3;
	
	}
	

	
	public double alanHesaplama() {
		double alan= 0.5*taban*yukseklik;
		return alan;
	}
	
	public double cevreHesaplama() {
		double cevre=uzunluk+uzunluk2+uzunluk3;
		return cevre;
		
	}
	
	

}
