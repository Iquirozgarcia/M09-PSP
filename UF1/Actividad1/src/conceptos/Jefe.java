package conceptos;

public class Jefe extends Empleados{
    private int incentive;

    public Jefe(String name, Double salary, String section) {
        super(name, salary, section);
    }

    public void setIncentive(int incentive) {
        this.incentive = incentive;
    }

    public void estableixIncentiu (Integer incentive){
        this.incentive = incentive;
    }

    public void mostrarSalari (){
        System.out.println("El salario actual de " +
                getName() +
                " es de " +
                (getSalary() + incentive) + "€");

    }
}
