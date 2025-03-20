class Cajero {      //nueva clase enfocada al cobro
    static void realizarPago(Cliente cliente) {
        System.out.println("Procesando pago de " + cliente.getNombre() + " con la tarjeta " + cliente.getTarjetaCredito());
    }
}