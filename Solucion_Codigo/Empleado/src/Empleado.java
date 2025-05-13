public class Empleado {
   public String nombre;
    public double salario;
    public int edad;

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Edad: " + edad + " años");
        System.out.println("-------------------------");
    }    
}
