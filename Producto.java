//Clase de la cual se heredan datos o atributos para los objetos del código.
public class Producto{

  //Declaracion y creacion de variables privadas.
  private String producto = null;
  private String id = null;
  private int price;
  private String description = null;
  private String colorCode = null;
  private String quantityInStock = null;

//Metodo constructor con parametros.
  public Producto(String producto, String id, int price, String description, String colorCode, String quantityInStock){
    setProducto(producto);
    setId(id);
    setPrice(price);
    setDescription(description);
    setColorCode(colorCode);
    setQuantityInStock(quantityInStock);
  }
  //Metodo constructor sin parametros.
  public Producto(){

  }

//creacion de setters y getters
  public void setProducto(String producto){
    this.producto = producto;
  }
  public String getProducto(){
    return producto;
  }


  public void setId(String id){
      this.id = id;
  }
  public String getId(){
    return id;
  }


  public void setPrice(int price){
      this.price = price;
  }
  public int getPrice(){
    return price;
  }


  public void setDescription(String description){
      this.description = description;
  }
  public String getDescription(){
    return description;
  }


  public void setColorCode(String colorCode){
      this.colorCode = colorCode;
  }
  public String getColorCode(){
    return colorCode;
  }

  public void setQuantityInStock(String quantityInStock){
      this.quantityInStock = quantityInStock;
  }
  public String getQuantityInStock(){
    return quantityInStock;
  }

// Metodo capaz de sobreescribirse en fututras clases.
  public String displayInformation(){
    String str = "";
    str += "*****INFORMACION*****" +"\n\n";
    str += "Producto: " +producto +"\n";
    str += "Identificacion: " +id + "\n";
    str += "Precio: " +price + "\n";
    str += "Descripcion: " +description + "\n";
    str += "Codigo de color: " +colorCode + "\n";
    str += "Cantidad en almacen: " +quantityInStock + "\n";
    return str;
  }

}
