/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaimc;


public class JavaIMC {
    public JavaIMC(){
       
   }

 public double resultadoIMC(double peso,double altura){
       double resultado;
       resultado = (peso/Math.pow(altura,2));
       return resultado;
   }
    public String obeIMC(double imc){
        String diagnostico="";
        if (imc<15){
           diagnostico=" Significa delgadez muy severa";
        }     
        if (imc>15 && imc<15.9){
            diagnostico=" Significa delgadez severa";
        }
        if (imc>16 && imc<18.4){
             diagnostico=" Significa delgadez";
        }
        if (imc>18.5 && imc<24.9){
            diagnostico=" Significa peso saludable";
        } 
        if (imc>25 && imc<29.9){
             diagnostico=" Significa sobrepeso";
         }  
        if (imc>30 && imc<34.9){
           diagnostico=" Significa obesidad severa";
        }
        if (imc>40){
             diagnostico=" Significa obesidad morbida";
        }
     return diagnostico;  
    } 
    
}
