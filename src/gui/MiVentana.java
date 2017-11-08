/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//paso 1 Importar 
package gui;
import graficas.*;
import javax.swing.*;//Liberia grafica estandar multiplataforma
import java.awt.*;// Libreria grafica del sistema operativo
/**
 *
 * @author LAB01
 */
// paso 2 Heredar mi clase desde JFrame
public class MiVentana extends JFrame {

   //PASO 3: DECLARAR LOS ELEMENTOS QUE VAMOS A UTILIZAR
    JPanel mipanel;//CREACION DE OBJETOS JPanel
    JLabel milabel;
    JTextField mitexto;
    JButton miboton;
    //Paso 4  DEFINICION DEL CONSTRUCTOR DE LA CLASE
    public MiVentana()//TIENE EL MISMO NOMBRE DE LA CLASE
    {
        //PASO 5:CREAR E INICIALIZAR LOS OBJETOS QUE UTILIZAREMOS 
        mipanel = new JPanel();//CREAMOS UN BOJETO
        milabel = new JLabel();
        mitexto = new JTextField(10);// 10 son los caracteres
        miboton = new JButton();
        
        //PASO 6: AGREGAR LOS ELEMENTOS AL JFrame
        
        this.add(mipanel);// Agregamos el JPanel al JFrame
        mipanel.add(milabel);//Agregamos los elementos al JPanel
        mipanel.add(mitexto);
        mipanel.add(miboton);
        
        //PASO 7: PROPIEDADES A CADA ELEMENTOS
        
        milabel.setText("campo");//
        miboton.setText("presioname");
    }
  /*  public static void main(String[] args) 
    {
       JFrame miventana = new JFrame(); //Creamos un objeto tipo JFrame
   miventana.setVisible(true);//Esta sentencia muestra la ventana
   miventana.setBounds(0,0,400,400);//Le asigna tamaño a la ventana // TODO code application logic here
   miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta  sentencia cerra la venatana
   
    }*/
   
}
