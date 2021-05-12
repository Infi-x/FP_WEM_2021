/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


/**
 *
 * @author dedei
 */
public class GG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Date f1 = new GregorianCalendar().getTime();
        String fechaS="25/05/2001";
        String[] fec=fechaS.split("/");
        int dia=Integer.parseInt(fec[0]);
        int mes=Integer.parseInt(fec[1])-1;
        int year=Integer.parseInt(fec[2]);
        Date f2= new GregorianCalendar(year,mes,dia).getTime();
        System.out.println("Número de años entre las fechas: " + obtenerAnios(f2,f1));
    }

    public static int obtenerAnios(Date pri, Date seg) {
        Calendar a = getCalendar(pri);
        Calendar b = getCalendar(seg);
        int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
        if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH))
            if(a.get(Calendar.DAY_OF_MONTH)>b.get(Calendar.DAY_OF_MONTH))
            diff--;
        
        return diff;
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }
}
    /*String fechaS="1/10/2001";
                String[] fec=fechaS.split("/");
                int dia=Integer.parseInt(fec[0]);
                int mes=Integer.parseInt(fec[1])-1;
                int year=Integer.parseInt(fec[2])-1900;
                Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
                int diferencia=fecha.getYear()-year;
                int mesd=fecha.getMonth()-mes;
                int diad=fecha.getDay()-dia;
                if(mesd<=0)
                    if(diad<=0)
                        diferencia--;
                System.out.println(diferencia);*/

