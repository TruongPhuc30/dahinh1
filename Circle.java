/**
 * Lớp Circle đại diện cho hình tròn với bán kính và màu sắc.
 */
public class Circle extends Shape {

    /**
     * Bán kính của hình tròn.
     */
    protected double radius; // bán kính

    /**
     * Constructor mặc định. Bán kính = 1.0 và màu = "red".
     */
    public Circle() {
        super();
        this.radius = 1.0;
    }

    /**
     * Constructor khởi tạo Circle với bán kính tùy chọn, màu mặc định là "red".
     *
     * @param radius bán kính hình tròn
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Constructor khởi tạo Circle với bán kính và màu tùy chọn.
     *
     * @param radius bán kính
     * @param color  màu sắc
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

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
        return  Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }
    
     /**
     * So sánh hai đối tượng Circle có bằng nhau không.
     *
     * @param o đối tượng cần so sánh
     * @return true nếu bằng nhau, false nếu không
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle other = (Circle) o;
        return Double.compare(radius, other.radius) == 0 &&
                Objects.equals(color, other.color) &&
                filled == other.filled;
    }

    /**
     * Tạo mã băm cho đối tượng Circle.
     *
     * @return mã băm
     */
    @Override
    public int hashCode() {
        return Objects.hash(radius, color, filled);
    }
}
