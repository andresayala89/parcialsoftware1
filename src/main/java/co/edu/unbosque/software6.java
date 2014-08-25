/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Andres
 */
@ManagedBean(name = "software6")
public class software6 {
     int valor1;
String rta;
public int getvalor1() {
return valor1;
}
public void setvalor1(int valor1) {
this.valor1 = valor1;
}
public String getRta() {
return rta;
}
public void setResultado(String rta) {
this.rta = rta;
}
public void Par() {
if(valor1%2==0){
rta = valor1+" es par";
}else
rta = valor1+" es impar";
}
}
