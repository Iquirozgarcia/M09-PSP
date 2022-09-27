import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            LeeryEscribir newDatos = new LeeryEscribir("dades.txt");
            String name = ObterDatos.obteName("Introduce tu nombre: ");
            CharSequence telf = ObterDatos.obteTelf("Introduce tu número de telefono: ");
            CharSequence mail = ObterDatos.obteMail("Introduce tu email: ");
            String dades = name + " " + telf + " " + mail;
            newDatos.escribir(dades);

        } catch (NomInvalidException e) {
            System.out.println(e.getMessage());
        } catch (NumTelfException e) {
            System.out.println(e.getMessage());
        } catch (MailException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}