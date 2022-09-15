package clases;

public class Cliente {

    private String nombre;
    private String cedula;
    private String medioDePago;
    private int saldoDisponible;

    public Cliente() {
    }

    public Cliente(String nombre, String cedula, String medioDePago, int saldoDisponible) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.medioDePago = medioDePago;
        this.saldoDisponible = saldoDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }



}
