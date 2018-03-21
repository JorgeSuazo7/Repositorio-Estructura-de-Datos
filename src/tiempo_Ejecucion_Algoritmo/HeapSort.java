package tiempo_Ejecucion_Algoritmo;

import java.util.Random;

public class HeapSort {
	
	public static void main(String[] args) {
		
	    long TInicio, TFin, tiempo; 
	    TInicio = System.currentTimeMillis(); 

		   
	    int n = 10;
	    Random rng = new Random();
	    int[] v = new int[10];
	    for(int i=0;i<n;i++){
	        v[i] = (rng.nextInt(100));
	    }
	    for(int i=0;i<n;i++){
	       System.out.println("Numeros de Entrada = "+v[i]);
	    }
	    System.out.println("\nHeapsort!\n");
	    Heapsort(v);
	    for(int i=0;i<n;i++){
	    	 System.out.println("Numeros Ordenados = "+v[i]);
	    	 
	    	
	    }
	    TFin = System.currentTimeMillis();
	      tiempo = TFin - TInicio;
	      System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
	}

	private static void Heapsort(int[] v) {
		makeheap(v);
	    for(int i=v.length-1;i>0;i--){
	        int t = v[0];
	  	      v[0] = v[i];
	  	      v[i] = t;
	        heapify(v,0,i);
	    }
		
	}

	private static void makeheap(int[] v) {
		 for(int i=v.length/2;i>=0;i--){
		        heapify(v,i,v.length);
		    }
		
	}

	private static void heapify(int[] v, int i, int heapsize) {

	    int l,r;
	    while(i<heapsize){
	        l = 2*i+1;
	        r = 2*i+2;
	        int maior = i;
	        if(l<heapsize && v[l]>v[i]){
	            maior = l;
	        }
	        if(r<heapsize && v[r]>v[maior]){
	            maior = r;
	        }
	        if(maior!=i){
	            int t = v[maior];
		  	      v[maior] = v[i];
		  	      v[i] = t;
	            i = maior;
	        }
	        else{
	            break;
	        }
	    }
		
	}
}