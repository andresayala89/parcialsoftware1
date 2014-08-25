/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Andres
 */
public class testsoftware1 {
    
@Test
public void testgetValor1(){
software1 n = new software1();
n.setvalor1(2);
Assert.assertEquals(n.getvalor1(),2);
}
@Test
public void testgetValor2(){
software1 n = new software1();
n.setvalor2(3);
Assert.assertEquals(n.getvalor2(),3);
}
@Test
public void testsonIguales(){
software1 a = new software1();
a.setvalor1(2);
a.setvalor2(2);
a.Mayor();
Assert.assertEquals(a.getRta(),"Los numeros son iguales");
}
@Test
public void cualEsMayor(){
software1 a = new software1();
a.setvalor1(4);
a.setvalor2(2);
a.Mayor();
Assert.assertEquals(a.getRta(),"mayor: 4");
}
}
