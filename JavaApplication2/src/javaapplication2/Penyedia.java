package javaapplication2;
import java.util.*;


public class Penyedia{
    private String nama;
    private int id;
    private List<Barang> b = new ArrayList<Barang>();

    public Penyedia(int id, String nama){
	this.id=id;
	this.nama=nama;
    }

    public String getNama(){
        return nama;
    }	
    public void setNama(String nama){
	this.nama = nama;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
	this.id = id;
        
    }
    public void createBarang(Barang i){
        b.add(i);
    }
    public Barang getBarang(int i)
    {
        Barang x = null;
        int size = b.size();
        for (int j=0; j<size; j++)
        {
            if (i==b.get(j).getId()){
                x = b.get(j);
            }            
        }
        return x;
    }    
    public void showAllBarang(){
	System.out.println("===Daftar Barang===");
        for (Barang obj : b)
        {
            System.out.println("ID : "+obj.getId());
            System.out.println("Name : "+obj.getNama());
            System.out.println("Jumlah : "+obj.getJml_barang());
            System.out.println("====================================");
        }
    }
    public void removeBarang (int i){
        Barang x = null;
        int size = b.size();
        for (int j=0; j<size; j++)
        {
            if (i==b.get(j).getId()){
                x = b.get(j);
            }            
        }
        b.remove(x);
    }
	
}
