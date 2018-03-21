package tiempo_Ejecucion_Algoritmo;

import java.util.Random;

public class MergeSort {
	
	
	static void loadRandomData(int[] A, int a, int b) {
	    Random rand = new Random();
	    int range = b - a;
	    for (int i = 0; i < A.length; ++i)
	      A[i] = rand.nextInt(range) + a;
	  }
	  
	 
	  static String arrayToString(int[] A) {
	    String s = "[";
	    int n = A.length;
	    for (int i = 0; i < n - 1; ++i)
	      s += A[i] + ", ";
	    s += A[n - 1] + "]";
	    return s;
	  }

	 
	  static void merge(int A[], int primero, int ultimo, int medio) {
	    int i = primero; 
	    int j = medio + 1;
	    int k = primero;
	    while (i <= medio && j <= ultimo) {
	     
	      if (A[i] <= A[j]) {
	        B[k] = A[i];
	        ++i;
	      }
	      else {
	        B[k] = A[j];
	        ++j;
	      }
	      ++k;
	      ++loop;
	    }
	    j = ultimo;
	   
	    for (int h = medio; h >= i; --h) {
	      ++loop;
	      A[j] = A[h];
	      --j;
	    }
	 
	    for (j = primero; j < k; ++j) {
	      ++loop;
	      A[j] = B[j];
	    }
	  }
	  
	 
	  static void mergeSort(int[] A, int first, int last) {
	    if (first < last) {
	      int mid = (first + last) / 2;
	      mergeSort(A, first, mid);
	      mergeSort(A, mid + 1, last);
	      merge(A, first, last, mid);
	    }
	  }

	  public static final int N = 10;
	  public static int[] B = new int[N];
	  public static int loop = 0;
	  
	  public static void main(String args[]) {
		  long TInicio, TFin, tiempo; 
		  TInicio = System.currentTimeMillis(); 
		  
	    int[] inputArray = new int[N];
	    loadRandomData(inputArray, -100, 100);
	    System.out.println("*** Merge Sort ***");
	    System.out.println("Numeros de entrada: " + arrayToString(inputArray));
	    mergeSort(inputArray, 0, N - 1);
	    System.out.println("Numeros ordenados: " + arrayToString(inputArray));
	    // m = N * log_2(N).
	    double m = N * (Math.log(N) / Math.log(2));
	    System.out.println("N * log_2(N) = " + m);
	    
	    TFin = System.currentTimeMillis();
	      tiempo = TFin - TInicio;
	      System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
	   
	  }

	}
	
	

	