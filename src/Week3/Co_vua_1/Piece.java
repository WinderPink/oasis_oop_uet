/**
 * Lớp trừu tượng đại diện cho một quân cờ trong cờ vua.
 * Các quân cờ sẽ kế thừa lớp này và triển khai các phương thức di chuyển.
 */
public abstract class Piece {
    private int coordinatesX; // Tọa độ X của quân cờ
    private int coordinatesY; // Tọa độ Y của quân cờ
    private String color; // Màu của quân cờ (black hoặc white)


    public static boolean checkValidCoordinates(int x, int y) {
        return (x >= 1 && y >= 1 && x <= 8 && y <= 8);
    }

    /**
     * Kiểm tra màu hợp lệ cho quân cờ.
     *
     * @param color màu của quân cờ (black hoặc white).
     * @return true nếu màu hợp lệ, false nếu không hợp lệ.
     */
    public static boolean checkValidColor(String color) {
        return (color.equals("black") || color.equals("white"));
    }

    /**
     * Constructor khởi tạo quân cờ với tọa độ và màu mặc định là white.
     *
     * @param coordinatesX tọa độ X của quân cờ.
     * @param coordinatesY tọa độ Y của quân cờ.
     */
    public Piece(int coordinatesX, int coordinatesY) {
        // Kiểm tra tọa độ hợp lệ trước khi gán
        if (checkValidCoordinates(coordinatesX, coordinatesY)) {
            this.coordinatesX = coordinatesX;
            this.coordinatesY = coordinatesY;
        }
        this.color = "white"; // Màu mặc định là white
    }

    /**
     * Constructor khởi tạo quân cờ với tọa độ và màu tùy chọn.
     *
     * @param coordinatesX tọa độ X của quân cờ.
     * @param coordinatesY tọa độ Y của quân cờ.
     * @param color        màu của quân cờ.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        // Kiểm tra tọa độ hợp lệ
        if (checkValidCoordinates(coordinatesX, coordinatesY)) {
            this.coordinatesX = coordinatesX;
            this.coordinatesY = coordinatesY;
        }
        // Kiểm tra màu hợp lệ và gán màu cho quân cờ
        if (checkValidColor(color)) {
            this.color = color;
        } else {
            this.color = "white"; // Nếu màu không hợp lệ, mặc định là white
        }
    }

    /**
     * Lấy tọa độ X của quân cờ.
     *
     * @return tọa độ X của quân cờ.
     */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    /**
     * Thiết lập tọa độ X cho quân cờ.
     *
     * @param coordinatesX tọa độ X mới.
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * Lấy tọa độ Y của quân cờ.
     *
     * @return tọa độ Y của quân cờ.
     */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * Thiết lập tọa độ Y cho quân cờ.
     *
     * @param coordinatesY tọa độ Y mới.
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * Lấy màu của quân cờ.
     *
     * @return màu của quân cờ.
     */
    public String getColor() {
        return color;
    }

    /**
     * Thiết lập màu cho quân cờ.
     *
     * @param color màu mới cho quân cờ.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Phương thức trừu tượng kiểm tra xem quân cờ có thể di chuyển đến vị trí mới không.
     * Các lớp kế thừa sẽ phải triển khai phương thức này.
     *
     * @param board        bàn cờ hiện tại.
     * @param coordinatesX tọa độ X đích.
     * @param coordinatesY tọa độ Y đích.
     * @return true nếu quân cờ có thể di chuyển đến vị trí mới, false nếu không thể.
     */
    public abstract boolean canMove(Board board, int coordinatesX, int coordinatesY);

    /**
     * Phương thức trừu tượng lấy ký hiệu của quân cờ (VD: "K" cho vua, "Q" cho hậu,...).
     * Các lớp kế thừa sẽ phải triển khai phương thức này.
     *
     * @return ký hiệu của quân cờ.
     */
    public abstract String getSymbol();
}
