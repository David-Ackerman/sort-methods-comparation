
public class HeapSort {
	
	public void sort(Float[] vetor) 
    { 
		
        int n = vetor.length;  
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(vetor, n, i); 
        for (int i=n-1; i>=0; i--) 
        { 
             
            Float temp = vetor[0]; 
            vetor[0] = vetor[i]; 
            vetor[i] = temp; 
            heapify(vetor, i, 0); 
        } 
        //return vetor;
    } 
 
    void heapify(Float[] vetor, int n, int i) 
    { 
        int largest = i;   
        int l = 2*i + 1;   
        int r = 2*i + 2;   
   
        if (l < n && vetor[l] > vetor[largest]) 
            largest = l; 
   
        if (r < n && vetor[r] > vetor[largest]) 
            largest = r; 
  
        if (largest != i) 
        { 
            Float swap = vetor[i]; 
            vetor[i] = vetor[largest]; 
            vetor[largest] = swap;  
            heapify(vetor, n, largest); 
        } 
    } 
}
