class Cliente {
    private String nombre;   //Antes era public
    private String tarjetaCredito;   //Antes era public

    public Cliente(String nombre, String tarjetaCredito) {
        this.nombre = nombre;
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getNombre() {     //funcion nueva
        return nombre;
    }

    public String getTarjetaCredito() {     //funcion nueva
        return tarjetaCredito;
    }
}