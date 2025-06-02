import java.io.IOException;
import java.util.Scanner;

public class ConversorDeMoneda {

    public static void convertirMoneda(String monedaBase, String monedaTarget, ConsultaMoneda consultaMoneda, Scanner scanner) throws IOException, InterruptedException {

        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consultaMoneda.encontrarMoneda(monedaBase,monedaTarget);
        System.out.println("1"+monedaBase+"="+moneda.conversion_rate()+" "+monedaTarget);
        System.out.println("Indique la cantidad que desea convertir");
        cantidad = scanner.nextDouble();
        cantidadConvertida = cantidad*moneda.conversion_rate();
        System.out.println("La cantidad total convertida es " +cantidadConvertida+" "+monedaTarget);
    }

    public static void convertirMasMonedas(ConsultaMoneda consultaMoneda,Scanner scanner) throws IOException, InterruptedException {

        System.out.println("Ingresa la moneda base a convertir");
        String monedaBase = scanner.nextLine().toUpperCase();
        System.out.println("Ingresa la moneda que desea obtener");
        String monedaAObtener = scanner.nextLine().toUpperCase();
        convertirMoneda(monedaBase,monedaAObtener,consultaMoneda,scanner);
    }
}
