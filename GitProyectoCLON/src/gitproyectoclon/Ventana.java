/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitproyectoclon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Clase Ventana Muestra la estructuta que deberia tener una Ventana en Java con
 * la libreria Swing, contiene una etiqueta, un caja de texto y un boton, que
 * tiene la accion de mostrar el texto en la caja por una ventana de mensaje.
 */
public class Ventana extends JFrame {

    private JLabel resultado;           // etiqueta o texto para presentar el resultado    
    private JButton boton0;          // boton con una determinada accion
    private JButton boton1;          // boton con una determinada accion
    private JButton boton2;          // boton con una determinada accion
    private JButton boton3;          // boton con una determinada accion
    private JButton boton4;          // boton con una determinada accion
    private JButton boton5;          // boton con una determinada accion
    private JButton boton6;          // boton con una determinada accion
    private JButton boton7;          // boton con una determinada accion
    private JButton boton8;          // boton con una determinada accion
    private JButton boton9;          // boton con una determinada accion
    private JButton botonS;

    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }
        private void configurarVentana() {
        this.setTitle("Mi Calculadora");                        // colocamos titulo a la ventana
        this.setSize(310, 210);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
        private void inicializarComponentes() {
        // creamos los componentes
        resultado = new JLabel();

        for(int i=0;i<10;i++){
            //JButton boton.concat(i) = new JButton();
        }
        boton0 = new JButton("0");
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton4 = new JButton();
        boton5 = new JButton();
        boton6 = new JButton();
        boton7 = new JButton();
        boton8 = new JButton();
        boton9 = new JButton();
        botonS = new JButton();
        // configuramos los componentes
        resultado.setText("Resultado");    // colocamos un texto a la etiqueta
        resultado.setBounds(50, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
/*
        boton.setText("Mostrar Mensaje");   // colocamos un texto al boton
        boton.setBounds(50, 100, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
        this.add(texto);
        this.add(caja);
        this.add(boton);
*/
    }    
}
