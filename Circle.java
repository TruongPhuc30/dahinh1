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
        return  3.14 * radius * radius;
    }

    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }
}
