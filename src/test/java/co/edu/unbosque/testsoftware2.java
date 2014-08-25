/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque;

import co.edu.unbosque.software2;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class testsoftware2 {

   @Test
public void testgetValor1(){
software2 n = new software2();
n.setValor1(3);
Assert.assertEquals(n.getValor1(),3);
}
@Test
public void testgetValor2(){
software2 n = new software2();
n.setValor2(3);
Assert.assertEquals(n.getValor2(),3);
}
@Test
public void testgetValor3(){
software2 n = new software2();
n.setValor3(3);
Assert.assertEquals(n.getValor3(),3);
}
@Test
public void cualEsMayorNumeroMayor(){
software2 n = new software2();
n.setValor1(3);
n.setValor2(9);
n.setValor3(1);
n.cualEsMayor();
Assert.assertEquals(n.getResultado(),"El numero mayor es:9 y el numero menor es: 1");
}
}

