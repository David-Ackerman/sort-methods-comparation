
public class InsertionSort {

    void sort(Float[] vetor) 
    { 

        int n = vetor.length; 
        for (int i=1; i<n; ++i) 
        { 
            Float key = vetor[i]; 
            int j = i-1; 
  
            while (j>=0 && vetor[j] > key) 
            { 
                vetor[j+1] = vetor[j]; 
                j = j-1; 
            } 
            vetor[j+1] = key; 
        }
        //printArray(vetor);
        //return vetor1;
    } 
  
}
