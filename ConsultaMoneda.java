import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda encontrarMoneda(String monedaBase, String monedaTarget) throws IOException, InterruptedException {

        String direccion = "https://v6.exchangerate-api.com/v6/b3657e56053dc65c43800436/pair/"+monedaBase+"/"+monedaTarget;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            return new Gson().fromJson(json, Moneda.class);
        }

        catch (Exception e){

            throw new RuntimeException("La moneda no se encontro");
        }


    }
}
