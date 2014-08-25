/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;
import org.testng.Assert;
import org.testng.annotations.Test;
import co.edu.unbosque.software3;
/**
 *
 * @author Andres
 */
public class testsoftware3 {
     @Test
public void testgetValor1(){
software3 a = new software3();
    a.setN(4);
        Assert.assertEquals(a.getN(),4);
}
@Test
public void cualEsMayorNumeroMayor(){
software3 a = new software3();
    a.setN(9);
        a.hacersumaHasta10();
            Assert.assertEquals(a.getResultado(),"la suma total de los 10 primeros es 55");
}
}
