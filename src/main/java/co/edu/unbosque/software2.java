/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import java.util.Scanner;

/**
 *
 * @author F211
 */
public class software2 {
    int valor1;
int valor2;
int valor3;
String rta;
public int getValor1() {
return valor1;
}
public void setValor1(int valor1) {
this.valor1 = valor1;
}
public int getValor2() {
return valor2;
}
public void setValor2(int valor2) {
this.valor2 = valor2;
}
public int getValor3() {
return valor3;
}
public void setValor3(int valor3) {
this.valor3 = valor3;
}
public String getResultado() {
return rta;
}
public void setResultado(String resultado) {
this.rta = rta;
}
public void cualEsMayor(){
if(valor1>valor2){
if(valor1>valor3){
if(valor2>valor3){
rta = "mayor "+valor1+" y menor " + valor3;
}else{
rta = "mayor "+valor1+" y menor " + valor2;
}
}else if(valor2>valor3){
if(valor3>valor1){
rta = "mayor "+valor2+" y menor " + valor1;
}else{
rta = "mayor "+valor2+" y menor " + valor3;
}
}else{
if(valor1>valor2){
rta = "mayor "+valor3+" y menor " + valor2;
}else{
rta = "mayor "+valor3+" y menor " + valor1;
}
}
}else if(valor2>valor3){
if(valor1>valor3){
rta = "mayor "+valor2+" y menor " + valor3;
}else{
rta = "mayor "+valor2+" y menor " + valor1;
}
}else{
if(valor2>valor1){
rta = "mayor "+valor3+" y menor " + valor1;
}else{
rta = "mayor "+valor3+" y menor " + valor2;
}
}
}
}