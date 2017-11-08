/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//paso 1 Importar 
package graficas;
import javax.swing.*;//Liberia grafica estandar multiplataforma
import java.awt.*;// Libreria grafica del sistema operativo
// PASO 8: IMPORTAR LA CLASE QUE CONTIENE GUI
import gui.MiVentana; // Paquete.clase

/**
 *
 * @author LAB01
 */
public class Graficas {

    /**
     * @param args the command line arguments
     */
    //paso 9: LLAMADO A LA CLASE
    public static void main(String[] args) 
    {
       MiVentana miventana = new MiVentana(); //Creamos un objeto tipo JFrame
   miventana.setVisible(true);//Esta sentencia muestra la ventana
   miventana.setBounds(0,0,400,400);//Le asigna tamaño a la ventana // TODO code application logic here
   miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta  sentencia cerra la venatana
   
    }
   
}
