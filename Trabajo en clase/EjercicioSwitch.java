

public class EjercicioSwitch
{
    public static void Calcular(){
        char operacion = '+';
        
        String resultado = "";
        
        int a = 10;
        int b = 5;
        
        switch (operacion){
            case 1:
                operacion = '+';
                System.out.println("a + b = " + (a + b));
                break;
            case 2: 
                operacion = '-';
                System.out.println("a - b =" + (a-b));
                break;
            case 3: 
                operacion = '*';
                System.out.println("a * b =" + (a*b));
                break;
            case 4: 
                operacion = '/';
                System.out.println("a / b =" + (a/b));
                break;
            case 5: 
                operacion = '%';
                System.out.println("a % b =" + (a%b));
                break;
                
            
        }
        
        
    }
}
