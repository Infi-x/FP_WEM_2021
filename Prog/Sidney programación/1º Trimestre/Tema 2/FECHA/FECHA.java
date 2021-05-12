
/**
 * Programa en BlueJ desde cero.
 * @author Sidney Cadahia
 * @version 
 */
public class FECHA {
    private int day;
    private int month;
    private int year;
    
    public FECHA(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
    
    public String toString() {
        String res = day+"/"+month+"/"+year;
        return res;
    }
    
    public void printFecha() {
        
    }
    
    public void setDay(int d) {
        day = d;
        if (day < 1 && day > diasMes()) {
            System.out.println("Fecha no válida");
        }
    }
    
    private int diasMes() {
        int res = 0;
        
        if (month==2) {
            if (bisiesto() == true) {
                res = 29;
            } else {
                res = 28;
            }
        } else {
            if (month==4 || month==6 || month==9 || month==11) {
                res = 31;
            } else {
                res = 30;
            }
        }
        return res;
    }
    
    private boolean bisiesto() {
        if (year%4==0 && (year%100==0 || year%400==0)) {
            return true;
        } else {
            return false;
        }
    }
    
    public int getDay() {
        return day;
    }
    
    public void setMonth(int m) {
        day = m;
        if (month < 1 && month > 12) {
            System.out.println("Fecha no válida");
        }
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setYear(int y) {
        year = y;
        if (year < 0) {
            System.out.println("Fecha no válida");
        }
    }
    
    public int getYear() {
        return year;
    }

    public FECHA diaSiguiente() {
        int d = day;
        int m = month;
        int y = year;
        
        d = d + 1;
        
        if (d>diasMes()) {
            d = 1;
            m = m + 1;
            if (m==13) {
                m = 1;
                y = y + 1;
            }
        }
        
        return new FECHA(d, m, y);
    }
}