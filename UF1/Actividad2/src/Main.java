import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String name = obteName("Introduce tu nombre: ");
            Integer telf = obteTelf("Introduce tu número de telefono: ");
        } catch (NomInvalidException e) {
            System.out.println(e.getMessage());
        } catch (NumTelfException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String obteName(String missatge) throws NomInvalidException {
        Scanner scan = new Scanner(System.in);
        System.out.print(missatge);
        String name = scan.nextLine();
        if (name.isBlank()) {
            throw new NomInvalidException("El nombre no puede estar vacio");
        }
        return name;
    }

    private static int obteTelf(String missatge) throws NumTelfException {
        Scanner scan = new Scanner(System.in);
        System.out.print(missatge);
        String numTelf = scan.nextLine();
        if (Integer.toString(numTelf).length() != 9) {
            throw new NumTelfException("El número de telefono debe estar compuesto por 9 digitos");
        }
        if (numTelf instanceof Integer) {
            throw new NumTelfException("El número de telefono debe estar compuesto por números");
        }
        return numTelf;
    }
}