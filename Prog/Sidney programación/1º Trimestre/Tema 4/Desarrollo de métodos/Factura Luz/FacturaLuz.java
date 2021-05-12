/**
 * Write a description of class FacturaLuz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FacturaLuz {
    private int lecturaAnterior;
    private int lecturaActual;
    private final double VALOR_KW = 8.6;
    private final double IVA = 0.16;

    public FacturaLuz(int lAnt, int lAct) {
        lecturaAnterior = lAnt;
        lecturaActual = lAct;
    }

    public int getConsumo() {
        return lecturaActual - lecturaAnterior;
    }
    
    public double getImporteTotal() {
        double importe = getConsumo() * VALOR_KW * (1+IVA);
        return importe;
    }
}
