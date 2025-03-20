class Hotel {
    public void hacerReserva(Cliente cliente, Cajero cajero) {
        Cajero.realizarPago(cliente);       //acoplamiento con funcion de nueva clase
        System.out.println("Reserva realizada con exito ");
    }
}