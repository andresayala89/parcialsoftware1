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
@ManagedBean(name = "software5")
public class software5 {
    int radio;
int hipotenusa;
double calarea;
double calvolumen;
String area;
String volumen;
public int getradio() {
return radio;
}
public void setradio(int radio) {
this.radio = radio;
}
public int gethipotenusa() {
return hipotenusa;
}
public void sethipotenusa(int hipotenusa) {
this.hipotenusa = hipotenusa;
}
public String getarea() {
return area;
}
public void setarea(String area) {
this.area = area;
}
public String getvolumen() {
return volumen;
}
public void setvolumen(String volumen) {
this.volumen = volumen;
}
public void calvolumen() {
calvolumen = (Math.PI)*(radio*radio)*hipotenusa;
volumen = "Volumen: " + calvolumen;
}
public void calarea() {
calarea = 2*(Math.PI)*radio*(hipotenusa*radio);
area = "Area: " + calarea;
} 
}
