package clases;

public class venta extends producto {

    int id_venta;

    public venta(int id_venta, int id_producto, String nombre_producto, double precio, int cantidad, String marca) {
        super(id_producto, nombre_producto, precio, cantidad, marca);
        this.id_venta = id_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    public void reporte_venta(){
        String cadena="";
        
    }
}
