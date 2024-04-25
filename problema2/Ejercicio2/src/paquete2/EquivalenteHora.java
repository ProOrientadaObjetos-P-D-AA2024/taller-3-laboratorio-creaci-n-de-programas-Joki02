package paquete2;
public class EquivalenteHora {
    public double segundos,minutos;
   public double dias;
   public int horas;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSegundos() {
        return segundos;
    }

    public double getMinutos() {
        return minutos;
    }

    public double getDias() {
        return dias;
    }
    
    public void calcularMinutos() {
        minutos = horas*60;
    }
    
    public void calcularSegundos() {
        segundos = horas *3600;
    }
    
    public void calcularDias(){
        dias= horas*0.24;
    }
}
