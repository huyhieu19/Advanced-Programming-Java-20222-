package Assignment1;

import java.util.Random;

//Sử dụng lớp java.util.Random để viết chương trình 
//tạo một đối tượng Random với seed 1000 và hiển thị 50 số 
//nguyên ngẫu nhiên đầu tiên từ 0 đến 100 bằng phương 
//thức nextInt (100).
public class Bai5 {
	public static void main(String[] args) {
		Random random = new Random(1000);
		for(int i=0; i<50; i++) {
			int randomNumber = random.nextInt(100);
			System.out.println(randomNumber);
		}
	}
}
