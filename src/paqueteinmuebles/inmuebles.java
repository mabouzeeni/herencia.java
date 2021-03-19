package paqueteinmuebles;

public class inmuebles {

    protected String fechaadquisicion;
    protected int numerolote;
    protected String ultimodueno;
    protected String numeroregistro;

    public inmuebles(){}
    public String getFechaadquisicion() {
        return fechaadquisicion;
    }

    public inmuebles(String fechaadquisicion, int numerolote, String ultimodueno, String numeroregistro) {
        this.fechaadquisicion = fechaadquisicion;
        this.numerolote = numerolote;
        this.ultimodueno = ultimodueno;
        this.numeroregistro = numeroregistro;
    }

    public void setFechaadquisicion(String fechaadquisicion) {
        this.fechaadquisicion = fechaadquisicion;
    }


    public int getNumerolote() {
        return numerolote;
    }

    public void setNumerolote(int numerolote) {
        this.numerolote = numerolote;
    }


    public String getUltimodueno() {
        return ultimodueno;
    }

    public void setUltimodueno(String ultimodueno) {
        this.ultimodueno = ultimodueno;
    }


    public String getNumeroregistro() {
        return numeroregistro;
    }

    public void setNumeroregistro(String numeroregistro) {
        this.numeroregistro = numeroregistro;
    }

}

