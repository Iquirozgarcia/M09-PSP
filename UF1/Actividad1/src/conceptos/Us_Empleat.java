package conceptos;

public class Us_Empleat {
    public static void main(String[] args) {
        // Creamos los 3 empelados
        //<editor-fold desc="Empleados">
        Empleados empleado1 = new Empleados("Lluis", 20000.00);
        Empleados empleado2 = new Empleados("Anna", 25000.00);
        Empleados empleado3 = new Empleados("Marta", 25000.00);
        //</editor-fold>

        // Imprimimos los datos del empleado 2 + una subida del salario del 10%
        //<editor-fold desc="Empleado 2">
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
        //</editor-fold>

        //Creamos los arrays y agregamos los empleados + un bucle con la subida de salario de todos.
        //<editor-fold desc="Arrays y bucle 1">
        Empleados arrayObjetos [] =new Empleados[3];
        arrayObjetos[0]= empleado1;
        arrayObjetos[1]= empleado2;
        arrayObjetos[2]= empleado3;

        for (int i = 0; i< arrayObjetos.length;i++){
            arrayObjetos[i].pujarSou(5.00);
            System.out.println("El nou salari de " + arrayObjetos[i].getName() + " es de " + arrayObjetos[i].getSalary() + "€");
        }
        //</editor-fold>

        //Uso del nuevo Objeto jefe y su metodo de mostrarSalario
        //<editor-fold desc="Jefe">
        Jefe jefe1 = new Jefe("Jorge", 25000.00, "Informatica");
        jefe1.setIncentive(1000);
        jefe1.mostrarSalari();
        //</editor-fold>

        Empleados misEmpleados  []  = new Empleados[4];
        misEmpleados[0] = empleado1;
        misEmpleados[1] = empleado2;
        misEmpleados[2] = empleado3;
        misEmpleados[3] = jefe1;

        System.out.println(misEmpleados[3].getName());

        for (int i = 0; i< misEmpleados.length;i++) {
            System.out.println(misEmpleados[i].getClass() + " El salario actual de " +
                    misEmpleados[i].getName() +
                    " es de " +
                    empleado2.getSalary() + "€" +
                    " en la sección de " + misEmpleados[i].getSection()
            );
        }













    }

}
