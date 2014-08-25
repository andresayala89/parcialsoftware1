/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Andres
 */
public class testsoftware7 {
 @Test
public void testdecalificacion(){
software7 a = new software7();
a.setdecalificacion(20);
Assert.assertEquals(a.getdecalificacion(), 20);
}
@Test
public void testdenota(){
software7 a = new software7();
a.setdecalificacion(20);
a.Nota();
Assert.assertEquals(a.getRta(), "Nota A");
}
}
