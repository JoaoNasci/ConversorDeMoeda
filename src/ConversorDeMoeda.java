import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class ConversorDeMoeda {


    public Moeda converso(String base_code,String target_code,double AMOUNT){


        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/fbdcd04824b34fa801b91f06/pair/"
                +base_code+"/"+target_code+"/"+AMOUNT);


        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
