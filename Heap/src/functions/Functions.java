package functions;


public class Functions {
	
	public void heapifyDown(int [] arr, int i) {
		int l = 2*i;
		int r = 2*i + 1;
		int n = arr.length;
		int largest = i;
		if(l<=n && arr[l] > arr[r])
			largest = i;
		if(r<=n && arr[r] > arr[largest])
			largest = r;
		
		if(largest != i) {
			exchange(arr,i,largest);
			heapifyDown(arr,largest);
		}
	}
	
	private static void exchange(int [] arr, int i , int j) {
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}
	
	public void heapifyUp(int [] arr, int i) {
		int f = i / 2;
		int largest = i;
		if(arr[f] < arr[largest]) {
			exchange(arr,f,largest);
			largest = f;
			heapifyUp(arr,largest);
		}
	}
	
	public void BuildHeap(int [] arr, int n) {
		int heapSize = arr.length;
		for(int i = heapSize / 2 ; i>0 ; i--) 
			heapifyDown(arr, i);
			
		
	}
	
	public void HeapExtractMax(int [] arr) {
		if(arr.length<1)
			System.err.println("error");
		int max = arr[1];
		arr[1] = arr[arr.length - 1];
	}

}
