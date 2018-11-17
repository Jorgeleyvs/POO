public class Cliente {

//Metodo constructor sin parametros.
    public Cliente() {

    }
//Metodo constructor con parametros.
    public Cliente(String nombre, String direccion, String numero, String correo) {
        setNombre(nombre);
        setDireccion(direccion);
        setNumero(numero);
        setCorreo(correo);
    }

//Declaracion de variables privadas
    private String nombre;
    private String direccion;
    private String numero;
    private String correo;

//Encapsulamiento con setters y getters.
    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        if (direccion.length() > 0) {
            this.direccion = direccion;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNumero(String numero) {
        if (numero.length() > 0) {
            this.numero = numero;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setCorreo(String correo) {
        if (correo.length() > 0) {
            this.correo = correo;
        }
    }

    public String getCorreo() {
        return correo;
    }

//metodo que retorna una variable de tipo String con todos los datos leídos.
    public String displayInformation() {
        String str = null;
        str = "Nombre: "+ nombre + "\n";
        str += "Direccion: "+ direccion + "\n";
        str += "Numero: "+ numero + "\n";
        str += "Correo: "+ correo + "\n";
        return str;
    }
}
