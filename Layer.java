import java.util.ArrayList;

/**
 * Lớp {@code Layer} đại diện cho một lớp chứa các hình học.
 * Cho phép thêm, xóa và lọc các hình trong danh sách.
 */
public class Layer {
    /** Danh sách các hình trong lớp */
    private ArrayList<Shape> shapes = new ArrayList<>();

    /**
     * Thêm một hình vào lớp.
     *
     * @param shape hình cần thêm
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Xóa tất cả các hình tròn khỏi lớp.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Loại bỏ các hình trùng lặp khỏi lớp (dựa trên equals).
     */
    public void removeDuplicates() {
        ArrayList<Shape> uniqueShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            if (!uniqueShapes.contains(shape)) {
                uniqueShapes.add(shape);
            }
        }
        shapes = uniqueShapes;
    }

    /**
     * Trả về thông tin mô tả tất cả các hình trong lớp.
     *
     * @return chuỗi mô tả danh sách hình
     */
    public String getInfo() {
        StringBuilder sb = new StringBuilder("Layer contains:\n");
        for (Shape shape : shapes) {
            sb.append(shape.toString()).append("\n");
        }
        return sb.toString();
    }
}
