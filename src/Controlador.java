import java.util.*;

public class Controlador {

    Scanner scan = new Scanner(System.in);

    String eleccion;

    String datos = "";

    Integer num;

    String[] array;

    StackHandmade<Integer> stack = new StackHandmade<Integer>();

    public void principal() {
        System.out.println("Escribir la cadena de caracteres que quiere tener: ");
        eleccion = scan.next();
        eleccion = eleccion.toLowerCase();
        array = eleccion.split("");
        stack.push(0);
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals("a")) {
                    stack.push(1);
                }
                if (array[i].equals("b")) {
                        stack.pull();
                }
            }
        if (stack.peek() == 0) {
            System.out.println("Cadena aceptada");
            System.out.println("Elementos del stack restantes: " + stack.peek());
        }
        if (stack.peek() == 1) {
            System.out.println("Cadena invalida");
        }
        }catch(Exception e){
        System.out.println("Cadena invalida");
    }}}

