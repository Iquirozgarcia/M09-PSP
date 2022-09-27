import java.util.Scanner;
import java.util.regex.Pattern;

public class ObterDatos {
    //<editor-fold desc="Metodos + sus excepciones">
    static String obteName(String missatge) throws NomInvalidException {
        Scanner scan = new Scanner(System.in);
        System.out.print(missatge);
        String name = scan.nextLine();
        if (name.isBlank()) {
            throw new NomInvalidException("El nombre no puede estar vacio");
        }
        return name;
    }

    static CharSequence obteTelf(String missatge) throws NumTelfException {
        Scanner scan = new Scanner(System.in);
        System.out.print(missatge);
        CharSequence numTelf = scan.nextLine();
        if (!Pattern.matches("\\d{9}",numTelf)) {
            throw new NumTelfException("El número de telefono debe estar compuesto por UNICAMENTE 9 digitos númericos");
        }

        return numTelf;
    }

    static CharSequence obteMail(String missatge) throws MailException {
        Scanner scan = new Scanner(System.in);
        System.out.print(missatge);
        CharSequence email = scan.nextLine();
        if (!Pattern.matches("^[a-zA-Z\\d._%+-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,6}$", email )) {
            throw new MailException("Debe poner un correo electronico valido");
        }

        return email;
    }
    //</editor-fold>
}
