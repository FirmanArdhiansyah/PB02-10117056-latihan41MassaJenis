/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nama : Firman Ardhiansyah
 *         Kelas : IF-2 (PB02)
 *         NIM : 10117056
 * Deskripsi Program : program ini menghitung massa jenis & volume
 */
public class Kubus {

    private int sisi;
    private int massa;

    public int getsisi() {
        return sisi;

    }

    public void setsisi(int sisi) {
        this.sisi = sisi;
    }

    public int getmassa() {
        return massa;

    }

    public void setmassa(int Massa) {
        this.massa = massa;
    }

    public int hitungvolume(int parsisi) {

        return parsisi * parsisi * parsisi;
    }

    public int hitungmassajenis(int parmassa, int volume) {
        //  volume = hitungvolume(this.sisi);
        // parmassa = this.massa;
        return parmassa / volume;
    }
}
