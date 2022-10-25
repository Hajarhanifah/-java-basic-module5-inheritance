/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.overloading;

/**
 *
 * @author hajarhanifah
 */
public class Mahasiswa {

    private int jumlah;

    public void getInformasiKelasMahasiswa(int laki, int perempuan, String kelas) {
        jumlah = laki + perempuan;
        System.out.println(kelas + " , Jumlah Mahasiswa = " + jumlah);
    }

    public void getInformasiAngkatanMahasiswa(int mhsLama, int mhsBaru, int mhsCuti, int angkatan) {
        jumlah = mhsLama + mhsBaru + mhsCuti;
        System.out.println("Sampai tahun " + angkatan + ", Jumlah mahasiswa : " + jumlah);

    }

}
