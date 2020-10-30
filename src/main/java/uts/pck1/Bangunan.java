//Bangunan.java
package uts.pck1;
public abstract class Bangunan{
	//atribut
	protected Alamat alamat;
	protected int tingkat;
	
	public Bangunan(){
		alamat=new Alamat();
		tingkat=1;
	}
	public Bangunan(Alamat alamat, int tingkat){
		this.alamat=new Alamat(alamat);
		this.tingkat=tingkat;
	}
	public Bangunan(Bangunan b){
		alamat=new Alamat(b.alamat);
		tingkat=b.tingkat;
	}
	
	public abstract void setAlamat(Alamat alamat);
	public abstract void setTingkat(int tingkat);
	public abstract Alamat getAlamat();
	public abstract int getTingkat();
	
}