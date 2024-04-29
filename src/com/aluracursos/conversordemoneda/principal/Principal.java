package com.aluracursos.conversordemoneda.principal;

import com.aluracursos.conversordemoneda.conexion.Conexion;
import com.aluracursos.conversordemoneda.validaciones.Validacion;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion = 0;
        double valorConvertir=0;
        Conexion miConexion = new Conexion();
        Validacion validacion = new Validacion();
        String valor,opcionValidar;
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
            teclado.reset();
            System.out.println(menu);
            System.out.println("Ingrese una opcion");
            opcionValidar=teclado.nextLine();
            if (validacion.ValidacionNumero(opcionValidar)){
                opcion =Integer.parseInt(opcionValidar);
            }
            else {
                opcion=0;
            }

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("USD","ARS",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("ARS","USD",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("USD","BOB",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("BOB","USD",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("USD","BRL",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("BRL","USD",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 7:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("USD","CLP",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 8:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("CLP","USD",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 9:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("USD","COP",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 10:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("COP","USD",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 11:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("USD","MXN",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 12:
                    System.out.println("Ingrese el valor que deseas convertir");
                    valor = teclado.nextLine();
                    if (validacion.ValidacionNumeroFlotante(valor))
                    {
                        valorConvertir = Double.parseDouble(valor);
                        miConexion.RealizarConexion("MXN","USD",valorConvertir);
                    }
                    else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                    }
                    break;
                case 13:
                    Scanner tecladoVariables = new Scanner(System.in);
                    System.out.println("Ingrese la moneda base");
                    String monedaB = tecladoVariables.nextLine().toUpperCase();
                    if(validacion.ValidacionLetras(monedaB)){
                        System.out.println("Ingrese la moneda destino");
                        String monedaD = tecladoVariables.nextLine().toUpperCase();
                        if(validacion.ValidacionLetras(monedaD)){
                            System.out.println("Ingrese el valor que deseas convertir");
                            valor = teclado.nextLine();
                            if (validacion.ValidacionNumeroFlotante(valor))
                            {
                                valorConvertir = Double.parseDouble(valor);
                                miConexion.RealizarConexion(monedaB,monedaD,valorConvertir);
                            }
                            else{
                                System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                            }
                        }else{
                            System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                            System.out.println("Los identificadores monetarios estan compuestos por 3 letras");
                            break;
                        }
                    }else{
                        System.out.println("vuelva a escoger su opcion e ingrese un valor valido");
                        System.out.println("Los identificadores monetarios estan compuestos por 3 letras");
                        break;
                    }
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
