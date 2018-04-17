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
        int numcel=0;

        for(int x=0;x<celulares.size();x++) {
            if  (celulares.get(x).getMarca()==1 && celulares.get(x).getColor()==1 ){
                numcel++;
            }
        }
        return  numcel;
    }

    public static double PromedioNokia(){
        int numcel=0;
        Double precios=0.00;
        Double promedio=0.00;

        for(int x=0;x<celulares.size();x++) {
            if  (celulares.get(x).getMarca()==4){
                numcel++;
                precios = precios + celulares.get(x).getPrecio();
            }
        }

        if (numcel  > 0 ){
            promedio = precios / numcel;
        }
        return  promedio;
    }


}