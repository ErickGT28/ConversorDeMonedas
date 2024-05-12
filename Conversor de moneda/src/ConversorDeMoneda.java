import java.util.Scanner;

public class ConversorDeMoneda {
    private String monedaBase;
    private String monedaObjetivo;
    private double cantidad;

    Scanner lectura = new Scanner(System.in);
    ConsultaMoneda conversion;

    /* Toma una instancia de ConsultaConversion como parámetro y la asigna a una variable de instancia llamada
    conversion. De esta manera, cada objeto de Calculos tiene acceso a una instancia de ConsultaConversion, lo
    que le permite realizar consultas de conversiones de moneda cuando sea necesario. */
    public ConversorDeMoneda(ConsultaMoneda conversion) {
        this.conversion = conversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void almacenarValores(String monedaBase, String monedaObjetivo){
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;

        System.out.println("Ingrese el valor que deseas convertir");

        this.cantidad = Double.parseDouble(lectura.nextLine());
    }

    public String obtenerMensajeRespuesta() {
        String mensaje = getMonedaBase().toUpperCase() + " " + getCantidad() + " equivale a: " + getMonedaObjetivo().toUpperCase() + " " + conversion.monedaApi(getMonedaBase(), getMonedaObjetivo(), getCantidad());
        System.out.println(mensaje);
        return mensaje;
    }
}
