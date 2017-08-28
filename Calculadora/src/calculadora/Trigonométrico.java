
package calculadora;


public class Trigonométrico extends Calculadora {
   
    void cambiar(){
        
        operando1=(float)Math.toRadians(operando1);
        
    }
    
    void seno(){
       resultado=(float)Math.sin(operando1);
       cambiar();
    }
    
    void coseno(){
        resultado=(float)Math.cos(operando1);
        cambiar();
    }
    
    void tangente (){
        resultado=(float)Math.tan(operando1);
        cambiar();
    }
    
}
