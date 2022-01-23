
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edgar
 */
public class Cajera {

}

public String getNombre(){
    return nombre;
} 

public void SetNombre(String nombre)  {
    this.nombre = nombre;
}

public void procesrCompra(cliente cliente, long timeStamp){
    System.out.println("La cajera : " +this.nombre
        + "Comienza a procesar su compra señor cliente: "
        + cliente.getNombre() + "\n En el tiempo: "
        + (System.currentTimeMillis()   timeStampl/1000 + "Segundos");
//tenemos que obtener todos los productos del carrito
}

private void esperarXsegundos(int segundos){
    try{
        Thread.sleep(segundos*1000);
    }catch(InterruptedException ex){
        Thread.currentThread().interrupt();
} 
