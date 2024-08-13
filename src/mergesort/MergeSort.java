package mergesort;


public class MergeSort {

	public static void main(String[] args) {
		int ar[]= {10,9,15,20,40,6};

		divide(ar,0,ar.length-1);
		for (int i : ar) {
			System.out.print(i+" ");
		}

	}

	private static void divide(int[] ar, int si, int ei) {
		if(si>=ei) {
			return; // Base case: If there is only one element, no need to divide further
		}
		int mid=si+(ei-si)/2;// si + ei / 2 could lead to overflow, so this is safer
		divide(ar, si, mid);
		divide(ar, mid+1, ei);
		conquer(ar,si,mid,ei);

	}

	private static void conquer(int[] ar, int si, int mid, int ei) {

		int merged[]=new int[ei-si+1];

		int indx1=si;
		int indx2=mid+1;
		int x=0;

		while(indx1 <= mid && indx2 <= ei) {
			if(ar[indx1]<ar[indx2]) {
				merged[x++]=ar[indx1++];
			}
			else {
				merged[x++]=ar[indx2++];
			}
		}
// if left side is having more elements present after sorting'
		
		while(indx1<=mid) {
			merged[x++]=ar[indx1++];
		}
		
// if left side is having more elements present after sorting
		
		while (indx2<=ei) {
			merged[x++]=ar[indx2++];
		}

		for(int i=0,j=si; i<merged.length; i++,j++) {

			ar[j]=merged[i];
		}

	}

}
