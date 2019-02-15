public class BinaryRecursiveSearch implements Practice03Search{
	protected int start = 0;
	protected int end = arr.length-1;

	public int search(int [] arr, int target){
		int mid = (start+end)/2;
		if (arr[mid]== target){
			return mid;
		}
		else if (arr[mid]<target){
			start = mid+1;
			this.search(arr, target);
		}
		else if (arr[mid]>target){
			end = mid-1;
			this.search(arr, target);
		}
		else{
			return -1;
		}
	}

	public String searchName(){
		return "binaryrecursive";
	}
}