
package com.manosenelcodigo.paquete2;

import com.manosenelcodigo.paquete1.Padre;
//herencia simple
//es crear una instancia de esa clase
public class Hija extends Padre  {
    
    Hija(String nom,String email)
    {
        super(nom,email);
        
    }
    public static void main(String mama[])
    {
        Hija h=new Hija("Juan Pérez","juanito@hotmail.com");
        System.out.println(h.getNombre());
    }
}
