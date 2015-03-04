import java.util.Scanner;
public class LockerDemo{
	
	public static void main(String[]args){
		
		Scanner input =new Scanner(System.in);
		int numM1,numM2,numM3, lNum, i=1, count=0, p=1;
		CombinationalLock mickeyLock = new CombinationalLock(28 ,17, 39);
		CombinationalLock donaldLock = new CombinationalLock(35,16, 27);
		Locker mickeyLocker = new Locker(100,mickeyLock, 3);
		Locker donaldLocker = new Locker(275,donaldLock, 0);
		
		while(i!=0){
		System.out.println("Please enter Mickey's combination #1");
		numM1=input.nextInt();
		System.out.println("Please enter Mickey's combination #2");
		numM2=input.nextInt();
		System.out.println("Please enter Mickey's combination #3");
		numM3=input.nextInt();
		
		mickeyLock.openLock(numM1,numM2,numM3);
		System.out.println("Would you like to try again?"
				+ " \nIf not please please 1 if locker is open press 0 to try again");
		i=input.nextInt();
		}
		
		while(i!=0){
		System.out.println("Please enter locker # for Mickey");
		lNum=input.nextInt();
		mickeyLocker.openLocker(lNum,mickeyLock);
		System.out.println("\nWould you like to try again?"
				+ " \nIf not please please 1 if locker is open press 0 to try again");
		i=input.nextInt();
		}
		
		System.out.print("How many books would you like to place in Mickeys locker?");
		count=input.nextInt();
		for(int b=0;b<count;b++){
		mickeyLocker.putBookInLocker();
		}
		System.out.print("How many books would you like to remove from Mickeys locker?");
		count=input.nextInt();
		for(int b=0;b<count;b++){
		mickeyLocker.removeBookFromLocker();
		}
		
		while(p!=0){
			System.out.println("Please enter Donalds's combination #1");
			numM1=input.nextInt();
			System.out.println("Please enter Donalds's combination #2");
			numM2=input.nextInt();
			System.out.println("Please enter Donald's combination #3");
			numM3=input.nextInt();
			donaldLock.openLock(numM1,numM2,numM3);
			System.out.println("Would you like to try again?"
					+ " \nIf so please please press 1, if locker is open press 0");
			p=input.nextInt();
			}
		
		while(p!=0){
			System.out.println("Please enter locker # for Donald");
			lNum=input.nextInt();
			donaldLocker.openLocker(lNum,donaldLock);
			System.out.println("Would you like to try again?"
					+ " \nIf so please please 1 to try again, if locker is open press 0 ");
			i=input.nextInt();
			}
			System.out.print("How many books would you like to place in Donald's locker?");
			count=input.nextInt();
			for(int b=0;b<count;b++){
			donaldLocker.putBookInLocker();
		}
			System.out.print("How many books would you like to remove from Donald's locker?");
			count=input.nextInt();
			for(int b=0;b<count;b++){
			donaldLocker.removeBookFromLocker();
			}
			mickeyLocker.displayLocker();
			donaldLocker.displayLocker();
			input.close();	
	}
	
}