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
public class Productos {
    public int electricos;
    public int automotrices;
    public int construccion;

 
    
    public int getElectricos() {
        electricos = Integer.parseInt(JOptionPane.showInputDialog("La factura contiene productos electricos"));
        return electricos;
    }

    public void setElectricos(int electricos) {
        this.electricos = electricos;
    }

    public int getAutomotrices() {
        automotrices = Integer.parseInt(JOptionPane.showInputDialog("La factura contiene productos automotrices"));
        return automotrices;
    }

    public void setAutomotrices(int automotrices) {
        this.automotrices = automotrices;
    }

    public int getConstruccion() {
        construccion = Integer.parseInt(JOptionPane.showInputDialog("La factura contiene productos construccion"));
        return construccion;
    }

    public void setConstruccion(int construccion) {
        this.construccion = construccion;
    }
    
    
}
