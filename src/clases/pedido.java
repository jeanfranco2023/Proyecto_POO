package clases;

public class pedido extends producto {

    int id_pedido;

    public pedido(int id_pedido, int id_producto, String nombre_producto, double precio, int unidades, String marca) {
        super(id_producto, nombre_producto, precio, unidades, marca);
        this.id_pedido = id_pedido;
    }


    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public void verificar_pedido() {
      
    }
}
