
package com.manosenelcodigo.paquete2;

import com.manosenelcodigo.paquete1.Padre;

public class Colaboracion {
    
    private Padre p;
    
    Colaboracion ()
    {
        this.p=new Padre("Pedro", "Fernández");
    }
    public static void main(String avrg[])
    {
        Colaboracion c=new Colaboracion();
        System.out.println(c.p.getNombre());
    }
}
