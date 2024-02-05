package ClasesFiguras;

public class Figura {
	private String codigo;
	private double precio;
	private SuperHeroe superHeroe;
	private Dimension dimensiones;
	
	public Figura(String codigo, double precio, SuperHeroe superHeroe, Dimension dimensiones) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.superHeroe = superHeroe;
		this.dimensiones = dimensiones;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public SuperHeroe getSuperHeroe() {
		return superHeroe;
	}

	public void setSuperHeroe(SuperHeroe superHeroe) {
		this.superHeroe = superHeroe;
	}

	public Dimension getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(Dimension dimensiones) {
		this.dimensiones = dimensiones;
	}

	@Override
	public String toString() {
		return "Figura:\n" + "codigo=" + codigo + ", precio=" + precio + "\n" + superHeroe + "\n"
				+ dimensiones;
	}

	public void subirPrecio(double cantidad) {
		precio += cantidad;
	}

}
