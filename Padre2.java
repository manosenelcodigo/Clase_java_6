
package com.manosenelcodigo.paquete1;

import com.manosenelcodigo.interfaces.Interface1;

public class Padre2 implements Interface1{

    @Override
    public String getDato() {
         return "0";
    }

    @Override
    public int getEntero() {
         return 0;
    }

    @Override
    public void ejecutar() {
         
    }
    @Override
    public String getAlgo()
    {
        return "loquesea";
    }
    @Override
    public void loquesea()
    {
    
    }
    public static void main(String[] args) {
        Padre2 p=new Padre2();
        System.out.println(p.getDato());
    }
    
}
