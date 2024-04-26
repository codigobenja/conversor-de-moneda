package com.aluracursos.conversordemoneda.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        double valorConvertir=0;
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
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor que deseas convertir");
                     valorConvertir = teclado.nextDouble();
                    break;
                case 2:
                    System.out.println("Ingrese el valor que deseas convertir");
                     valorConvertir = teclado.nextDouble();
                    break;
                case 3:
                    System.out.println("Ingrese el valor que deseas convertir");
                     valorConvertir = teclado.nextDouble();
                    break;
                case 4:
                    System.out.println("Ingrese el valor que deseas convertir");
                     valorConvertir = teclado.nextDouble();
                    break;
                case 5:
                    System.out.println("Ingrese el valor que deseas convertir");
                     valorConvertir = teclado.nextDouble();
                    break;
                case 6:
                    System.out.println("Ingrese el valor que deseas convertir");
                     valorConvertir = teclado.nextDouble();
                    break;
                case 7:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    break;
                case 8:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    break;
                case 9:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    break;
                case 10:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    break;
                case 11:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    break;
                case 12:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    break;
                case 13:
                    System.out.println("Ingrese la moneda base");
                    //variable
                    System.out.println("Ingrese la moneda destino");
                    //aqui va otra variable
                    System.out.println("Ingrese el valor que deseas convertir");
                    valorConvertir = teclado.nextDouble();
                    break;
                case 14:
                    System.out.println("Gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
