package ejerciciosDesarrolloClase;


public class Empleado 
{
	private String DNI;
	private String nombre;
	private String fechaAlta;
	private int codigoEmpleado;


	public Empleado()
	{
		
	}
	public Empleado (String DNI, String nombre, String fecha, int codigoEmpleado)
	{
		this.DNI = DNI;
		this.nombre = nombre;
		this.fechaAlta = fecha;
		this.codigoEmpleado = codigoEmpleado;
	}
	public String	toString()
	{
		String aux;
		aux = ("DNI: "+this.DNI+" Nombre: "+this.nombre+" Fecha Alta: "
						+this.fechaAlta+ " Tipo Empleado:"+getTipoEmpleado()+" Código empleado: "+this.codigoEmpleado);
		return aux;
	}
	public boolean	equals(Empleado e) 
	{
		return this.DNI == e.getDNI();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public void setCodigoEmpleado(String tipoEmpleado) 
	{
		
		if (tipoEmpleado.toLowerCase().contains("analista"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("programador") ? 1299 : 1255;
		}else if (tipoEmpleado.toLowerCase().contains("programador"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("senior") ? 1555 : 1599;
		}else if (tipoEmpleado.toLowerCase().contains("administrador"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("senior") ? 1955 : 1999;
		}
		
	};
	public String getTipoEmpleado()
	{
		String aux  = "";
		switch (this.codigoEmpleado)
		{
			case 1255:
				aux = "ANALISTA";
			break;
			case 1299:
				aux = "ANALISTA-PROGRAMADOR";
			break;
			case 1555:
				aux = "PROGRAMADOR SENIOR";
			break;
			case 1599:
				aux = "PROGRAMADOR JUNIOR";
			break;
			case 1955:
				aux = "ADMINITRADOR JUNIOR";
			break;
			case 1999:
				aux = "ADMINITRADOR JUNIOR";
			break;
		}
		return aux;
	}
	public int getCodigoEmpleado() 
	{
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(int codigooEmpleado) {
		this.codigoEmpleado = codigooEmpleado;
	}

	public void setDNI(String DNI)
	{
		this.DNI = DNI;
	}
	public String getDNI() 
	{
		return DNI;
	}
	public int	compareTo(String fecha)
	{   
		int dif;
		int f1 = this.getDNI().length();
		int f2 = fecha.length();
		dif = (f1 != f2) ? f1 - f2 : 0;  
		return dif;  
	}

}
