/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.hnfh.inheritance;

/**
 *
 * @author hajarhanifah
 */
//Class sepeda gunung mewarisi class sepeda
public class SepedaGunung extends Sepeda {

    private int sadel;

    void setSadel(int jumlah) {
        sadel = getGir() - jumlah;
    }

    int getSadel() {
        return sadel;
    }

}
