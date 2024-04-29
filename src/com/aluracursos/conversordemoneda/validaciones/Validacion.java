package com.aluracursos.conversordemoneda.validaciones;

public class Validacion {
    public boolean ValidacionNumeroFlotante(String validar) {

        if(validar.matches("^[0-9]+(\\.[0-9]+)?$")){
            double x = Double.parseDouble(validar);
            return x > 0;
        }else{
            return false;
        }
    }
    public boolean ValidacionNumero(String validar) {

        return validar.matches("^[0-9]+([0-9]+)?$");
    }
    public boolean ValidacionLetras(String validar) {

        return validar.matches("^[a-zA-Z ]{3}");
    }
}
