/* TAREA DE SECCIÓN 8 ENCAPSULACIÓN 
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y teléfono, 
por último muéstralas por consola.
*/

public class Main {
    

    public static void main(String[] args) {

        Persona persona = new Persona();

        //Asignación de valores a las variables privadas por los métodos sets
        persona.setNombre("Luis Montiel");
        persona.setEdad(54);
        persona.setTelefono("+584246398596");

        //Obtención de valores de las variables privadas por los métodos gets
        System.out.println("El nombre de la persona es :");
        System.out.println(persona.getNombre());
        System.out.println("Su edad es :");
        System.out.println(persona.getEdad());
        System.out.println("Su número de teléfono es : ");
        System.out.println(persona.getTelefono());

    }
}
