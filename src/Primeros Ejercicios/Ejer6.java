import java.util.LinkedList;

public class Ejer6 {
    public static void main (String[] args){
        LinkedList<String> colaClientes = new LinkedList<>();
        colaClientes.add("Misael");
        colaClientes.add("Isabel");
        colaClientes.add("Carlos");
        colaClientes.add("Valeria");
        colaClientes.add("Ana");

        System.out.println("Cola inicial: " + colaClientes);
        
        while (!colaClientes.isEmpty()){
            System.out.println("Atendiendo a : " + colaClientes.getFirst());
            colaClientes.removeFirst();
            System.out.println("Cola actualizada: " + colaClientes);
        }
    }
}
