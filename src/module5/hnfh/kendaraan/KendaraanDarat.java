/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.kendaraan;

/**
 *
 * @author hajarhanifah
 */
public class KendaraanDarat extends Kendaraan {

    private int jumlahRoda;

    public KendaraanDarat(String seriKendaraan, String merk, int tahun, int jumlahRoda) {
        super(seriKendaraan, merk, tahun);
        this.jumlahRoda = jumlahRoda;
    }

    public void viewKendaraan() {
        super.viewKendaraan();
        System.out.println("Jumlah Roda : " + jumlahRoda);
    }

}
