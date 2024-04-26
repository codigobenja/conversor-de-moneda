package com.aluracursos.conversordemoneda.conexion;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Conexion {
    public void RealizarConexion ( String monedaBase, String monedaDestino, double montoConvertir ) throws IOException, InterruptedException {

        String clave = "67e9e904b43f50ebfda6f534";
        String direccion = "https://v6.exchangerate-api.com/v6/"
                +clave+"/pair/"
                +monedaBase+"/"+monedaDestino+"/"
                +montoConvertir;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);
    }
}
