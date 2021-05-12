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
public class Ejercicio7_ad_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto horno = new Articulo("Horno microonda", 90.0);
	Producto tostador = new Articulo("Tostador", 20.0);
	Producto paqueteTostador = new Paquete(4, tostador);

	GrupoProductos  kitCocina = new GrupoProductos("Cocina");
	kitCocina.add(horno);
	kitCocina.add(tostador);

	GrupoProductos  kitRestaurante = new GrupoProductos("Restaurante");
	kitRestaurante.add(kitCocina);
	kitRestaurante.add(paqueteTostador);
        
        Tienda t=new Tienda("PepeTienda",30000.00,0.75);
        Producto paquetecocina=new Paquete(3,kitCocina);
        
        t.ComprarProducto(horno, 20);
        t.ComprarProducto(tostador, 15);
        t.ComprarProducto(kitCocina, 30);
        t.ComprarProducto(kitRestaurante, 40);
        t.ComprarProducto(paqueteTostador, 40);
        t.ComprarProducto(paquetecocina,30);
        t.listarProductos();
        t.ModificarPrecioArticulo("Horno microonda",-20);
        t.listarProductos();
        
    }
    
}
