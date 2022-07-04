import java.util.Scanner;

public class EstanqueDeGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca medida actual en litros");

        int capacidadActual = scanner.nextInt();

        if (capacidadActual >= 70) {
            System.out.println("Estanque LLeno");
        }
        else if (capacidadActual >= 60 && capacidadActual < 70){
            System.out.println("Estanque casi lleno");
        }
        else if (capacidadActual >= 40 && capacidadActual < 60){
            System.out.println("Estanque 3/4");
        }
        else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("Medio Estanque");
        }
        else if (capacidadActual >= 20 &&   capacidadActual < 35){
            System.out.println("Suficiente");
        }
        else {
            System.out.println("Insuficiente");
        }

    }
}
