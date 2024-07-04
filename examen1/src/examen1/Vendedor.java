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
public class Vendedor {
    public String NombreAgente;
    public int CedulaAgente;
    public int codigo;
    public String Sucursal;
    public String Vehiculo;

   
    public String getNombreAgente() {
        NombreAgente = JOptionPane.showInputDialog("Digite el nombre del Agente");
        return NombreAgente;
    }

    public void setNombreAgente(String NombreAgente) {
        this.NombreAgente = NombreAgente;
    }

    public int getCedulaAgente() {
        CedulaAgente = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del agente"));
        return CedulaAgente;
    }

    public void setCedulaAgente(int CedulaAgente) {
        this.CedulaAgente = CedulaAgente;
    }

    public int getCodigo() {
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del Agente"));
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        Sucursal = JOptionPane.showInputDialog("Ingrese la sucursal del Agente");
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public String getVehiculo() {
        Vehiculo = JOptionPane.showInputDialog("Digite si el Agente posee carro propio o no");
        return Vehiculo;
    }

    public void setVehiculo(String Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    
}
