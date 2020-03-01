package tp1;

public class Corredor {
	
	private int id;
	private String sexo;
	private int edad;
	private int categoria;
	
	public Corredor(int id,int edad,String sexo) {
		this.id=id;
		this.sexo=sexo;
		this.edad=edad;
				
	}

	public String getSexo() {
		return sexo;
	}

	public int getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "Corredor [id=" + id + ", sexo=" + sexo + ", edad=" + edad + ", categoria=" + categoria + "]";
	}

	public int getEdad() {
		return edad;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

}
