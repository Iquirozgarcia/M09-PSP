package conceptos;

public class Us_Empleat {
    public static void main(String[] args) {
        Empleados empleado1 = new Empleados("Lluis", 20000.00);
        Empleados empleado2 = new Empleados("Anna", 25000.00);
        Empleados empleado3 = new Empleados("Marta", 25000.00);

        System.out.println("El salario actual de " +
                empleado2.getName() +
                " es de " +
                empleado2.getSalary() + "€" +
                " en la sección de " + empleado2.getSection()
        );
        empleado2.pujarSou(10.00);
        System.out.println("El nuevo salario de " +
                empleado2.getName() +
                " es de " +
                empleado2.getSalary() + "€" +
                " en la sección de " + empleado2.getSection()
        );
    }

}
