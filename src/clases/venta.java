package clases;

public class venta {

    int unidades;
    String producto;
    String marca;

    public venta(int unidades, String producto, String marca) {
        this.unidades = unidades;
        this.producto = producto;
        this.marca = marca;
    }

    

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double precio() {
        double precio = 0;
        switch (getProducto()) {
            case "Polos":
                precio = 60.9;
                break;
            case "Pantalones":
                precio = 160.9;
                break;
            case "Casacas":
                precio = 98.9;
                break;
            case "Poleras":
                precio = 95.9;
                break;
            case "Buzos":
                precio = 87.9;
        }
        return precio;
    }

    public double subtotal() {
        return (unidades*precio());
    }

}
