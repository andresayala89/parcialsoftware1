/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

/**
 *
 * @author Andres
 */
public class software8 {
     int valor1;
int valor2;
String rta;
public int getvalor1() {
return valor1;
}
public void setvalor1(int valor1) {
this.valor1 = valor1;
}
public int getvalor2() {
return valor2;
}
public void setvalor2(int valor2) {
this.valor2 = valor2;
}
public String getRta() {
return rta;
}
public void setRta(String rta) {
this.rta = rta;
}
public void Orden(){
if(valor1>valor2){
rta="De menor a mayor "+ valor2+","+valor1;
}else
rta="De menor a mayor "+valor1+","+valor2;
}
}
