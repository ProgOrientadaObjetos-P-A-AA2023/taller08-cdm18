/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteNombramiento extends Docente{
    protected double valorSueldo;
    protected double valorHoraExtra;
    protected int horasExtra;
    protected double sueldo;

    public void establecerValorSueldo(double vS) {
        valorSueldo = vS;
    }

    public void establecerValorHoraExtra(double vH) {
        valorHoraExtra = vH;
    }

    public void establecerHorasExtra(int hE) {
        horasExtra = hE;
    }

    public void establecerSueldoFinal() {
        sueldo = valorSueldo + (horasExtra * valorHoraExtra);
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public int obtenerHorasExtra() {
        return horasExtra;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        String mensaje = String.format ("Docente tipo nombramiento\n"
                + "Nombres: %s\n"
                + "Cedula: %s\n"
                + "Valor del sueldo inicial: %.2f\n"
                + "Valor de cada hora extra: %.2f\n"
                + "Numero de horas extra: %d\n"
                + "Sueldo final: %.2f\n",
                nombre,
                cedula,
                valorSueldo,
                valorHoraExtra,
                horasExtra,
                sueldo);
        
        
        return mensaje;
    }
            
}
