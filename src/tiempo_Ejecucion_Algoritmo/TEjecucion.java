package tiempo_Ejecucion_Algoritmo;

import java.util.Random;

     public class TEjecucion {
	 
    	 public static void main(String[] args) {
    	 long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
    	 TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
    			

    			
    			int tabla[]=new int[10];
    			Random rnd=new Random();
    			int i,j,x=0,aux;
    						
    			for(i=0;i<10;i++)
    				{
    				x=(int)(rnd.nextDouble()*100);
    				tabla[i]=x;
    				
    				System.out.println("Numeros de Entrada ="+tabla[i]);
    				
    				}


    				for(i=0;i<10-1;i++)

    				{

    					for (j=0;j<10-i-1;j++)

    					{

    						if(tabla[j]>tabla[j+1])
    						{
    							aux=tabla[j];
    							tabla[j]=tabla[j+1];
    							tabla[j+1]=aux;
    						}
    						
    					}
    				}
    				System.out.println("");
    				for (i=0;i<tabla.length;i++)
    				System.out.println(" Numeros Ordenadados ="+tabla[i]);
    				
    				 TFin = System.currentTimeMillis();
    			      tiempo = TFin - TInicio;
    			      System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
    			     

    	}

    	}
