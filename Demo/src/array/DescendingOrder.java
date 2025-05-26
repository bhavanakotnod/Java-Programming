package array;
// print the array in decending order
public class DescendingOrder {
	public static void main(String[] args) {
		int num[] = {7,5,2,8,1,9};
		for(int i = 0 ; i<num.length;i++) {
			for(int j = i+1;j < num.length;j++) {
				if(num[i]< num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j]= temp;
					
				}
			}
			
			}
		// decending order of element after sorting
		System.out.println("array sorted in decending order");
		for(int i =0;i<=num.length-1;i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		// smallest element in array list
		int smallest = num[num.length-1];
		System.out.println("smallest element in array list "+ smallest);
		
	}

}
