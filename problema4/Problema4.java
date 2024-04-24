
package problema4;

import paqueteCelular.celularClass;

public class Problema4 {


    public static void main(String[] args) {
        
        celularClass c1 = new celularClass();

        
        c1.setCosto(1000);
        c1.setDireccionMac(dh45h45h6h8j6k1);
        c1.setImei(787835);
        c1.setSistemaOperativo(IOS);
        c1.setTamanoPantalla(7);
        
        System.out.println("El sistema operativo es:"+c1.getSistemaOperativo()+", El costo es de: "+c1.getCosto()+", el tamaño de la pantalla es de: "+ c1.getTamanoPantalla()+" y la direccion MAC es: "+ c1.getDireccionMac());
    }
    
}
