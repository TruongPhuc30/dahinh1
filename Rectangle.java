/**
 * Lớp Rectangle đại diện cho hình chữ nhật, kế thừa từ Shape.
 * Chứa thông tin về chiều rộng, chiều dài, màu sắc và trạng thái filled.
 */
public class Rectangle extends Shape {
    /**
     * Chiều rộng của hình chữ nhật.
     */
    protected double width;

    /**
     * Chiều dài của hình chữ nhật.
     */
    protected double length;

    /**
     * Constructor mặc định.
     * Chiều rộng và chiều dài = 1.0.
     */
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     * Constructor khởi tạo Rectangle với chiều rộng và chiều dài tùy chọn.
     *
     * @param width  chiều rộng
     * @param length chiều dài
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor khởi tạo Rectangle với chiều rộng, chiều dài, màu sắc 
       và trạng thái filled tùy chọn.
     *
     * @param width  chiều rộng
     * @param length chiều dài
     * @param color  màu sắc của hình chữ nhật
     * @param filled trạng thái filled (true nếu tô màu, false nếu không)
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Lấy chiều rộng của hình chữ nhật.
     *
     * @return chiều rộng
     */
    public double getWidth() {
        return width;
    }

    /**
     * Thiết lập chiều rộng mới cho hình chữ nhật.
     *
     * @param width chiều rộng mới
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Lấy chiều dài của hình chữ nhật.
     *
     * @return chiều dài
     */
    public double getLength() {
        return length;
    }

    /**
     * Thiết lập chiều dài mới cho hình chữ nhật.
     *
     * @param length chiều dài mới
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Tính diện tích hình chữ nhật.
     *
     * @return diện tích = width * length
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Tính chu vi hình chữ nhật.
     *
     * @return chu vi = 2 * (width + length)
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Trả về chuỗi mô tả hình chữ nhật, bao gồm chiều rộng, chiều dài, màu sắc 
       và trạng thái filled.
     *
     * @return chuỗi mô tả hình chữ nhật
     */
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + ",color=" + color 
                + ",filled=" + filled + "]";
    }
}
