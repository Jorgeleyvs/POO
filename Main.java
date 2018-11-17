import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//Clase Principal.
public class Main{
	//Inicio del metodo principal.
	public static void main(String[] args) {
		//Declaracion, creacion e inicializacion.
		OrdenDeCompra oc = new OrdenDeCompra();
		FileWriter fw = null;
		//Es importante primero realizar oc.menu() debido a que el main se ejecuta en orden.
		oc.menu();
		String ticket = oc.imprimirOrden();
		//inicio de try y catch para atrapar los posibles errores de tipo IOException.
			try{
				fw = new FileWriter("ticket.txt",true);
				fw.write(ticket);
				fw.close();
			}catch(IOException ioe){
				System.out.println("No es posible esribir en un archivo");
			}
			//Impresión de la orden de compra en símbolo del sistema tras almacenarla.
			System.out.print(ticket);
	}
}
