package costoterreno;
import java.util.Scanner;

public class CostoTerreno {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double anchoTerreno;
        double largoTerreno;
        double metroCuadrado;

        Terreno uno = new Terreno();
        
        System.out.println("COSTO TOTAL DEL TERRENO");

        System.out.println("Ingrese el ancho del terreno en metros ");
        anchoTerreno = leer.nextDouble();

        uno.setAncho(anchoTerreno);

        System.out.println("Ingrese el largo del terreno en metros: ");
        largoTerreno = leer.nextDouble();

        uno.setLargo (largoTerreno);

        uno.calcularArea();

        System.out.println("Ingrese el valor del metro cuadrado: ");
        metroCuadrado = leer.nextDouble();

        uno.setValorMetroCuadrado(metroCuadrado);

        uno.costoDelTerreno();

        System.out.println("El ancho es: " + uno.getAncho());
        System.out.println("El largo es: "+ uno.getLargo());
        System.out.println("El costo de Metro cuadrado es: "+ uno.getValorMetroCuadrado());
        System.out.println("El costo del terreno es: "+ uno.ObtenerCostoTerreno());

    }
}