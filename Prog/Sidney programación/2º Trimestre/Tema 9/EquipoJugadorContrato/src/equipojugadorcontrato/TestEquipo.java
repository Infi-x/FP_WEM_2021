/**
 * Clase para testear Equipo. Incluye el main.
 */
package equipojugadorcontrato;

public class TestEquipo
{
   
    
    public static void main(String[] args)
    {
         
        Equipo equipo = new Equipo("Mi equipo"); 
        GestorEquipo gestor = new GestorEquipo(equipo);
        
        String[] nombres = {"Eto", "Robinho", "Rail", "Iniesta", "Messi" };
        int[] edades = {25, 24, 26, 22, 21 };
        double[] salarios = {7, 3, 4, 8, 5};
        equipo.firmarContratos(nombres, edades, salarios);
        gestor.iniciar();
    }

 
}
