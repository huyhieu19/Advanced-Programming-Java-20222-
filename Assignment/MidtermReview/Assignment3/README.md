1. Thiết kế một lớp có tên Fan để đại diện cho một chiếc quạt. Lớp chứa:

- Ba hằng số SLOW, MEDIUM và FAST với các giá trị 1, 2 và 3 để biểu thị tốc độ quạt.

- Trường dữ liệu speed (private, int) chứa tốc độ của quạt (mặc định là SLOW).

- Trường dữ liệu on (private, boolean) chỉ định quạt có bật hay không (giá trị mặc định là false).

- Trường dữ liệu radius (private, double) chứa bán kính của quạt (mặc định là 5).

- Trường dữ liệu color (string) chứa màu của quạt (mặc định là màu xanh lam).

- Các phương thức get, set cho cả bốn trường dữ liệu.

- Phương thức khởi tạo không đối số tạo ra một quạt với các giá trị mặc định.

- Phương thức có tên toString () trả về một chuỗi ký tự mô tả quạt. Nếu quạt đang bật, phương thức trả về tốc độ, màu sắc và bán kính của quạt trong một chuỗi kết hợp. Nếu quạt không được bật, phương thức trả về màu và bán kính của quạt cùng với chuỗi “quạt tắt” trong một chuỗi kết hợp.

Vẽ biểu đồ UML cho lớp sau đó triển khai lớp. Viết chương trình thử nghiệm tạo hai đối tượng Fan. Gán tốc độ tối đa, bán kính 10, màu vàng và được bật cho đối tượng đầu tiên. Gán tốc độ trung bình, bán kính 5, màu xanh lam và bị tắt cho đối tượng thứ hai. Hiển thị các đối tượng bằng cách gọi phương thức toString. (9.8)

2. Thiết kế một lớp có tên MyInteger. Lớp chứa:

- Trường dữ liệu value (int) lưu trữ giá trị một số nguyên

- Phương thức khởi tạo có đối.

- Phương thức getValue() trả về giá trị.

- Các phương thức isEven (), isOdd () và isPrime () trả về true nếu giá trị trong đối tượng này tương ứng là chẵn, lẻ hoặc nguyên tố.

- Các phương thức tĩnh isEven (int), isOdd (int) và isPrime (int) trả về true nếu giá trị được được truyền vào hàm tương ứng là chẵn, lẻ hoặc nguyên tố.

- Các phương thức tĩnh isEven (MyInteger), isOdd (MyInteger) và isPrime (MyInteger) trả về true nếu đối tượng được truyền vào hàm tương ứng là chẵn, lẻ hoặc nguyên tố.

- Các phương equals (int) và equals (MyInteger) trả về true nếu giá trị trong đối tượng này bằng giá trị được truyền vào hàm.

- Phương thức tĩnh parseInt (char []) chuyển đổi một mảng các ký tự số thành giá trị int.

- Phương thức tĩnh parseInt (String) chuyển đổi một chuỗi thành giá trị int.

Vẽ biểu đồ UML cho lớp sau đó triển khai lớp. Viết một chương trình khách kiểm tra tất cả các phương thức trong lớp. (10.3) 