package com.tmarriaga.tallercel;

import java.util.ArrayList;

/**
 * Created by Android on 16/04/2018.
 */

public class datos {

    private static ArrayList<celular> celulares  = new ArrayList();

    public static void guardar(celular cel){
        celulares.add(cel);
    }

    public static ArrayList<celular> obtener(){
        return celulares;
    }


    public static int NumApple(){
        
    }


}