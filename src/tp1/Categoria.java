package tp1;

public class Categoria {
	private int id;
	private String sexo;
	private int edadIni;
	private int edadFin;
	private int oro;
	private int plata;
	private int bronce;
	
	public Categoria(int id, String sexo, int edadIni, int edadFin) {
		this.id = id;
		this.sexo = sexo;
		this.edadIni = edadIni;
		this.edadFin = edadFin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getOro() {
		return oro;
	}
	public void setOro(int oro) {
		this.oro = oro;
	}
	public int getPlata() {
		return plata;
	}
	public void setPlata(int plata) {
		this.plata = plata;
	}
	public int getBronce() {
		return bronce;
	}
	public void setBronce(int bronce) {
		this.bronce = bronce;
	}
	@Override
	public String toString() {
		return id+" "+ oro +" "+ plata +" "+bronce;
	}
	public int getEdadIni() {
		return edadIni;
	}
	public void setEdadIni(int edadIni) {
		this.edadIni = edadIni;
	}
	public int getEdadFin() {
		return edadFin;
	}
	public void setEdadFin(int edadFin) {
		this.edadFin = edadFin;
	}
	
		

}
