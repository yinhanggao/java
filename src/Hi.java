import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Hi {
	
	

	public static void main(String[] args) {


		
		
		
		/*
		//�Ʀr��j�p
		Scanner scn = new Scanner(System.in);
		System.out.print("�Чi�D�ڤ@�ӼƦr : ");
		int numb1 = scn.nextInt(); 
		System.out.print("�Чi�D�ڲĤG�ӼƦr : ");
		int numb2 = scn.nextInt();
		boolean big =true;
		if(numb1>numb2) {
			big =true;
		}else
			big =false;
		System.out.printf("%d > %d = %b", numb1,numb2,big);
		scn.close();
		*/
		
		
		/*
		//�P�_�O���O�|�~
		Scanner year = new Scanner(System.in);
		System.out.print("�Чi�D�ڤ@�褸�~�� : ");
		int year1 = year.nextInt(); 
		
		if((year1%400==0)||(year1%4==0)&&(year1%100!=0)){
			System.out.printf("%d �O�|�~", year1);
			}else {
				System.out.printf("%d ���O�|�~", year1);
			}
		*/
		
		
		/*
		Integer[] arr = {32,24,11,48,15};
		for(int i = 0 ;i <= arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("\n---------------------------------------\n");
		
		Arrays.sort(arr);	//��arr�}�C�̭����ȥѤp��j�ƦC
		for(int i = 0 ;i <= arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr,Collections.reverseOrder());//��arr�}�C�̭����ȥѤj��p�ƦC
		
		System.out.print("\n---------------------------------------\n");
		
		for(int i = 0 ;i <= arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		int n1 = Arrays.binarySearch(arr, 15);	//�barr�}�C��15��^�L�b�}�C������m
		
		System.out.print("\n---------------------------------------\n");

		System.out.print(n1);
		
		*/
		
		
		/*
		for(int i = 0; i <= args.length-1;i++) {
			System.out.print(args[i]+"  \n");
		}
		*/

		
		
		
		
		
		int arr[] = new int [10];
		
		
		for(int i = 0 ;i < 10 ; i++ ) {
			
			int n = (int)(Math.random()*(10-1+1)+1);
			
			for(int j = 0 ;j < i ;) {
				
				if(arr[j] == arr[i]) {
					
					arr[i] = (int)(Math.random()*(10-1+1)+1);
					
					j = 0;
					
				}else j++ ;
				
			}
			

			
			System.out.print(arr[i]+" ");
		}
		
//		System.out.print(n);

		
		
		
		
	}

}
