import java.util.*;


public class cadenaInvertida{

    /*
    Vamos a meter una oracion y vamos a invertirla
    */

    Scanner entrada = new Scanner(System.in);

    public void cadenaInvetidapalabras(){

        String cadena = "";

        System.out.println("Ingresa la oracion a invertir: ");

        cadena = entrada.nextLine();

        String invertida = "";

        //tengo que recorrer el tamaño de la cadena
        //al reves

        for(int i = cadena.length()-1; i >= 0; i--){
            //obtener el char por cada posicion de i 
            char car = cadena.charAt(i);
            //se lo sumo a invertida 
            invertida += car;
        }
        System.out.println("La cadena invertida es: " + invertida);

        //hola  -> aloh
    }
}
