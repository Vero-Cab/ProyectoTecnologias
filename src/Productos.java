
public class Productos {
	private String clave;
	private String clasificacion;
	private float precio;
	private int existencia;
	
	
	public Productos() {
	}


	public Productos(String clave, String clasificacion, float precio, int existencia) {
		this.clave = clave;
		this.clasificacion = clasificacion;
		this.precio = precio;
		this.existencia = existencia;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getClasificacion() {
		return clasificacion;
	}


	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public int getExistencia() {
		return existencia;
	}


	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}


	@Override
	public String toString() {
		return "Productos [clave=" + clave + ", clasificacion=" + clasificacion + ", precio=" + precio + ", existencia="
				+ existencia + "] \n ";
	}
	
	
	

}
