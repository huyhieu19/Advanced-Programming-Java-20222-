package Week2;
// Bài 1: Xây dựng lớp Point2D để biểu diễn một điểm trong
//	hệ tọa độ hai chiều. Thực hiện các phương thức trong biểu
//	đồ lớp dưới đây. Viết chương trình sử dụng lớp Point2D
public class Point2D {
	double x;
	double y;
	public Point2D(double _x, double _y) {
		this.x = _x;
		this.y = _y;
	}
	public double distance(double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2));
	}
	public double distance(Point2D p) {
		return Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.x - y), 2));
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
}
