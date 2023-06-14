/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteFactura extends Docente {
    protected double valorFactura;
    protected double valorIvaDescuento;
    protected double valorCancelar;

    public void establecerValorFactura(double vF) {
        valorFactura = vF;
    }
   
    public void establecerValorCancelar() {
        valorCancelar = valorFactura - (valorIvaDescuento * valorFactura);
    }
    
    public void establecerValorIva(double iva) {
        valorIvaDescuento = iva/100;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    
    @Override
    public String toString() {
        String mensaje = String.format ("Factura docente\n"
                + "Nombres: %s\n"
                + "Cedula: %s\n"
                + "Valor de la factura inicial: %.2f\n"
                + "Valor del iva de descuento: %.2f\n"
                + "Valor a cancelar: %.2f\n",
                nombre,
                cedula,
                valorFactura,
                valorIvaDescuento,
                valorCancelar);
        
        
        return mensaje;
    }
    


}


