package bubblesort;

public class BubbleSort {
	public static void main(String[] args) {
		int ar[]= {10,9,15,20,40,6};
		int c=0;
		for(int i=0;i<ar.length-1;i++) {
			boolean isSwapped=false;
			for(int j=0;j<ar.length-i-1;j++) {
				c++;
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					isSwapped=true;
				}

			}
			if(!isSwapped) {
				break;
			}

		}
		System.out.println(c);
		for(Integer a:ar) {
			System.out.print(a+" ");
		}
	}

}
