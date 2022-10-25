/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.kendaraan;

/**
 *
 * @author hajarhanifah
 */
public class SepedaMotor extends KendaraanDarat{
    private String jenisBan;
    private String noStnk;
    
    public SepedaMotor(String seriKendaraan, String merk, int tahun, int jumlahRoda) {
        super(seriKendaraan, merk, tahun, jumlahRoda);
    }
    
    public void setInfoSepedaMotor(String jenisBan, String noStnk){
        this.jenisBan = jenisBan;
        this.noStnk = noStnk;
    }
    
    public void viewSepedaMotor(){
        super.viewKendaraan();
        System.out.println("Jenis Ban : "+jenisBan);
        System.out.println("Nomor STNK : "+noStnk);
    }
    
}
