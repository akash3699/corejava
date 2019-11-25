package org.sunbeam.kdac;



public class Program {
	static int choice;

	public static void main(String[] args) {
		
		while((choice=tester.menuList())!=0)
		{
			switch (choice) {
			case 1:
//				
				tester.acceptRecord();
				break;
			case 2:
				
					tester.printRecord();
					break;

			default:
				System.out.println("Enter correct Choice");
				break;
			}

		
			
		}		
	}

}
