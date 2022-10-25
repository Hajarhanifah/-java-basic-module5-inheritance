/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.kendaraan;

/**
 *
 * @author hajarhanifah
 */
public class Main {

    public static void main(String[] args) {
        PerahuLayar perahuLayar = new PerahuLayar("001", "Kalibri", 1990);
        SepedaMotor sepedaMotor = new SepedaMotor("004", "Honda", 2022, 2);

        perahuLayar.setKendaraanLaut("Angin", "Kayu");
        perahuLayar.setPerahuLayar("Segi Tiga", "Kapal Layar Bercadik");

        sepedaMotor.setInfoSepedaMotor("Ban Tubles", "ka-90812");

        System.out.println("KENDARAAN DARAT");
        System.out.println("___________________________");
        sepedaMotor.viewSepedaMotor();
        System.out.println("");
        System.out.println("___________________________");
        System.out.println("KENDARAAN LAUT");
        System.out.println("___________________________");
        perahuLayar.viewPerahuLayar();
    }

}
