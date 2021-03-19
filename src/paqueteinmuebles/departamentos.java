package paqueteinmuebles;

public class departamentos extends inmuebles {
    public departamentos(){
        super();
    }



    public departamentos(String fechaadquisicion, int numerolote, String ultimodueno, String numeroregistro, int numerohabitaciones, int numerobanos, String amenidades) {
        super(fechaadquisicion, numerolote, ultimodueno, numeroregistro);
        this.numerohabitaciones = numerohabitaciones;
        this.numerobanos = numerobanos;
        this.amenidades = amenidades;
    }

    public int getNumerohabitaciones() {
        return numerohabitaciones;
    }

    public void setNumerohabitaciones(int numerohabitaciones) {
        this.numerohabitaciones = numerohabitaciones;
    }




    int numerohabitaciones;

    public int getNumerobanos() {
        return numerobanos;
    }

    public void setNumerobanos(int numerobanos) {
        this.numerobanos = numerobanos;
    }

    int numerobanos;

    public String getAmenidades() {
        return amenidades;
    }

    public void setAmenidades(String amenidades) {
        this.amenidades = amenidades;
    }

    String amenidades;
}
