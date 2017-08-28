
package calculadora;


public class Calculadora {
    
    float operando1;
    float operando2;
    float resultado;
    
    void sumar(){
        
        resultado= operando1+operando2;
    }
    
    void restar() {
        
        resultado=operando1-operando2;
    }
    
    void multiplicación (){
        
        resultado= operando1*operando2;
    }
    
    void división (){
        
        if(operando2 != 0){
            
            resultado= operando1/operando2;
        }
        
    }
}
