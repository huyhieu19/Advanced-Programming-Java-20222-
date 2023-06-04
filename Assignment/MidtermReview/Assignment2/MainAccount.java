package MidtermReview.Assignment2;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for(int i=0; i<10; i++){
            accounts[i] = new Account(i, 100);
        }
        while(true){
            System.out.println("Nhap id: ");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            if(id < 0 || id > 9){
                System.out.println("vui long nhap dung Id");
                continue;
            }
            System.out.println("------------Menu-----------");
            System.out.println("Nhap 1: Xem so du hien tai.");
            System.out.println("Nhap 2: Rut tien.");
            System.out.println("Nhap 3: Gui tien.");
            System.out.println("Nhap 4: Thoat.");
            int chooseDirection = sc.nextInt();
            if(chooseDirection == 1){
                System.out.println("So du: " +accounts[id].balance);
            }
            if(chooseDirection == 2){
                System.out.println("Nhap so tien muon rut");
                double amount = sc.nextDouble();
                if(amount > accounts[id].balance){
                    System.out.println("So du khong du");
                    System.out.println("So du: " +accounts[id].balance);
                }else{
                    System.out.println("So du moi" + (accounts[id].balance = accounts[id].balance - amount));
                }
            }
            if(chooseDirection == 3){
                System.out.println("Nhap so tien muon gui");
                double amount = sc.nextDouble();
                System.out.println("So du moi" + (accounts[id].balance = accounts[id].balance + amount));
            }
            if(chooseDirection == 4){
                continue;
            }

        }
    }
}
