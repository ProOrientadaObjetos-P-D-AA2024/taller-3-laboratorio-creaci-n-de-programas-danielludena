
package ejecutor;

import paqueteTerreno.terreno;

public class Ejecutor {

    public static void main(String[] args) {


        terreno t = new terreno();
        
        t.setAncho(5430);
        t.setArea(34566);
        t.setCostoTerreno(256578900);
        t.setLargo(32345);
        t.setValorMetroCuadrado(235);
        
        System.out.println("El ancho es: "+t.getAncho()+ ", el area es: "+t.getArea()+", el largo es: "+t.getLargo()+ ", el valor del metro cuadrado es: "+t.getValorMetroCuadrado()+ " y el costo es de: "+t.getCostoTerreno());

    }
}

