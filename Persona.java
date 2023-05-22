/* TAREA DE SECCIÓN 8 ENCAPSULACIÓN
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
*/

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    //Métodos sets
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public void setEdad(int edad){
        this.edad= edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    //Métodos gets
    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getTelefono(){
        return this.telefono;
    }
}