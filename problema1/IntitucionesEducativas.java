package intitucioneseducativas;
import java.util.Scanner;
public class IntitucionesEducativas {

    public static void main(String[] args) {
        
        System.out.println("INSTITUCIONES EDUCATIVAS");
        Scanner leer = new Scanner(System.in);

        Intituciones uno = new Intituciones();

        String tipoIntitucion;
        String nombreInstitucion;
        double numAlum;
        double numDocentes;
        double numSede;

        System.out.println("Escriba el tipo institución Educativa: ");
        tipoIntitucion = leer.nextLine();

        uno.setTipoInstitucion(tipoIntitucion);

        System.out.println("Escriba el nombre de la Intitucion Educativa: ");
        nombreInstitucion= leer.nextLine();

        uno.setNombre(nombreInstitucion);

        System.out.println("Número de alumnos: ");
        numAlum = leer.nextDouble();

        uno.setNumeroAlumnos(numAlum);

        System.out.println("Número de docentes: ");
        numDocentes = leer.nextDouble();

        uno.setNumeroDocentes(numDocentes);

        System.out.println("Número de sedes: ");
        numSede = leer.nextDouble();

        uno.setNumeroSedes(numSede);

        uno.CalcularPresupuesto();

        System.out.println("El presupuesto es: " + uno.PresentarPresupuesto());


    }
}


