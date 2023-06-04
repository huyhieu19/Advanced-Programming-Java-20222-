1. Viết chương trình đếm số ký tự, số từ, số dòng của một tệp văn bản .txt nào đó (sinh viên tự tạo tệp và nội dung của tệp). Các từ được ngăn cách nhau bởi ký tự dấu cách.

2. Viết chương trình tạo tệp văn bản có tên Ass5_Ex2.txt nếu tệp đó chưa tồn tại. Ghi tiếp dữ liệu mới vào tệp nếu nó đã tồn tại. Ghi 150 số nguyên được tạo ngẫu nhiên vào tệp. Các số nguyên được phân tách bằng dấu cách.

3. Viết chương trình tạo tệp nhị phân có tên Ass5_Ex3.dat nếu nó không tồn tại. Ghi tiếp dữ liệu mới vào nó nếu nó đã tồn tại. Ghi 150 số nguyên được tạo ngẫu nhiên vào tệp bằng Binary I/O (hay còn gọi là vào ra dạng Byte).

4. Tạo một tệp dữ liệu nhị phân có tên là Ass5_Ex4.dat. Ghi vào tệp 100 số double bằng cách sử dụng phương thức writeDouble (double) trong DataOutputStream. Hiển thị ra màn hình giá trị trung bình của các số trong tệp.

5. Viết chương trình lưu một mảng gồm năm giá trị int 1, 2, 3, 4 và 5, một đối tượng Date cho thời điểm hiện tại và giá trị double 5.5 vào tệp có tên là Ex5.dat.

6. Giả sử một tệp văn bản chứa các điểm của một học sinh, được phân tách bởi dấu cách. Viết chương trình nhắc người dùng nhập tên tệp cần xử lý. Nếu tệp không tồn tại thì dừng chương trình. Hãy đọc điểm từ tệp và hiển thị tổng số điểm, điểm trung bình của học sinh đó.

7. Tạo một tệp dữ liệu có 1.000 dòng. Mỗi dòng trong tệp bao gồm first name (tên), last name (họ), rank (chức vụ), và salary (tiền lương) của một thành viên trong khoa. Họ và tên của thành viên trong khoa tại dòng thứ i là FirstNamei và LastNamei. Chức vụ được giao ngẫu nhiên từ 3 chức vụ sau: assistant (trợ giảng), teacher (giảng viên), associate (phó giáo sư).

Tiền lương được tạo ngẫu nhiên dưới dạng một số double. Tiền lương cho một assistant nên nằm trong khoảng 50000 đến 80000, teacher từ 60000 đến 110000 và cho associate từ 75000 đến 130000. Các dữ liệu trên được lưu trong tệp Salary.txt như tệp mẫu đính kèm.

Viết chương trình tính hiển thị tổng lương dành cho từng chức vụ trong khoa, với thông tin về lương của các thành viên được lưu trong tệp Salary.txt ở bài 7