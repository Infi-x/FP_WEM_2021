/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_ad_5;

/**
 *
 * @author dedei
 */
public class Articulo implements Producto
{
	
	private String descripcion;
	private double precioUnitario;

	public Articulo(String descripcion, double precio)
	{
		this.descripcion = descripcion;
		precioUnitario = precio;
	}

	public double getPrecio()
	{
		return precioUnitario;
	}
	
	public String getDescripcion()
	{
		return descripcion;
	}
	
	public void setPrecio(double precio)
	{
		 precioUnitario = precio;
	}

    
    public String getNombre() {
        return this.getDescripcion();
    }

    
   
}

