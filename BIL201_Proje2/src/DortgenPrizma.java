
public class DortgenPrizma extends ucBoyutlu {
	
	public DortgenPrizma(double uzunluk,double genislik,double yukseklik){
		this.uzunluk=uzunluk;
		this.genislik=genislik;
		this.yukseklik=yukseklik;
	}
	
	public double alanHesaplama() {
		double alan= 2*(uzunluk*genislik+uzunluk*yukseklik+yukseklik*genislik) ;
		return alan;
		
	}
	
	public double hacimHesaplama() {
		double hacim=uzunluk*genislik*yukseklik;
		return hacim;
		
	}

}
