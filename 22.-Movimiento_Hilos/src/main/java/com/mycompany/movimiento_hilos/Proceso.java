/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movimiento_hilos;

/**
 *
 * @author Edgar
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//vamos a crear un tablero donde va a contener todos los elementos para la visualizacion 
//que se va a prestar para animar a los objetos

public class Proceso extends JPanel implements Runnable {
    
    private final Image backgroung;
    //significa que no se va a poder modificar el valor de la variable en ningun momento 
    
    private Image tortuga;
    private Image liebre;
    
    private Thread hilo; //"movimiento"
    
    //coordenadas
    private int x, y;
    
    public Proceso(){
        
        //debemos definir los elementos que se encuentran al inicio de nuestro tablero
        //por defecto tenemos en nuestro tablero un fondo de pantalla de backgroungd
        //debemos de cargar los oarametros y la configuracion de fondo de pantalla
        setBackground(Color.WHITE);
        setDoubleBuffered
    }
}
