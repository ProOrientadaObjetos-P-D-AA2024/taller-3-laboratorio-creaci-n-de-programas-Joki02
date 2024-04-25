package ejercicio2;
import java.util.Scanner;
import paquete2.EquivalenteHora;
public class Ejecutor {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int horas;
        
        EquivalenteHora Hora1 = new EquivalenteHora();
        System.out.println("------------------------------------");
        System.out.println("Uso de clase Equivalente Horas: ");
        System.out.println("------------------------------------");
        System.out.print("Ingrese el numero de horas que desea transformar a minutos,segundos y dias: ");
        horas = e.nextInt();
        
        Hora1.setHoras(horas);
        Hora1.calcularDias();
        Hora1.calcularMinutos();
        Hora1.calcularSegundos();
        System.out.println("================================");
        System.out.println("Conversiones: ");
        System.out.println("================================");
        System.out.println(" El numero de "+Hora1.getHoras()+" horas es equivalente a "+Hora1.getMinutos()+" minutos y "+ Hora1.getSegundos()+" segundos y a "+Hora1.getDias()+" dias");
    }
    
}
