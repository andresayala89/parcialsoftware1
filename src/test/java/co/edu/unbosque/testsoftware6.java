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
public class testsoftware6 {
    
@Test
public void testdevalor(){
software6 a = new software6();
a.setvalor1(4);
Assert.assertEquals(a.getvalor1(), 4);
}
@Test
public void testPar(){
software6 a = new software6();
a.setvalor1(5);
a.Par();
assert.assertEquals(a.getRta(), "Numero 5 es impar");
}
}
