import java.util.Scanner;

public class camila {
    public camila() {
    }

    public static void main(String[] args) {
        System.out.println("Hola empleado, por favor digite:");
        Scanner entrada = new Scanner(System.in);
        System.out.println("tu nombre");
        String cadena = entrada.nextLine();
        System.out.println("tu apellido");
        String cadena1 = entrada.nextLine();
        System.out.println("tu edad");
        int num = entrada.nextInt();
        System.out.println("¿cuantas horas trabaja al dia?");
        int num1 = entrada.nextInt();
        System.out.println("tu nombre es " + cadena + " tu apellido es " + cadena1);
        System.out.println("tu edad es " + num);
        System.out.println("usted trabaja: " + num1 + " horas");
        System.out.println("su salario minimo  es de " + 800000 * num1);
    }
}