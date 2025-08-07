import java.util.Objects;

/**
 * Lớp {@code Point} đại diện cho một điểm trong không gian 2D với tọa độ X và Y.
 */
public class Point {
    /** Tọa độ X của điểm */
    private double pointX;

    /** Tọa độ Y của điểm */
    private double pointY;

    /**
     * Khởi tạo một điểm với tọa độ X và Y.
     *
     * @param pointX tọa độ X
     * @param pointY tọa độ Y
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Trả về tọa độ X của điểm.
     *
     * @return giá trị X
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * Thiết lập tọa độ X mới cho điểm.
     *
     * @param pointX giá trị X mới
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Trả về tọa độ Y của điểm.
     *
     * @return giá trị Y
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * Thiết lập tọa độ Y mới cho điểm.
     *
     * @param pointY giá trị Y mới
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Tính khoảng cách từ điểm hiện tại đến một điểm khác.
     *
     * @param newPoint điểm cần tính khoảng cách đến
     * @return khoảng cách Euclid giữa hai điểm
     */
    public double distance(Point newPoint) {
        double dx = this.pointX - newPoint.pointX;
        double dy = this.pointY - newPoint.pointY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * So sánh hai điểm có bằng nhau không (theo tọa độ).
     *
     * @param o đối tượng cần so sánh
     * @return {@code true} nếu bằng nhau, ngược lại {@code false}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Double.compare(pointX, point.pointX) == 0 &&
               Double.compare(pointY, point.pointY) == 0;
    }

    /**
     * Tạo mã băm cho điểm.
     *
     * @return mã băm
     */
    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * Trả về chuỗi mô tả điểm.
     *
     * @return chuỗi dạng "Point(x, y)"
     */
    @Override
    public String toString() {
        return "Point(" + pointX + "," + pointY + ")";
    }
}
