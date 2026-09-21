import java.util.Scanner;
class Arrays{
	static int sum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			}
			return sum;
			}
	public static void main(String args[]){
			System.out.println("enter array size");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				System.out.print("arr["+i+"] :");
				arr[i]=sc.nextInt();
				}
			System.out.println("sum="+sum(arr));
			}
			}
