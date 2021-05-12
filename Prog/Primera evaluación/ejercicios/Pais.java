package pq2;

public class Pais {
	private String nombre;
	private String capital;
	public long numHab;
	long superficie ;
	private String[] idiomas;
	public Pais() {
		this.nombre="españa";
		capital="madrid";//puedo poruqe no hay conflicto de nombres
		this.numHab=46000003;
		this.superficie=450000;
		this.idiomas=new String[4];
		this.idiomas[0]="castellano";
		this.idiomas[1]="catalan";
		this.idiomas[2]="euskera";
		this.idiomas[3]="gallego";
	}
public Pais(String nombre,String capital,long numHab,
		long superficie,String[] idiomas) {
		this.nombre=nombre;
		this.capital=capital;
		this.numHab=numHab;
		this.superficie=superficie;
		this.idiomas=idiomas;
	}
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public void setIdiomas(String[] idiomas ) {
	this.idiomas=idiomas;
}
public void setIdiomas(String idioma,int pos ) {
	if (this.idiomas.length>pos && pos>=0) {
		this.idiomas[pos]=idioma;
		System.out.println("cambiado");
	}else {
		System.out.println("no cambiado");
	}
	
}
public String getNombre() {
	return this.nombre;
}
public String getCapital() {
	return this.capital;
}
public long getNumHab() {
	return this.numHab;
}
public long getSuperficie() {
	return this.superficie;
}
public String informe() {
	String texto="";
	texto+="pais:"+this.nombre;
	texto+=" capital:"+this.capital;
	texto+=" habitantes:"+this.numHab;
	texto+=" superficie:"+this.superficie;
	texto+="idiomas cooficiales :\n";
	for (String d:this.idiomas) {
		texto+=d+"\t";
	}
	return texto;
}
}
