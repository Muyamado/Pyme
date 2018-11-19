package instrumentos;

import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		double tamano;
		int precio,inst,tambores,platillos;
		String marca;
		
		Flauta flauta = new Flauta(1,"Gibson",1,"no disponible","no disponible","directa", 2);
		System.out.println("El precio de la flauta es: "+flauta.getPrecio());
		System.out.print("Estos son los detalles de la flauta: ");
		System.out.println(flauta.getMarca()+" "+flauta.getTipoEmbocadura());
		
		Scanner inputInt = new Scanner(System.in);
		Scanner inputSt = new Scanner(System.in);
			System.out.println("que tipo de bateria desea:");
			precio = inputInt.nextInt();
			marca = inputSt.nextLine();
			inst = inputInt.nextInt();
			tambores = inputInt.nextInt();
			platillos = inputInt.nextInt();
			tamano = inputInt.nextDouble();
		
		System.out.println("Estos son los datos de la bateria que compro: ");
		Bateria bateria = new Bateria(precio,marca,inst,tambores,platillos,tamano);
		System.out.println(bateria.getPrecio()+" "+marca+" "+inst+" "+tambores+" "+platillos+" "+tamano);
	}

}
