import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double peso;
        String resumen;
        System.out.println("CALCULADORA DE ENVÍOS E-COMMERCE");
        do {
            System.out.println("Ingrese por favor el peso del paquete: ");
            peso = scanner.nextDouble();
            scanner.nextLine();
            if (!ModuloFunciones.validarPeso(peso)){
                System.out.println("Peso incorrecto. Este debe estar entre 0 y 50 kilogramos");
            }
        }while(!ModuloFunciones.validarPeso(peso));

        System.out.println("Ingrese la distancia para la entrega del paquete en kilómetros: ");
        int km = scanner.nextInt();
        scanner.nextLine();
        while(km < 0) {
            System.out.println("Ingrese nuevamente la distancia para la entrega del paquete en kilómetros: ");
            km = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Ingrese el tipo de envío: ");
        String tipo = scanner.nextLine().toLowerCase();
        while(!tipo.equals("normal") && !tipo.equals("express") && !tipo.equals("prioritario") ) {
            System.out.println("Ingrese  nuevamente el tipo de envío: ");
            tipo = scanner.nextLine().toLowerCase();

        }

        resumen = ModuloFunciones.generarResumen(peso,km, tipo);
        System.out.println(resumen);
    }
}
