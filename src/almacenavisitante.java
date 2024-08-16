import java.util.Scanner;

public class almacenavisitante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);




        System.out.println("Bienvienido al edificio");

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();
        System.out.print("Introduce tu salario: ");
        double salario = teclado.nextDouble();
        System.out.print("Introduce tu tipo de sangre: ");
        char sangre = teclado.next().charAt(0);
        boolean esJubilado = edad > 68;
        int salarioInt = (int) salario;



        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario Final: " + salario);
        System.out.println("Salario (Entero): " + salarioInt);
        System.out.println("Tipo de sangre: " + sangre);
        System.out.println("Es jubilado: " + esJubilado);

        teclado.close();
    }
}
