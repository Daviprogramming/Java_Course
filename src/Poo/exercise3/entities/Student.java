package Poo.exercise3.entities;

public class Student {
    public String name;
    public double primeiroTrimestre;
    public double segundoTrimestre;
    public double terceiroTrimestre;

    public double finalGrade(){
         return (primeiroTrimestre + segundoTrimestre + terceiroTrimestre);
    }
    public String passOrFailed(){
        double missing = 60 - finalGrade();
        return finalGrade() > 60 ? "PASS" : "FAILED\nMISSING" + String.format("%.2f", missing);
    }
    public String toString(){
        return "FINAL GRADE = "
                + finalGrade()
                + "\n"
                + passOrFailed();
    }
}
