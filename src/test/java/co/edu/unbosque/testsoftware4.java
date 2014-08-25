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
public class testsoftware4 {
 
@Test
public void testgetCatetovalor1(){
    software4 a = new software4();
    a.setvalor1(2);
    Assert.assertEquals(a.getvalor1(), 2);
}
@Test

public void testgetCatetovalor2(){
    software4 a = new software4();
    a.setvalor2(2);
Assert.assertEquals(a.getvalor2(), 2);
}

@Test
public void testHipotenusa(){
software4 a = new software4();
a.setvalor1(2);
a.setvalor2(2);
a.Hipotenusa();
Assert.assertEquals(a.getRta(), "Hipotenusa: 2.8284");
}   
}
