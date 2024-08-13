package selectionsort;

public class SelectionSort {
//	select the index of the smallest value and swap elements
	public static void main(String[] args) {
		int arr[]= {10,20,3,13,18,11};
		
		for(int i=0;i<arr.length-1;i++) {
			int si=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[si]) {
					si=j;
				}
			}
			
			int temp=arr[i];
			arr[i]=arr[si];
			arr[si]=temp;
		}
		
		for(Integer a:arr) {
			System.out.print(a+" ");
		}
		
	}

}
