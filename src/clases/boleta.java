package clases;

public class boleta extends venta {

    int ruc;

    public boleta(int ruc, int id_venta, int id_producto, String nombre_producto, double precio, int cantidad, String marca) {
        super(id_venta, id_producto, nombre_producto, precio, cantidad, marca);
        this.ruc = ruc;
    }

    public int getRuc() {
        long ruc1;
        ruc1 = 1073626525;
        return (int) ruc1;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public double calcular() {
        double x;
        x = getUnidades() *getPrecio() ;
        return x;
    }

    public double IGV() {
        return calcular() * 0.18;
    }

    public double montofinal() {
        return calcular() + IGV();
    }

    public void generar_factura() {
        String cadena="";
        
    }

}
