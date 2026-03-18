package Poo.exercise6.entities;

public class CurrencyConverter {
    public static double IOF = 0.06;
    private double dollarValue;
    private double dollarQuantity;

    public double getDollarValue() {
        return dollarValue;
    }
    public void setDollarValue(double dollarValue){
        this.dollarValue = dollarValue;
    }
    public double getdollarQuantity(){
        return dollarQuantity;
    }
    public void setDollarQuantity( double dollarQuantity){
        this.dollarQuantity = dollarQuantity;
    }

    public double dollarToReal(){
        return (dollarValue * IOF + dollarValue) * dollarQuantity;
    }
    public String toString(){
        return String.format("%.2f",dollarToReal());
    }



}
