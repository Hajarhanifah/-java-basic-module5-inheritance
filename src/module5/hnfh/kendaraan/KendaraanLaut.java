/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.kendaraan;

/**
 *
 * @author hajarhanifah
 */
public class KendaraanLaut extends Kendaraan{
    
    protected String jenisTenagaPenggerak;
    protected String material;
    
    
    public KendaraanLaut(String seriKendaraan, String merk, int tahun) {
        super(seriKendaraan, merk, tahun);
    }
    
    
//    public void set
    public void setKendaraanLaut(String tenagaPenggerak, String material){
        this.jenisTenagaPenggerak = tenagaPenggerak;
        this.material = material;
    }
    
    public void viewKendaraanLaut(){
        super.viewKendaraan();
        System.out.println("Jenis Tenaga Penggerak : "+jenisTenagaPenggerak);
        System.out.println("Material : "+material);
    }
}
