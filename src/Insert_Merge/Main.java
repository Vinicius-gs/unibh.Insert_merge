package Insert_Merge;

import java.lang.*;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gerador = new Random();
		
		//int[] arr = {};
		// Tamanho dos arrays
		int[] arr = new int[20000];
		
		//
		long[] arrIn = new long[20000];
		long TotalSumIn=0;
		
		// 
		long[] arrM = new long[20000];
		long TotalSumM=0;
	
		
		Merge merge = new Merge();
		Insertion insertion = new Insertion();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = gerador.nextInt();
		}
		
	       merge.merge(arr, 1, 2, 3);
	       merge.sort(arr, 1, 2);
	       
			for (int i = 0; i < arrM.length; i++) {
				arrM[i] = (long) System.currentTimeMillis();
			}
			
	        for (int i=0; i<arrM.length;i++){
	        	TotalSumM=TotalSumM+arrM[i];
	        }
	        System.out.println("A media em MiliSegundos para o Merge é : "+ (long)(TotalSumM/arrM.length));
	        
	        System.out.println(" ");
		
		
	    insertion.insertion(arr);
		
		for (int i = 0; i < arrIn.length; i++) {
			arrIn[i] = (long) System.currentTimeMillis();
		}
		
        for (int i=0; i<arrIn.length;i++){
        	TotalSumIn = TotalSumIn+arrIn[i];
        }
        System.out.println("A media em MiliSegundos para o Insetion Sort é : "+ (long)(TotalSumIn/arrIn.length));
        
	       

	}

}
