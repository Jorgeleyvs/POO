
class Pants extends Producto{
	private String size;
	private String gender;

//Atributos con el metodo super() a traves del constructor con parametros de la clase con nuevos atributos unicos de esta clase que no son heredados.
	public Pants(String producto, String id, int price, String size, String gender, String description, String colorCode, String quantityInStock){
		super(producto, id ,price, description, colorCode, quantityInStock);
		this.size=size;
		this.gender=gender;


	}
//Setters y getters para los nuevos atributos.
	public void setSize(String size){
		this.size=size;
	}

	public String getSize(){
		return size;
	}

	public void setGender(String gender){
		this.gender=gender;
	}

	public String getGender(){
		return gender;
	}

//metodo que retorna una variable de tipo String con todos los datos leídos.
	public String displayInformation(){
		String str = "";
		str += "*****INFORMACION*****" +"\n\n";
		str += "Producto: " +super.getProducto() +"\n";
		str += "Identificacion: " +super.getId() + "\n";
		str += "Precio: " +super.getPrice() + "\n";
		str += "Tamaño: " +size +"\n";
		str += "Genero: " +gender +"\n";
		str += "Descripcion: " +super.getDescription() + "\n";
		str += "Codigo de Color: " +super.getColorCode() + "\n";
		str += "Cantidad en almacen: " +super.getQuantityInStock() + "\n";

		return str;
	}




}
