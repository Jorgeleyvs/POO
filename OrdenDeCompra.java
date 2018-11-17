//Importacion de Scanner para ingreso de datos.
import java.util.Scanner;

//Clase que se encarga de realizar
public class OrdenDeCompra{

		//Declaracion, creacion e inicializacion del objeto Scanner.
		Scanner sc = new Scanner(System.in);

		//Declaracion de variables.
		int total = 0;
		int var = 0;
		int opcion[] = new int[4];
		int articulo[] = new int[4];

		int cant1 =0;
		int cant2 =0;
		int cant3 =0;
		int cant4 =0;

		//Declaracion, creacion e inicializacion de objetos.
		Hat hat = new Hat("Sombrero","75002",30,"Big hat","R=Red, B=Blue, G=Green","562");

		Socks socks = new Socks("Calcetines","75103",100,"Calcetines Grandes","R=Red, B=Blue, G=Green","100");

		Pants pants = new Pants("Pantalones","75205",104,"Ch,M,G","M=Male, F=Female","Pantalones Medianos","R=Red, B=Blue, G=Green","100");

		Shirt shirt = new Shirt("Playera","75307",106,"Playera Mediana","R=Red, B=Blue, G=Green", "100");

		Cliente cl = new Cliente("Jorge","Casas Villa Nueva","8115824244","jorge@gmail.com");

		//Metodo encargado de mostrar los articulos que hay en almacen para elegir.
		public void menu(){
		System.out.print("Orden de productos");
		System.out.print(hat.displayInformation() +socks.displayInformation() +pants.displayInformation() +shirt.displayInformation());


		for(int i = 0;i < articulo.length;i++){
				System.out.println("\n\n*****Elija el tipo de Articulo que desee comprar*****");
				System.out.println("1: Sombrero | 2: Calcetines | 3: Pantalones | 4: Playera\n");
				System.out.print("Ingrese un numero: ");
				opcion[i] = sc.nextInt();
				switch(opcion[i]){
					case 1:
					articulo[i] = hat.getPrice();
						break;
					case 2:
					articulo[i] = socks.getPrice();
						break;
					case 3:
					articulo[i] = pants.getPrice();
						break;
					case 4:
			 		articulo[i] = shirt.getPrice();
						break;
				}
			}
		}

			//Metodo encargado de mostrar los resultados de la compra tras haber leído los datos y almacenarlos en una variable concatenada.
			public String imprimirOrden(){
				String cadena;
				cadena = "\n\n____________________________________________________________\n";
				cadena += cl.displayInformation();
				cadena += "\n____________________________________________________________\n";
				cadena += "ARTICULO\t\tCANTIDAD\t\tPRECIO\n";
				for(int contador = 0;contador < 4;contador++){

					switch (opcion[contador]) {
						case 1:
						cant1 += 1;
						break;
						case 2:
						cant2 += 1;
						break;
						case 3:
						cant3 += 1;
						break;
						case 4:
						cant4 += 1;
						break;

					}
				}

				if(cant1 != 0){
					cadena +="sombrero\t\t"+ cant1+"\t\t\t"+hat.getPrice()+"\n";
				}
				if(cant2 != 0){
					cadena += "Calcetines\t\t" + cant2+"\t\t\t"+socks.getPrice()+"\n";
				}
				if(cant3 != 0){
					cadena += "pantalones\t\t"+ cant3+"\t\t\t"+pants.getPrice()+"\n";
				}
				if(cant4 != 0){
					cadena += "playeras\t\t" + cant4+"\t\t\t"+shirt.getPrice()+"\n";
				}

				for (int contador = 0; contador < articulo.length; contador++){
					total += articulo[contador];
				}

				cadena += "____________________________________________________________\n";
				cadena += "TOTAL_____________________________________________$" +total+"______\n";
				cadena += "____________________________________________________________\n";
				return cadena;
			}


		}
