/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmendez_examen1p2;

/**
 *
 * @author Juan Carlos Mendez
 */
public class PCS {

    String direccion, mascara, hostname;
    int RAM, almacenamiento;

    public PCS() {
    }

    public PCS(String direccion, String mascara, String hostname, int RAM, int almacenamiento) {
        this.direccion = direccion;
        this.mascara = mascara;
        this.hostname = hostname;
        this.RAM = RAM;
        this.almacenamiento = almacenamiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "PCS{" + "direccion=" + direccion + ", mascara=" + mascara + ", hostname=" + hostname + ", RAM=" + RAM + ", almacenamiento=" + almacenamiento + '}';
    }

}
