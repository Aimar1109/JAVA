package reto11;

public class Producto {
    private int id;
    private String nombre;
    private int cantidad_vendida;
    private Double precio;

    public Producto() {

    }
    public Producto(int id,String nombre, int cantidad_vendida, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad_vendida = cantidad_vendida;
        this.precio = precio;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getCantidad(){
        return this.cantidad_vendida;
    }
    public void setCantidad(int cantidad){
        this.cantidad_vendida = cantidad;
    }
    public Double getPrecio(){
        return this.precio;
    }
    public void setPrecio(Double precio){
        this.precio = precio;
    }
    public String getFraseTodo() {
        return this.id + ", " + this.nombre + ", " + this.cantidad_vendida + ", " + this.precio;
    }
    public Double getVenta() {
        return this.precio * this.cantidad_vendida;
    }
}
