
package paquete2;

public class Dispositivo {
    public String nomSis,direcMac,IMEI;
    public double tamano,costIn,costFi,iva;

    public String getNomSis() {
        return nomSis;
    }

    public void setNomSis(String nomSis) {
        this.nomSis = nomSis;
    }

    public String getDirecMac() {
        return direcMac;
    }

    public void setDirecMac(String direcMac) {
        this.direcMac = direcMac;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getCostIn() {
        return costIn;
    }

    public void setCostIn(double costIn) {
        this.costIn = costIn;
    }

    public double getCostFi() {
        return costFi;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getIva() {
        return iva;
    }
    
    public void costoFi(){
        costFi= costIn+
                
                iva;
    }
    
    public void calcularIva(){
        iva= (iva/100)*(costIn);
    }
}
