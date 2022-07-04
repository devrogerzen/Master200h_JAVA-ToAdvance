import java.util.Scanner;

public class DosNumMayorAMenor {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce primer numero");
        a = scanner.nextInt();
        System.out.println("introduce segundo numero");
        b = scanner.nextInt();


        if (a > b) {
            System.out.println( a +" mayor que "+ b);
        }else {
            System.out.println(b +" mayor que "+ a);
        }
    }
}
/*
import java.util.Scanner;

public class ProgramaOrdenarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + resultado);

    }
}*/
