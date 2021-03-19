package paqueteinmuebles;

import paqueteinmuebles.inmuebles;

public class terrenos extends inmuebles {
public terrenos(){
    super();
}




    public terrenos(String fechaadquisicion, int numerolote, String ultimodueno, String numeroregistro, double metroscuadrados, String ubicacion) {
        super(fechaadquisicion, numerolote, ultimodueno, numeroregistro);
        this.metroscuadrados = metroscuadrados;
        this.ubicacion = ubicacion;
    }

    public double getMetroscuadrados() {
        return metroscuadrados;
    }



    public void setMetroscuadrados(double metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }

    double metroscuadrados;

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    String ubicacion;

}
