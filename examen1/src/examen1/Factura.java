/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Factura {

    
    public String Cliente;
    public int Cedula;
    public int CodFactura;
    public int mes;
    public double MontoFactu;


   
    
    public String getCliente() {
        Cliente = JOptionPane.showInputDialog("Digite el nombre del Cliente");
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public int getCedula() {
        Cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del Cliente"));
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getCodFactura() {
        CodFactura = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo de factura"));
        return CodFactura;
    }

    public void setCodFactura(int CodFactura) {
        this.CodFactura = CodFactura;
    }

    public int getMes() {
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes de la factura"));
        switch (mes) {
            case 1 -> System.out.println("Enero");
            case 2 -> System.out.println("Febrero");
            case 3 -> System.out.println("Marzo");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Mayo");
            case 6 -> System.out.println("Junio");
            case 7 -> System.out.println("Julio");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Septiembre");
            case 10 -> System.out.println("Octubre");
            case 11 -> System.out.println("Noviembre");
            case 12 -> System.out.println("Diciembre");
        }
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getMontoFactu() {
        String CalcMonto;
        CalcMonto = JOptionPane.showInputDialog("Digite el nombre del Cliente");
        Double.valueOf(CalcMonto);
        return MontoFactu;
    }

    public void setMontoFactu(double MontoFactu) {
        this.MontoFactu = MontoFactu;
    }

    
}