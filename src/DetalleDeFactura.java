import java.util.Scanner;
//Challenge Segundo modulo

public class DetalleDeFactura {
    public static void main (String[] args) {

        double montoFactura1 = 0;
        double montoFactura2 = 0;
        String nombreFactura = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca nombre de la factura");
        nombreFactura = scanner.nextLine();

        System.out.println("Introduzca el monto de la 1° Factura");
        montoFactura1 = scanner.nextDouble();
        System.out.println("Introduzca el monto de la 2° Factura");
        montoFactura2 = scanner.nextDouble();


        System.out.println("Tu Factura nombre es: " + nombreFactura);
        System.out.println("Tu Monto 1° Factura es: " + montoFactura1);
        System.out.println("Tu Monto 2° Factura es: " + montoFactura2);

        double montoSinImpuesto = montoFactura1 + montoFactura2;
        double montoCon19Porciento = montoSinImpuesto * 0.19;
        double montoConImpuesto = montoCon19Porciento + montoSinImpuesto;

        System.out.println("La factura "+ nombreFactura + " producto de oficina tiene un total bruto de " + montoSinImpuesto + ", con un impuesto de " + montoCon19Porciento + " y el monto después de impuesto es de " + montoConImpuesto  );

    }

}
