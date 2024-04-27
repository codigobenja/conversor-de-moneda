package com.aluracursos.conversordemoneda.principal;

import com.aluracursos.conversordemoneda.conexion.Conexion;
import com.aluracursos.conversordemoneda.modelos.Moneda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion = 0;
        double valorConvertir=0;
        List<Moneda> monedas = new ArrayList<>();
        Conexion miConexion = new Conexion();
        String menu = """
                ********************************************************
                Sea bienvenido al conversor de monedas :)
                *** Escriba el numero de la opcion deseada ***
                1 - Dolar (USD) a Peso Argentino (ARS)
                2 - Peso Argentino (ARS) a Dolar (USD)
                3 - Dolar (USD) a Boliviano boliviano (BOB)
                4 - Boliviano boliviano (BOB) a Dolar (USD)
                5 - Dolar (USD) a Real Brasileño (BRL)
                6 - Real Brasileño (BRL) a Dolar (USD)
                7 - Dolar (USD) a Peso Chileno (CLP)
                8 - Peso Chileno (CLP) a Dolar (USD)
                9 - Dolar (USD) a Peso Colombiano (COP)
                10 - Peso Colombiano (COP) a Dolar (USD)
                11 - Dolar (USD) a Peso Mexicano (MXN)
                12 - Peso Mexicano (MXN) a Dolar (USD)
                13 - Otro tipo de cambio
                14 - Salir
                ********************************************************
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 14){
            System.out.println(menu);
            System.out.println("Ingrese una opcion");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("USD","ARS",valorConvertir);
                    break;
                case 2:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("ARS","USD",valorConvertir);
                    break;
                case 3:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("USD","BOB",valorConvertir);
                    break;
                case 4:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("BOB","USD",valorConvertir);
                    break;
                case 5:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("USD","BRL",valorConvertir);
                    break;
                case 6:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("BRL","USD",valorConvertir);
                    break;
                case 7:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("USD","CLP",valorConvertir);
                    break;
                case 8:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("CLP","USD",valorConvertir);
                    break;
                case 9:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("USD","COP",valorConvertir);
                    break;
                case 10:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("COP","USD",valorConvertir);
                    break;
                case 11:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("USD","MXN",valorConvertir);
                    break;
                case 12:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    miConexion.RealizarConexion("MXN","USD",valorConvertir);
                    break;
                case 13:
                    Scanner tecladoVariables = new Scanner(System.in);
                    System.out.println("Ingrese la moneda base");
                    String monedaB = tecladoVariables.nextLine();
                    System.out.println("Ingrese la moneda destino");
                    String monedaD = tecladoVariables.nextLine();
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = tecladoVariables.nextDouble();
                    miConexion.RealizarConexion(monedaB,monedaD,valorConvertir);
                    break;
                case 14:
                    System.out.println("Gracias por usar nuestros servicios");
                    miConexion.CloseConexion();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
