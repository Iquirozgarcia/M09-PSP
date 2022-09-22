package conceptos;

public class Empleados {
    //<editor-fold desc="Caracteristicas">
    private String name;
    private Double salary;
    private String section;
    //</editor-fold>

    //<editor-fold desc="Getters & Setters">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    //</editor-fold>

    public Empleados(String name, Double salary) {
        this.name = name;
        this.salary = salary;
        section = "Administation";
    }

    public Empleados(String name, Double salary, String section) {
        this.name = name;
        this.salary = salary;
        this.section = section;
    }

    public Empleados() {
        this.name = getName();
        this.salary = getSalary();
        this.section = getSection();
    }

    public void pujarSou (Double percentatge){

        double newSalary;
        newSalary = getSalary() + (getSalary()/100);
        setSalary(newSalary);

    }

    public void mostrarSalari (){
        System.out.println("El salario actual de " +
                getName() +
                " es de " +
                getSalary() + "€");

    }


}
