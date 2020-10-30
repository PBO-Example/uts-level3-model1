//Bangunan.java
package uts.pck1;
public abstract class Bangunan{
	//atribut
	protected Alamat alamat;
	protected int tingkat;
	
	public abstract void setAlamat(Alamat alamat);
	public abstract void setTingkat(int tingkat);
	public abstract Alamat getAlamat();
	public abstract int getTingkat();
	
}