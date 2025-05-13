public class Producto {
    public String nombre;
    public double precio;
    public double descuento; // En porcentaje (ej: 10.0 para 10%)

    public Producto(String nombre, double precio, double descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public double calcularPrecioFinal() {
        return precio - (precio * descuento / 100);
    }

    public void mostrarDetalle() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Precio final: $" + calcularPrecioFinal());
        System.out.println("-------------------------");
    }
}
