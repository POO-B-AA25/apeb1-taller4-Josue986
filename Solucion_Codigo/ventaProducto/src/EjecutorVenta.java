public class EjecutorVenta {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 30.0, 10.0);
        Producto producto2 = new Producto("Pantalón", 50.0, 20.0);
        Producto producto3 = new Producto("Zapatos", 80.0, 0.0);

        producto1.mostrarDetalle();
        producto2.mostrarDetalle();
        producto3.mostrarDetalle();
    }
}