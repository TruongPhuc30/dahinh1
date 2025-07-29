/**
 * Lớp Square đại diện cho hình vuông, kế thừa từ Rectangle.
 * Chiều rộng và chiều dài của hình vuông luôn bằng nhau.
 */
public class Square extends Rectangle {

    /**
     * Constructor mặc định.
     * Cạnh của hình vuông = 1.0.
     */
    public Square() {
        super(1.0, 1.0);
    }

    /**
     * Constructor khởi tạo Square với cạnh tùy chọn.
     *
     * @param side độ dài cạnh hình vuông
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor khởi tạo Square với cạnh, màu sắc và trạng thái filled tùy chọn.
     *
     * @param side   độ dài cạnh hình vuông
     * @param color  màu sắc của hình vuông
     * @param filled trạng thái filled (true nếu tô màu, false nếu không)
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Lấy độ dài cạnh của hình vuông.
     *
     * @return độ dài cạnh
     */
    public double getSide() {
        return width;
    }

    /**
     * Thiết lập độ dài cạnh của hình vuông.
     * Chiều rộng và chiều dài được cập nhật để luôn bằng nhau.
     *
     * @param side độ dài cạnh mới
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Ghi đè phương thức setWidth để đảm bảo width và length luôn bằng nhau.
     *
     * @param side độ dài cạnh mới
     */
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    /**
     * Ghi đè phương thức setLength để đảm bảo width và length luôn bằng nhau.
     *
     * @param side độ dài cạnh mới
     */
    @Override
    public void setLength(double side) {
        setSide(side);
    }

    /**
     * Trả về chuỗi mô tả hình vuông, bao gồm cạnh, màu sắc và trạng thái filled.
     *
     * @return chuỗi mô tả hình vuông
     */
    @Override
    public String toString() {
        return "Square[side=" + width + ",color=" + color + ",filled=" + filled + "]";
    }
}
