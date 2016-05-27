
package com.manosenelcodigo.paquete1;

public class Padre {
    
   private String nombre;
   private String correo;
   
    public Padre (String n,String c )
    {
        this.nombre=n;
        this.correo=c;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getCorreo()
    {
        return this.correo;
    }
}
