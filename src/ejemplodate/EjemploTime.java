/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodate;

import java.time.LocalDate;

/**
 *
 * @author dani
 */
public class EjemploTime{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2012, 12, 06);
        TrabajadorDate trabajador=new TrabajadorDate("Dani",date);
        
        Time.calculoAntiguedad(trabajador);
    }
    
}
