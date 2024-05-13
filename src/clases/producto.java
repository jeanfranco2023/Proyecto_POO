package clases;

public class producto {

    int id_producto;
    String nombre_producto;
    double precio;
    int unidades;
    String marca;

    public producto(int id_producto, String nombre_producto, double precio, int unidades, String marca) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.unidades = unidades;
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
            case "Buzos":
                id_producto = 120058;
                break;
            case "Poleras":
                id_producto = 102038;
                break;
            case "Casacas":
                id_producto = 148770;
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
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
