package com.aluracursos.conversordemoneda.modelos;

import java.time.LocalDateTime;

public class Moneda {
    private String baseCode, targetCode;
    private Double conversionRate, conversionResult, montoBase;

    public Moneda(MonedaExchangeRate monedaExRa, double montoConvertir) {
        this.baseCode = monedaExRa.base_code();
        this.targetCode = monedaExRa.target_code();
        //this.conversionRate = Double.valueOf(monedaExRa.conversion_rate().substring(0,4)
                //.replace(" ",""));
        this.conversionRate = Double.valueOf(monedaExRa.conversion_rate());
        this.montoBase = montoConvertir;
        this.conversionResult=toConversion();
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public Double getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(Double montoBase) {
        this.montoBase = montoBase;
    }

    public Double getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(Double conversionResult) {
        this.conversionResult = conversionResult;
    }

    public String toString() {
        return "(Moneda base:" + baseCode +
                ", Moneda destino:"  + targetCode +
                ", Factor de conversion:" + conversionRate +
                ", Monto a convertir:"+ montoBase +
                ", Resultado:"+ conversionResult +
                ", Hora de operacion:"+ LocalDateTime.now()+")";
    }

    public Double toConversion(){
        return montoBase * conversionRate;
    }
}
