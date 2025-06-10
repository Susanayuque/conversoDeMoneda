import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConversorDeMoneda {

    public static void convertirMoneda(String monedaBase, String monedaTarget, ConsultaMoneda consultaMoneda, Scanner scanner) throws IOException, InterruptedException {

        double cantidad;
        BigDecimal cantidadConvertida;
        String mensajedesalida;
        List<String> listaDeMonedas = new ArrayList<>();

        Moneda moneda = consultaMoneda.encontrarMoneda(monedaBase,monedaTarget);
        System.out.println("1"+monedaBase+"="+moneda.conversion_rate()+" "+monedaTarget);
        System.out.println("Indique la cantidad que desea convertir");
        cantidad = scanner.nextDouble();
        cantidadConvertida =new BigDecimal(cantidad*moneda.conversion_rate()).setScale(2, RoundingMode.HALF_UP);
        System.out.println("La cantidad total convertida es " +cantidadConvertida+" "+monedaTarget);
        mensajedesalida = "La conversion fue la siguiente: "+cantidad+" "+monedaBase+" = " + cantidadConvertida+" "+ monedaTarget;
        listaDeMonedas.add(mensajedesalida);
        System.out.println(listaDeMonedas);
    }

    public static void convertirMasMonedas(ConsultaMoneda consultaMoneda,Scanner scanner) throws IOException, InterruptedException {

        System.out.println("Ingresa la moneda base a convertir");
        String monedaBase = scanner.nextLine().toUpperCase();
        System.out.println("Ingresa la moneda que desea obtener");
        String monedaAObtener = scanner.nextLine().toUpperCase();
        convertirMoneda(monedaBase,monedaAObtener,consultaMoneda,scanner);
    }

}
