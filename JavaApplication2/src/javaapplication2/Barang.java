package javaapplication2;

public class Barang {
	private int id;
	private String nama;
	private int jml_barang;
	
	public Barang(int id, String nama, int jml_barang){
		this.id = id;
		this.nama = nama;
		this.jml_barang = jml_barang;
	}	
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setJml_barang(int jml_barang){
		this.jml_barang = jml_barang;
	}
	
	public int getJml_barang(){
		return jml_barang;
	}
}
