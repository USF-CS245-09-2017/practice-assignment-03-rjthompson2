public class BinaryRecursiveSearch implements Practice03Search{
	protected int start = 0;
	protected int end;
	protected int count = 1;
	protected int mid;

	public int search(int [] arr, int target){
		mid = (start+end)/2;
		if (count == 1){
			end = arr.length-1;
		}
		//System.out.println(mid);
		count++;
		if (start> end){
			//System.out.println(-1);
			return -1;
		}
		if (arr[mid]== target){
			//System.out.println(mid);
			return mid;
		}
		else if (arr[mid]<target){
			start = mid+1;
			return this.search(arr, target);
		}
		else if (arr[mid]>target){
			end = mid-1;
			return this.search(arr, target);
		}
		return -1;
	}

	public String searchName(){
		return "binaryrecursive";
	}
}