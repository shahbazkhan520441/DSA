package bubblesort;

public class BubbleDown {
	public static void main(String[] args) {
		int ar[]= {10,9,15,20,40,6};
		int c=0;
		for(int i=0;i<ar.length-1;i++) {
			boolean isSwapped=false;
			for(int j=i-1;j<ar.length;j++) {
				c++;
				if(ar[j]<ar[i]) {
					int temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
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
