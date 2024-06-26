package com.aluracursos.conversordemoneda.conexion;

import com.aluracursos.conversordemoneda.modelos.Moneda;
import com.aluracursos.conversordemoneda.modelos.MonedaExchangeRate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Conexion {
    List<Moneda> monedasJson = new ArrayList<>();
    List<String> monedas= new ArrayList<>();
    Gson gson = new GsonBuilder().create();

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

        MonedaExchangeRate monedaExRa = gson.fromJson(json, MonedaExchangeRate.class);
        try {
            Moneda miMoneda = new Moneda(monedaExRa, montoConvertir);
            System.out.println(miMoneda.getBaseCode()+ " "+ miMoneda.getMontoBase()+" a "+ miMoneda.getTargetCode()+ " Son: "+ miMoneda.getConversionResult()+ " con un factor de conversion: "+ miMoneda.getConversionRate());
            monedasJson.add(miMoneda);
            monedas.add(miMoneda.toString());
        }
        catch (Exception e)
        {
            System.out.println("Ha ocurrido un error con el codigo de las divisas a convertir, favor de ingresar una divisa valida");
            System.out.println("En el siguiente sitio web puede encontrar un listado de los codigos de divisas: https://es.iban.com/currency-codes");
        }



    }

    public void CloseConexion() throws IOException {
        LocalDateTime hoy = LocalDateTime.now();

        FileWriter escrituraJson = new FileWriter("monedas"+"_"+hoy.getDayOfMonth()+"_"+ hoy.getMonth()+"_"+ hoy.getYear()+"-"+hoy.getHour()+"-"+ hoy.getMinute()+".json");
        escrituraJson.write(gson.toJson(monedasJson));
        escrituraJson.close();

        FileWriter escritura = new FileWriter("monedas"+"_"+hoy.getDayOfMonth()+"_"+ hoy.getMonth()+"_"+ hoy.getYear()+"-"+hoy.getHour()+"-"+ hoy.getMinute()+".txt");
        escritura.write(gson.toJson(monedas));
        escritura.close();

    }
}
