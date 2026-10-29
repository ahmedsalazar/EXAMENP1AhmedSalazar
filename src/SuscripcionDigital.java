public class SuscripcionDigital {
    private int identificador;
    private String cliente;
    private int mesesDisponibles;
    private static int contadorSuscripciones = 0;

    public SuscripcionDigital(int identificador, String cliente) {
        if (identificador <=0);{
        throw new IllegalArgumentException("El identificador debe ser positivo");
    }
    if (cliente == null || cliente.trim().isEmpty()){
        throw new IllegalArgumentException("El cliente no puede ser nulo, vacio, ni contener espacios");
    this.identificador = identificador;
    this.cliente= cliente;
    this.mesesDisponibles = 0;

    contadorSuscripciones++;

    }
    public int getIdentificador(){
        return identificador;
    }
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente){

        }
    }
