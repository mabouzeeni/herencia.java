package com.company;
import paqueteinmuebles.inmuebles;
import paqueteinmuebles.departamentos;
import paqueteinmuebles.localescomerciales;
import paqueteinmuebles.terrenos;
import java.util.ArrayList;
public class Main {
    public static ArrayList<inmuebles> inmuebles= new ArrayList<inmuebles>();
    public static void main(String[] args) {
localescomerciales local = new localescomerciales("fecha adquisicion 10-nov-2002", 1,"ultimo dueno joaquin perez", "numero registro 1223223", "fecha construccion 30-sep-1989","" );
localescomerciales local2 = new localescomerciales("fehca adquisicion 23-jul-1989",2,"ultimo dueno marco alonso","numero registro 4488484","fecha construccion 1965","1966");


inmuebles.add(local);
inmuebles.add(local2);
System.out.println(inmuebles);
for(inmuebles locales: inmuebles){
    System.out.println(locales.getFechaadquisicion()+" "+locales.getNumerolote()+""+locales.getUltimodueno()+""+locales.getNumeroregistro()+"");
}
        departamentos apt1 = new departamentos("fecha adquisicion 23-ene-2006", 4, "ultimo dueno jackob martin", "numero registro 232343", 12, 24, "amenidades piscina zona bbq sauna seguridad 24 horas");
        departamentos apt2 = new departamentos("fecha adquisicion 15-sep-1965", 6, "ultimo dueno sergio ramos","numero registro 23232112",34, 68,"piscina bbq jazuzzi");
        departamentos apt3 = new departamentos("fecha adquisicion 13-nov-2010", 8, "ultimo dueno florentino peres","numero registro 25452",56, 140,"piscina bbq jazuzzi sauna 4 elevadores");
inmuebles.add(apt1);
inmuebles.add(apt2);
inmuebles.add(apt3);
System.out.println(inmuebles);
for(inmuebles departamentos: inmuebles){
    System.out.println(departamentos.getFechaadquisicion()+""+departamentos.getNumerolote()+""+departamentos.getUltimodueno()+""+departamentos.getNumeroregistro()+"");
}
terrenos tierra1 = new terrenos("fecha adquisicion 23-abril-1967", 9, "ultimo dueno carlos alzamora", "numero registro 334343", 336, "ubicacion bethania");
        terrenos tierra2 = new terrenos("fecha adquisicion 23-junio-1956", 7, "ultimo dueno jose sandoval", "numero registro 8787", 990, "ubicacion punta pacifica");
        terrenos tierra3 = new terrenos("fecha adquisicion 13-abril-2007", 8, "ultimo dueno carlos perez", "numero registro 335465", 566, "ubicacion chanis");
        terrenos tierra4 = new terrenos("fecha adquisicion 14-mar-1999", 6, "ultimo dueno michael perez", "numero registro 989875", 167, "ubicacion cangrejo");
        terrenos tierra5 = new terrenos("fecha adquisicion 28-dic-1978", 3, "ultimo dueno luis rodriguez", "numero registro 656172", 789, "ubicacion boquete");
        inmuebles.add(tierra1);
        inmuebles.add(tierra2);
        inmuebles.add(tierra3);
        inmuebles.add(tierra4);
        inmuebles.add(tierra5);
        System.out.println(inmuebles);
        for(inmuebles terrenos: inmuebles){
            System.out.println(terrenos.getFechaadquisicion()+""+terrenos.getNumerolote()+""+terrenos.getUltimodueno()+""+terrenos.getNumeroregistro()+"");
        }

}
    }

