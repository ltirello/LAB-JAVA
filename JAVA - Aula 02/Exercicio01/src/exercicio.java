package MaiorMenor;

import java.util.Scanner;

public class maiormenor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);  
  
        int numero, menor, maior;  
        System.out.print ("Digite um numero: ");  
        numero = input.nextInt();
        menor = numero;
        maior = numero;
        
        System.out.print ("Digite um numero: ");  
        numero = input.nextInt();
        
        if(numero>maior){
            
            maior = numero;
        }
        if(numero<menor){
            menor = numero;
        }
        
        System.out.print ("Digite um numero: ");  
        numero = input.nextInt();
        
        if(numero>maior) {
            
            maior = numero;
        }
        if(numero<menor) {
            menor = numero;
        }
        
        System.out.print ("Digite um numero: ");  
        numero = input.nextInt();
        
        if(numero>maior){
            
            maior = numero;
        }
        if(numero<menor){
            menor = numero;
        }
        
        System.out.print ("Digite um numero: ");  
        numero = input.nextInt();
        
        if(numero>maior){
            
            maior = numero;
        }
        if(numero<menor){
            menor = numero;
        }
        
        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);
    }
}
