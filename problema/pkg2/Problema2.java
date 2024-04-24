
package problema.pkg2;

import paqueteHora.horaClass;

public class Problema2 {

    public static void main(String[] args) {
        
        horaClass hora1 = new horaClass();
        
        hora1.setHoras(15);
        hora1.setMinutos(900);
        hora1.setSegundos(54000);
        hora1.setDias(0.625);
        
        System.out.println("La hora es: "+ hora1.getHoras()+ ", en minutos es: "+ hora1.getMinutos()+ ", en segundos es: "+ hora1.getSegundos()+ " y en dias es: "+ hora1.getDias());
    }
}
    
        

