import java.util.Scanner;

public class Entrada {

    Scanner myObj = new Scanner(System.in);

    // ATRIBUTOS
    String nombreEvento;
    double precioEntrada;

    // CONSTRUCTOR
    public Entrada(){
        System.out.println("Ingresa el nombre del evento:");
        nombreEvento = myObj.nextLine();

        System.out.println("Ingresa el precio del evento:");
        precioEntrada = Double.parseDouble(myObj.nextLine());
    }

    //MÉTODOS
    public void mostrarInformacion(){
        System.out.println("EVENTO: " + nombreEvento + " | PRECIO: $" + precioEntrada);
    }
}
