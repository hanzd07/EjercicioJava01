package ClasesFiguras;

import java.util.ArrayList;

public class Coleccion {
	private String nombreColeccion;
	private ArrayList<Figura> listaFiguras;
	
	
	public Coleccion(String nombreColeccion) {
		super();
		this.nombreColeccion = nombreColeccion;
		listaFiguras = new ArrayList<>();
	}


	public String getNombreColeccion() {
		return nombreColeccion;
	}


	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}
	
	public void añadirfigura(Figura fig) {
		listaFiguras.add(fig);
	}
	
	public void subirPrecio(double cantidad, String id) {
		for(Figura f:listaFiguras) {
			if(f.getCodigo().equals(id)) {
				f.subirPrecio(cantidad);
			}	
		}
	}


	@Override
	public String toString() {
		String cadena = "Coleccion " +nombreColeccion+"\n---------\n";
		
		for(Figura f:listaFiguras) {
			cadena += f+"\n";
		}
	
		return cadena;
		
	}
	
	public String conCapa() {
		String cadena = "Figuras de superhéroes con capa\n------------\n";
		for(Figura f:listaFiguras) {
			if(f.getSuperHeroe().isCapa()) {
				cadena += f+"\n";
			}
		}
		
		return cadena;
		
	}
	
	public Figura masValiosa() {
		double precioMayor = 0.0;
		Figura fMayor = null;
		
		for(Figura f:listaFiguras) {
			if(f.getPrecio()>precioMayor) {
				precioMayor = f.getPrecio();
				fMayor = f;
				
			}
			
		}
	
		return fMayor;
	
	}
	
	public double getvalorColeccion() {
		double valor = 0;
		for(Figura f:listaFiguras) {
			valor += f.getPrecio();
		}
		return valor;
	}
	
	public double getVolumenColeccion() {
		double vol = 0;
		for(Figura f:listaFiguras) {
			vol += f.getDimensiones().getVolumen();
		}
		return vol+200;
	}
}
