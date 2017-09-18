package IT391.Sieglaff.unit4;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] partNumbers = {1065, 1095, 1075, 1055, 1056, 1090, 1098, 1088, 1097, 1078};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a part number to search for: ");
		int search = input.nextInt();
		
		int value = sequentialSearch(partNumbers, search);
		if(value==-1)
			System.out.printf("%d is not in stock\n\n", search);
		else
			System.out.printf("%d is in stock\n\n", search);
		
		System.out.println("Please enter a second part number to search for: ");
		search = input.nextInt();
		value = sequentialSearch(partNumbers, search);
		if(value==-1)
			System.out.printf("%d is not in stock\n\n", search);
		else
			System.out.printf("%d is in stock\n\n", search);
		input.close();
	}

	private static int sequentialSearch(int[] array, int element) {
		for(int i = 0; i<array.length;i++)
		{
			if(array[i]==element)
				{
					System.out.printf("The part number %d was found at index %d\n", element,i);
					return element;			
				}
		}
		return -1;
	}
}
