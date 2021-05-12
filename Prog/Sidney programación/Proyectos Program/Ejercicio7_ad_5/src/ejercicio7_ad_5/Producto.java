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
public interface Producto {
    public double getPrecio();
    public String getDescripcion();
    public String getNombre();
    boolean equals(Object p);
}
