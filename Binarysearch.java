import java.util.Scanner;
class Binarysearch{
	static int search(int[] arr,int k){
		int n=arr.length;
		int low=0,high=n;
		
		while(low<=high){
		int mid=(low+high)/2;
			if(arr[mid]==k)
			return mid+1;
			else if(arr[mid]>k)
			high=mid-1;
			else
			low=mid+1;
		}
		return -1;
	}
	public static void main(String args[]){
		System.out.print("enter the array size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++){
		System.out.print("arr["+i+"]:");
		arr[i]=sc.nextInt();
		}
		System.out.println("enter key:");
		int k=sc.nextInt();
		int result=search(arr,k);
		if(result!=-1)
		System.out.println("position:"+result);
		else
		System.out.println("key not found");
	}
	}
