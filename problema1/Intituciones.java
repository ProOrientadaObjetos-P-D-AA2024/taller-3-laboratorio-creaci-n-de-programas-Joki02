package intitucioneseducativas;

public class Intituciones {
     private String nombre;
     private String TipoInstitucion;
     private double NumeroAlumnos;
     private double NumeroDocentes;
     private double NumeroSedes;
     private double GastoEstudiante;
     private double Presupuesto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstitucion() {
        return TipoInstitucion;
    }

    public void setTipoInstitucion(String TipoInstitucion) {
        this.TipoInstitucion = TipoInstitucion;
    }

    public double getNumeroAlumnos() {
        return NumeroAlumnos;
    }

    public void setNumeroAlumnos(double NumeroAlumnos) {
        this.NumeroAlumnos = NumeroAlumnos;
    }

    public double getNumeroDocentes() {
        return NumeroDocentes;
    }

    public void setNumeroDocentes(double NumeroDocentes) {
        this.NumeroDocentes = NumeroDocentes;
    }

    public double getNumeroSedes() {
        return NumeroSedes;
    }

    public void setNumeroSedes(double NumeroSedes) {
        this.NumeroSedes = NumeroSedes;
    }

    public double getGastoEstudiante() {
        return GastoEstudiante;
    }

    public void setGastoEstudiante() {
        GastoEstudiante = 5.0;
    }

    public void CalcularPresupuesto(){
        Presupuesto = NumeroAlumnos * 10;
    }
    public double PresentarPresupuesto(){
        return Presupuesto;
    }
}   

