package clases;

public class producto {

    int id_producto;
    String nombre_producto;
    double precio;
    int cantidad;
    String marca;

    public producto(int id_producto, String nombre_producto, double precio, int cantidad, String marca) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    public int getId_producto() {
        switch (getNombre_producto()) {
            case "Pantalon":
                id_producto = 189756;
                break;
            case "Polos":
                id_producto = 164587;
                break;
            case "Camisas":
                id_producto = 156423;
            case "Buzos":
                id_producto = 120058;
                break;
            case "Poleras":
                id_producto = 102038;
                break;
            case "Casacas":
                id_producto = 148770;
                break;
            case "Chompas":
                id_producto = 112230;
        }
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio() {
         switch (getNombre_producto()) {
            case "Pantalon":
                precio = 98;
                break;
            case "Polos":
                precio = 45;
                break;
            case "Camisas":
                precio = 60;
                break;
            case "Buzos":
                precio = 54;
                break;
            case "Poleras":
                precio = 78;
                break;
            case "Casacas":
                precio = 65;
                break;
            case "Chompas":
                precio = 57;

        }
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        switch (getNombre_producto()) {
            case "Pantalon":
                marca = "Tommy";
                break;
            case "Polos":
                marca = ("Calvin Klein");
                break;
            case "Buzos":
                marca = ("Tommy");
                break;
            case "Poleras":
                marca = ("Calvin Klein");
                break;
            case "Casacas":
                marca = ("Calvin Klein");
                break;
        }
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
