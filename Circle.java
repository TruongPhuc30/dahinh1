/**
 * Lớp Circle đại diện cho hình tròn, kế thừa từ Shape.
 * Chứa thông tin về bán kính, màu sắc và trạng thái filled.
 */
public class Circle extends Shape {

    /**
     * Bán kính của hình tròn.
     */
    private double radius;

    /**
     * Constructor mặc định.
     * Bán kính = 1.0, màu và trạng thái filled mặc định từ lớp Shape.
     */
    public Circle() {
        super();
        this.radius = 1.0;
    }

    /**
     * Constructor khởi tạo Circle với bán kính tùy chọn.
     *
     * @param radius bán kính hình tròn
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Constructor khởi tạo Circle với bán kính, màu sắc và trạng thái filled tùy chọn.
     *
     * @param radius bán kính hình tròn
     * @param color  màu sắc của hình tròn
     * @param filled trạng thái filled (true nếu tô màu, false nếu không)
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Lấy bán kính của hình tròn.
     *
     * @return bán kính hình tròn
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Thiết lập bán kính mới cho hình tròn.
     *
     * @param radius bán kính mới
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Tính diện tích hình tròn.
     *
     * @return diện tích = PI * r^2
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Tính chu vi hình tròn.
     *
     * @return chu vi = 2 * PI * r
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Trả về chuỗi mô tả hình tròn, bao gồm bán kính, màu sắc và trạng thái filled.
     *
     * @return chuỗi mô tả hình tròn
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }
}
