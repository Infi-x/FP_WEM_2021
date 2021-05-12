package ejercicioDesarrolloFigura;


public class Figura 
{
	private String forma;
	private String color;
	private static final String ListaColores[] = {"rojo", "anaranjado", "amarillo", "verde", "azul",
			"violeta","rosa", "negro", "blanco", "oro", "plata", "bronce"};

	public Figura()
	{
		
	}
	public Figura(String forma, String color)
	{
		this.forma ="";
		this.color ="";
	}
	public Figura(String forma, int color)
	{
		this.forma = forma;		
	}
	public String getForma() 
	{
		return forma;
	}
	public void setForma(String forma) 
	{
		this.forma = forma;
	}
	public String getColor() 
	{
		return color;
	}
	
	public static boolean validColor(int color)
	{
		return color > 0  && color < ListaColores.length;
	}

	public static boolean  validColor(String color)
	{
		boolean isValid = false;
		for (int i = 0; i < ListaColores.length && !isValid; i++) 
		{
			isValid = ListaColores[i] == color;
		}
		return isValid;
	}
	public void setColor(String color) 
	{
		if (validColor(color)) 
		{
			this.color = color;	
		}
			
	}
	public void setColor(int color) 
	{
		if(validColor(color))
		{
			this.color = colorToColor(color);
		}
	}
	private int colorToColor(String color)
	{
		int posicion = -1;
		for (int i = 0; i < ListaColores.length && posicion != -1; i++) 
		{
			if (ListaColores[i] == color)
			{
				posicion = i;
			}
		}
		return posicion;
	}
	
	private String colorToColor(int color)
	{
		return color > 0 && color < ListaColores.length ? ListaColores[color]: "";
	}
}
