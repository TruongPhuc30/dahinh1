/**
 * Abstract class Shape đại diện cho một hình học chung với thuộc tính màu sắc và trạng thái filled.
 * Các lớp con phải kế thừa và có thể ghi đè các phương thức tính diện tích và chu vi.
 */
public abstract class Shape {
    /**
     * Màu của hình.
     */
    protected String color;

    /**
     * Trạng thái cho biết hình có được tô màu (filled) hay không.
     */
    protected boolean filled;

    /**
     * Constructor mặc định tạo Shape với giá trị mặc định.
     */
    public Shape() {}

    /**
     * Constructor tạo Shape với màu sắc và trạng thái filled.
     *
     * @param color  màu của hình
     * @param filled true nếu hình được tô màu, false nếu không
     */
    public Shape(String color, boolean filled) {
        // Nên gán giá trị cho color và filled ở đây
        this.color = color;
        this.filled = filled;
    }

    /**
     * Lấy màu của hình.
     *
     * @return màu của hình
     */
    public String getColor() {
        return color;
    }

    /**
     * Thiết lập màu của hình.
     *
     * @param color màu mới của hình
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Kiểm tra xem hình có được tô màu hay không.
     *
     * @return true nếu hình được tô màu, false nếu không
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Thiết lập trạng thái filled của hình.
     *
     * @param filled true để tô màu, false để không tô
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Tính diện tích của hình.
     * Lớp Shape mặc định trả về 0, các lớp con nên ghi đè phương thức này.
     *
     * @return diện tích của hình
     */
    public double getArea() {
        return 0;
    }

    /**
     * Tính chu vi của hình.
     * Lớp Shape mặc định trả về 0, các lớp con nên ghi đè phương thức này.
     *
     * @return chu vi của hình
     */
    public double getPerimeter() {
        return 0;
    }

    /**
     * Trả về chuỗi mô tả hình, bao gồm màu sắc và trạng thái filled.
     *
     * @return chuỗi mô tả hình
     */
    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
