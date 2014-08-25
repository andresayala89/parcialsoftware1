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
public class testsoftware5 {
     @Test
public void testderadio(){
software5 a = new software5();
a.setradio(4);
Assert.assertEquals(a.getradio(), 4);
}
@Test
public void testdealtura(){
software5 a = new software5();
a.sethipotenusa(6);
Assert.assertEquals(a.gethipotenusa(), 6);
}
@Test
public void testdevolumen(){
software5 a = new software5();
a.setradio(4);
a.sethipotenusa(6);
a.calvolumen();
Assert.assertEquals(a.getvolumen(),"El volumen es 301.5928");
}
@Test
public void testdearea(){
software5 a = new software5();
a.setradio(2);
a.sethipotenusa(1);
a.calarea();
Assert.assertEquals(a.getarea(),"El area es 25.1327");
}
}
