public class EmpleadoGestionEjecutor {
    public static void main(String[] args) {
     
        Empleado empleado1 = new Empleado("Carlos", 900.0, 30);
        Empleado empleado2 = new Empleado("Ana", 1100.0, 28);
        Empleado empleado3 = new Empleado("Luis", 800.0, 35);

        
        System.out.println("== Antes del aumento ==");
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();

        
        double promedio = (empleado1.salario + empleado2.salario + empleado3.salario) / 3;

        
        double porcentaje = 10.0;
        if (empleado1.salario < promedio) {
            empleado1.salario += empleado1.salario * (porcentaje / 100);
        }
        if (empleado2.salario < promedio) {
            empleado2.salario += empleado2.salario * (porcentaje / 100);
        }
        if (empleado3.salario < promedio) {
            empleado3.salario += empleado3.salario * (porcentaje / 100);
        }

        
        System.out.println("== Después del aumento ==");
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();
    }
}
