
public class QuickSort {

 int partition(Float[] vetor, int low, int high)
 {
     Float pivot = vetor[high]; 
     int i = (low-1); 
     for (int j=low; j<high; j++)
     {

         if (vetor[j] <= pivot)
         {
             i++;
             Float temp = vetor[i];
             vetor[i] = vetor[j];
             vetor[j] = temp;
         }
     }

     Float temp = vetor[i+1];
     vetor[i+1] = vetor[high];
     vetor[high] = temp;

     return i+1;
 }

 void sort(Float[] vetor, int low, int high)
 {
     if (low < high)
     {
        
         int pi = partition(vetor, low, high);
         sort(vetor, low, pi-1);
         sort(vetor, pi+1, high);
     }
 }
 
}
