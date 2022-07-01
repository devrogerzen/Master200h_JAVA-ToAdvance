import java.util.Scanner;
//Challenge Tercer Modulo
public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        String nombre1 = "roger";
        String nombre2 = "liset";
        String nombre3 = "victoria";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 1º nombre" );
        //nombre1 = scanner.nextLine();
        System.out.println("Introduce 2º nombre" );
        //nombre2 = scanner.nextLine();
        System.out.println("Introduce 3º nombre" );
        //nombre3 = scanner.nextLine();
        System.out.println(nombre1.toUpperCase().charAt(1) +"."+ nombre1.substring(nombre1.length()-2) + "_" + nombre2.toUpperCase().charAt(1) +"."+ nombre2.substring(nombre2.length()-2) + "_" + nombre3.toUpperCase().charAt(1) +"."+ nombre3.substring(nombre3.length()-2) );

    }

}
