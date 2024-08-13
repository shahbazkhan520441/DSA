package insertionsort;

public class InsertionSort {
public static void main(String[] args) {
//	check the previous value and exchange it if it is less then incoming value
	int ar[]= {10,2,3,13,18,11};
	
	for(int i=0;i<ar.length;i++) {
		int key=ar[i];
		int j=i-1;
		while(j>=0&&ar[j]>key) {
			ar[j+1]=ar[j];
			j--;
		}
		ar[j+1]=key;
	}
	
	for(Integer a:ar) {
		System.out.print(a+" ");
	}
}
}
