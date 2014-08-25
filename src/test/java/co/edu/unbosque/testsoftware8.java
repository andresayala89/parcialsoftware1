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
public class testsoftware8 {
     @Test
public void testordenar1(){
software8 n = new software8();
n.setvalor1(3);
Assert.assertEquals(n.getvalor1(),3);
}
@Test
public void testgetordenar2(){
software8 a = new software8();
a.setvalor2(4);
Assert.assertEquals(a.getvalor2(),4);
}
@Test
public void testOrden(){
software8 a = new software8();
a.setvalor1(5);
a.setvalor2(1);
a.Orden();
Assert.assertEquals(a.getRta(), "Orden de menor a mayor 1,5");
}
}
