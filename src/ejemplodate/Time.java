/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodate;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author dani
 */
public class Time{
    public static void calculoAntiguedad(TrabajadorDate tr){
        LocalDate baja= LocalDate.now();
        LocalDate alta=tr.getFecha_alta();
        Period periodo=Period.between(alta, baja);
        System.out.println("Hay una diferencia de "+periodo.getYears()+" años,"+periodo.getMonths()+" meses,"+periodo.getDays()+" días.");
        
        
    }
}
