/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.kendaraan;

/**
 *
 * @author hajarhanifah
 */
public class PerahuLayar extends KendaraanLaut {

    protected String bentukLayar;
    protected String jenisKapal;

    public PerahuLayar(String seriKendaraan, String merk, int tahun) {
        super(seriKendaraan, merk, tahun);
    }

    public void setPerahuLayar(String bentukLayar, String jenisKapal) {
        this.bentukLayar = bentukLayar;
        this.jenisKapal = jenisKapal;
    }

    public void viewPerahuLayar() {
        super.viewKendaraanLaut();
        System.out.println("Bentuk Layar : " + bentukLayar);
        System.out.println("Jenis Kapal : " + jenisKapal);
    }

}
