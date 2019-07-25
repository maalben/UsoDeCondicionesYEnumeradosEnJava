package enumerados;

public enum Constantes {

    MENSAJE_CUADRO("Esto es un mensaje"),
    MENSAJE_TITULO("Esto es un título"),
    MENSAJE_DOLAR_ALTO("El dólar está muy caro"),
    MENSAJE_DOLAR_BAJO("El dólar está super barato"),
    MENSAJE_INGRESO_VALOR("Ingresa un valor");

    private String mensaje;

    Constantes(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
