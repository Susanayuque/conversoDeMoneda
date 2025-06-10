import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        int opcionEscogida=0;

        while (opcionEscogida!=8){
            System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
            System.out.println("Sea bienvenido al conversor de moneda =)");
            System.out.println("Elija un apcion valida");
            System.out.println("-------------------------------\n"
                    +"1) Dolar =>> Peso Argentino"+"\n"
                    +"2) Soles =>> Dolares Australianos"+"\n"
                    +"3) Dolares Australianos =>> dolar"+"\n"
                    +"4) Dolares Australianos =>> soles"+"\n"
                    +"5) Dolar =>> Dolares Australianos"+"\n"
                    +"6) Dolar =>> Peso Colombiano"+"\n"
                    +"7) Otra conversion "+"\n"
                    +"8) Salir");

            opcionEscogida = scanner.nextInt();
            scanner.nextLine();

            switch (opcionEscogida){
                case 1:
                    ConversorDeMoneda.convertirMoneda("USD","ARS", consultaMoneda, scanner);
                    break;
                case 2:
                    ConversorDeMoneda.convertirMoneda("PEN","AUD", consultaMoneda, scanner);
                    break;
                case 3:
                    ConversorDeMoneda.convertirMoneda("AUD","USD", consultaMoneda, scanner);
                    break;
                case 4:
                    ConversorDeMoneda.convertirMoneda("AUD","PEN", consultaMoneda, scanner);
                    break;
                case 5:
                    ConversorDeMoneda.convertirMoneda("USD","AUD", consultaMoneda, scanner);
                    break;
                case 6:
                    ConversorDeMoneda.convertirMoneda("USD","COP", consultaMoneda, scanner);
                    break;
                case 7:
                    ConversorDeMoneda.convertirMasMonedas(consultaMoneda,scanner);
                    break;
                case 8:
                    System.out.println("Hasta pronto ;)");
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }
        }
    }
}
