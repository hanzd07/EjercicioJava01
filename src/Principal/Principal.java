package Principal;

import ClasesFiguras.*;

public class Principal {

	public static void main(String[] args) {

		SuperHeroe sup1 = new SuperHeroe("Spiderman");
		
		sup1.setNombre("Hombre Araña");
		sup1.setDescripcion("Puede aferrarse a la mayoría de las superficies, fuerza sobrehumana.");
		
		System.out.println(sup1.getNombre());
		System.out.println(sup1.getDescripcion());
		System.out.println(sup1.toString());
		
		SuperHeroe sup2 = new SuperHeroe("Batman");
		sup2.setDescripcion("Batman no tiene superpoderes, a diferencia de otros superhéroes. "
				+ "Su fuerza radica en su intelecto, su conocimiento de las artes marciales, su destreza física, "
				+ "habilidades de detective, y una serie de gadgets, vehículos y trajes tecnológicamente avanzados.");
		sup2.setCapa(true);
		
		System.out.println(sup2.toString());
		
		Dimension dimPeq = new Dimension(); // alto = 0, ancho = 0, prof = 0
		Dimension dimGra = new Dimension(70,20,20);
		
		dimPeq.setAlto(20);
		dimPeq.setAncho(5);
		dimPeq.setProfundidad(6);
		//Ahora dimPeq es: alto = 20, ancho = 5, prof = 6
		
		System.out.println(dimPeq);
		System.out.println(dimGra);
		System.out.println("volumen de la dimension pequeña: " + dimPeq.getVolumen());
		
		Figura figSpi = new Figura("spid-01", 30, sup1, dimPeq);
		
		System.out.println(figSpi.toString());
		figSpi.subirPrecio(10);
		System.out.println(figSpi.toString());
		
		Coleccion col = new Coleccion("Super");
		
		col.añadirfigura(figSpi);
		
		Figura figBat = new Figura("bat-02", 50,sup2,dimPeq);
		col.añadirfigura(figBat);
		
		
		SuperHeroe sup3 = new SuperHeroe("Ironman");
		sup3.setDescripcion("SuperHéroe con traje blindado");
		Figura figIron = new Figura("iron-03",20,sup3,new Dimension(6,3,4));
		col.añadirfigura(figIron);
		
		System.out.println(col);
		
		System.out.println(col.conCapa());
		
		Figura fMasValiosa = col.masValiosa();
		System.out.println("Figura de mas valor: "+fMasValiosa);
		
		System.out.println("Valor de la coleccion: "+col.getvalorColeccion());
		
		System.out.println("Volumen de la coleccion: "+col.getVolumenColeccion());
	}

}
