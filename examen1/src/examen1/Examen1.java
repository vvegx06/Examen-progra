/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Examen1 {

    
    public static void main(String[] args) {
      
      Factura factura= new Factura();
      Vendedor empleado1= new Vendedor();
      empleado1.getNombreAgente();
      empleado1.getCodigo();
      empleado1.getSucursal();
      empleado1.getVehiculo();

      int cantFacturas;
      double suma = 0;
      String lectura1;
      lectura1 = JOptionPane.showInputDialog("Ingrese la cantidad de fecturas realizadas");
      cantFacturas = Integer.parseInt(lectura1);
      for (int i = 0; i < cantFacturas; i++){
          suma += factura.getMontoFactu();

      }
      JOptionPane.showMessageDialog(null, "El agente Vendedor: "+empleado1.NombreAgente+" codigo: "+empleado1.codigo+"/n"+"el resultado de las facturas es de: "+suma+"/n"+" El agente Vendedor "+empleado1.Vehiculo+" cuenta con vehiculo propio"+"/n"+"Sucursal: "+empleado1.Sucursal);
    }
    }
