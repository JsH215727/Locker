
public class Locker{
	int books, lockerNum;
	CombinationalLock CLock=new CombinationalLock();
	
	
	public Locker(){
		this.books=0;
		this.CLock= new CombinationalLock(0,0,0);
		this.lockerNum=0;
	}
	public Locker(int lockerNum, CombinationalLock school, int books){
		this.lockerNum=lockerNum;
		this.CLock=school;
		this.books=books;
	}
	public void putBookInLocker(){
		books++;
	}
	public void removeBookFromLocker(){
		if (books>0){
			books--;
		}
		else books=0;
	}
	public void openLocker(int lockerNum, CombinationalLock CLock){
		if (this.CLock==CLock&&this.lockerNum==lockerNum){
		System.out.println("Access granted");
		}
		else System.out.println("Try Again ");
	}
	
	public void displayLocker(){
		System.out.print("\nThe number of books present are\n"+books);
	}
}