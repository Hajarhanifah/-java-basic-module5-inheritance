/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.kendaraan;

/**
 *
 * @author hajarhanifah
 */
public class Kendaraan {

    protected String seriKendaraan;
    protected String merk;
    protected int tahun;

    public Kendaraan(String seriKendaraan, String merk, int tahun) {
        this.seriKendaraan = seriKendaraan;
        this.merk = merk;
        this.tahun = tahun;
    }

    public void viewKendaraan() {
        System.out.println("Seri Kendaraan : " + seriKendaraan);
        System.out.println("Merk : " + merk);
        System.out.println("tahun : " + tahun);
    }

}
