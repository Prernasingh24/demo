package day5;

import java.util.Scanner;

//wap to search particular element with in an array
// when unsorted data
//each record is traversed
//less volume
public class LinearsearchExample {

	public static void main(String[] args) {
		int i;
		int rollno[]=new int[10];
		Scanner s= new Scanner(System.in);
		for(   i=0;i<10;i++)
		{
		System.out.println("enter array elements ");
		rollno[i]= s.nextInt();
		}
		System.out.println("enter number to be searched  ");
		int p= s.nextInt();
		
		
		int flag=0;
		for(  i=0;i<rollno.length;i++)
		{
			if(rollno[i]==p)
			{  flag=1;
				System.out.println("record found ");
				break;
			}
			
				
		}
		
		//if(i==rollno.length)
		if(flag==0)
			System.out.println("record not found");

	}

}
