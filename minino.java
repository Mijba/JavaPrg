import java.util.*;
class Accept
{ 
    Scanner sc = new Scanner(System.in);
    int[] arr;

	void enter()
	{
		System.out.println("Enter Array size");
        int n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter Array elements");
		for (int i = 0; i < arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
	}
	void display()
	{
		int min = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("the minimum no is"+min);
	}
}
class minino 
{
	public static void main(String[] args) 
	{
		Accept obj = new Accept();
		obj.enter();
		obj.display();
	}
}
