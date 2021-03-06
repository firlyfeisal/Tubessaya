package javaapplication2;
import java.util.*;

public class Gudang {
    private String nama;
    private int id;
    public Gudang(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    private List<Barang> g = new ArrayList<>();
	
    public void addBarang(Barang i){
	g.add(i);   
    }
	
    public Barang getBarangGudang(int i)
    {
        Object[] array = g.toArray();
        return (Barang) array[i];
    } 
	
    public void showAllBarangGudang(){
	System.out.println("===Daftar Barang di Gudang===");
        for (Barang obj : g)
        {           
            System.out.println("ID : "+obj.getId());
            System.out.println("Name : "+obj.getNama());
            System.out.println("Jumlah : "+obj.getJml_barang());
            System.out.println("====================================");
        }
    }	
    public void removeBarang (int i){
        Barang x = null;
        int size = g.size();
        for (int j=0; j<size; j++)
        {
            if (i==g.get(j).getId()){
                x = g.get(j);
            }            
        }
        g.remove(x);
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
