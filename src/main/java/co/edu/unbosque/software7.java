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
@ManagedBean(name = "software7")
public class software7 {
     int cal;
String rta;
public int getdecalificacion() {
return cal;
}
public void setdecalificacion(int cal) {
this.cal = cal;
}
public String getRta() {
return rta;
}
public void setRta(String rta) {
this.rta = rta;
}
public void Nota(){
if(cal>=19 && cal<=20){
rta = "La nueva nota es : A";
}else if(cal>=16 && cal<=18){
rta = "La nueva nota es : B";
}else if(cal>=13 && cal<=15){
rta = "La nueva nota es : C";
}else if(cal>=10 && cal<=12){
rta = "La nueva nota es : D";
}else if(cal>=1 && cal<=9){
rta = "La nueva nota es : E";
}else
rta = "Fuera del rango de calificacion";
}
}
