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
@ManagedBean(name = "software4")
public class software4 {
    String rta;
    int valor1;
    int valor2;
    double hipo;
    
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
public void Hipotenusa(){
int aux = (valor1*valor1)+(valor2*valor2);
hipo = Math.sqrt(aux);
rta = "Hipotenusa: " + hipo;
} 
}
