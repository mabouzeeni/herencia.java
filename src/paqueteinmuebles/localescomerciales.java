package paqueteinmuebles;

import paqueteinmuebles.inmuebles;

public class localescomerciales extends inmuebles {
   public localescomerciales(){
       super();
   }




    public localescomerciales(String fechaadquisicion, int numerolote, String ultimodueno, String numeroregistro, String fechaconstruccion, String fechaadquisicion1) {
        super(fechaadquisicion, numerolote, ultimodueno, numeroregistro);
        this.fechaconstruccion = fechaconstruccion;
        this.fechaadquisicion = fechaadquisicion1;
    }

    public String getFechaconstruccion() {
        return fechaconstruccion;
    }


    public void setFechaconstruccion(String fechaconstruccion) {
        this.fechaconstruccion = fechaconstruccion;
    }

    String fechaconstruccion;




    String fechaadquisicion;
}
