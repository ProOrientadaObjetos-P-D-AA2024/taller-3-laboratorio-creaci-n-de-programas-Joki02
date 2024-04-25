package ejercicio4;

import java.util.Scanner;
import paquete2.Dispositivo;
public class ejecutorDispositivo {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        //Variables segun clase alumno
        String nomSis,direcMac,IMEI;
        double tamano,costIn,iva;
        
        //crear un objeto
        //Nombre de la clase
        //nombre del objeto
        //la palabra reservada new
        //constructor-metodo
        Dispositivo Dispositivo1 =new Dispositivo();
        //pedir datos 
        System.out.println("------------------------------------");
        System.out.println("Uso de clase Dispositvo: ");
        System.out.println("------------------------------------");
        System.out.print("Ingrese el nombre del Sistema operativo: ");
        nomSis = e.nextLine();
        System.out.print("Ingrese la direcion Mac del dispositivo: ");
        direcMac= e.nextLine();
        System.out.print("Ingrese la informacion IMEI: ");
        IMEI= e.nextLine();
        System.out.print("Ingrese el tamano de la pantalla en pulgadas: ");
        tamano= e.nextDouble();
        System.out.print("Ingrese el costo inicial: ");
        costIn= e.nextDouble();
        System.out.println("Ingrese el numero de porcentaje del iva: ");
        iva= e.nextDouble();
        
        Dispositivo1.setNomSis(nomSis);
        Dispositivo1.setTamano(tamano);
        Dispositivo1.setDirecMac(direcMac);
        Dispositivo1.setIMEI(IMEI);
        Dispositivo1.setCostIn(costIn);
        Dispositivo1.setIva(iva);
        Dispositivo1.calcularIva();
        Dispositivo1.costoFi();
        System.out.println("================================");
        System.out.println("Informacion del objeto");
        System.out.println("================================");
        System.out.println("El dispositivo con sistema operativo "+Dispositivo1.getNomSis()+" con direccion Mac "+Dispositivo1.getDirecMac()+" y con informacion IMEI "+Dispositivo1.getIMEI());
        System.out.println("Datos Precios");
        System.out.println("================================");
        System.out.println("Precio inicial: "+Dispositivo1.getCostIn());
        System.out.println("Valor IVA "+Dispositivo1.getIva());
        System.out.println("Precio final "+Dispositivo1.getCostFi());
    }
    
}
