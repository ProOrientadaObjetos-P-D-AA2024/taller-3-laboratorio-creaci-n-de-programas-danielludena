
package problema3;

import escuela.escuelaClass;

public class Problema3 {

    public static void main(String[] args) {
        
            escuelaClass escuela = new escuelaClass();
            escuelaClass colegio = new escuelaClass();
            escuelaClass universidad = new escuelaClass();
    
            escuela.setNombre("APC Escuela");
            escuela.setTipo("Primaria");
            escuela.setNumeroAlumnos(500);
            escuela.setNumeroDocentes(32);
            escuela.setNumeroSedes(2);
            
            colegio.setNombre("Liceo de Loja");
            colegio.setTipo("Secundaria");
            colegio.setNumeroAlumnos(700);
            colegio.setNumeroDocentes(47);
            colegio.setNumeroSedes(1);
            
            universidad.setNombre("Universidad Tecnica Particular de Loja");
            universidad.setTipo("Superior");
            universidad.setNumeroAlumnos(40876);
            universidad.setNumeroDocentes(350);
            universidad.setNumeroSedes(1);
            
            
            
            System.out.printf("La Institucion Educativa de nombre: %S \nes de "
                    + "educacion %S \ncuenta con %d sede \nconsta de %d alumnos,"
                    + "y %d docentes.\n\n",
                    escuela.getNombre(),
                    escuela.getTipo(),
                    escuela.getNumeroSedes(),
                    escuela.getNumeroAlumnos(), 
                    escuela.getNumeroDocentes());
            
            System.out.printf("La Institucion Educativa de nombre: %S \nes de "
                    + "educacion %S \ncuenta con %d sede \nconsta de %d alumnos,"
                    + "y %d docentes.\n\n",
                    colegio.getNombre(),
                    colegio.getTipo(),
                    colegio.getNumeroSedes(),
                    colegio.getNumeroAlumnos(), 
                    colegio.getNumeroDocentes());
            
            System.out.printf("La Institucion Educativa de nombre: %S \nes de "
                    + "educacion %S \ncuenta con %d sede \nconsta de %d alumnos,"
                    + "y %d docentes.\n\n",
                    universidad.getNombre(),
                    universidad.getTipo(),
                    universidad.getNumeroSedes(),
                    universidad.getNumeroAlumnos(), 
                    universidad.getNumeroDocentes());
            
    }    
}
