//Objeto que se extiende de Producto los atributos por herencia.
public class Socks extends Producto{

//Atributos con el metodo super() a traves del constructor con parametros de la clase.
	public Socks(String producto, String id, int price, String description, String colorCode, String quantityInStock){
		super(producto, id, price, description, colorCode, quantityInStock);
	}
}
