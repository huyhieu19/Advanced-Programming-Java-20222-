package Assignment2;
import java.util.*;

public class ATM_System {
	
	private static Account[] Accounts;
	private static int CountAccounts = 10;
	private static int DefaultValue = 1000000;
    
    private static double EnterAmount() {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        return amount;
    }

	
    // Search Account in Accounts
    private static int FindAccount(int id) {
        for (int i = 0; i < CountAccounts; i++) {
            if (Accounts[i].getId() == id) {
                return i;
            }
        }
        return -1; // Not Found
    }
	
	public static void main(String[] args) {
		// Create Array Account
		Accounts = new Account[CountAccounts];
        for (int i = 0; i < CountAccounts; i++) {
        	Accounts[i] = new Account(i, DefaultValue);
        }
        
        while (true) {
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Nhập ID tài khoản: ");
            int id = scanner.nextInt();
            int index = FindAccount(id);
            if (index == -1) {
                System.out.println("ID không chính xác, vui lòng nhập lại.");
                continue;
            }
            int myChoose = 0;
            while(!(myChoose == 4)){
	            
	            System.out.println("-------------- MENU --------------");
	            System.out.println("1. Xem số dư hiện tại");
	            System.out.println("2. Rút tiền");
	            System.out.println("3. Gửi tiền");
	            System.out.println("4. Thoát");
	            System.out.println("----------------------------------");
	            System.out.print("Nhập lựa chọn của bạn: ");
	            myChoose = scanner.nextInt();
	            switch (myChoose) {
	            case 1:
	                System.out.println("Số dư hiện tại: " + Accounts[index].getBalance());
	                break;
	            case 2:
	                System.out.print("Nhập số tiền cần rút: ");
	                double amount = scanner.nextDouble();
	                if(Accounts[index].getBalance() - amount < 0) {
	                	System.out.println("Số dư không đủ để rút tiền.");
	                }
	                else{
	                	Accounts[index].withdraw(amount);
	                    System.out.println("Rút tiền thành công.");
	                }
	                break;
	            case 3:
	                System.out.print("Nhập số tiền cần gửi: ");
	                double amountsend = EnterAmount();
	                Accounts[index].deposit(amountsend);
	                break;
	            case 4:
	            	break;
	            }
            }
        }
	}
}
