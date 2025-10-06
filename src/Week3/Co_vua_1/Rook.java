/**
 * Lớp đại diện cho quân xe trong cờ vua.
 * Quân xe có thể di chuyển theo chiều ngang hoặc chiều dọc, và có thể ăn quân đối phương.
 */
public class Rook extends Piece {

    /**
     * Constructor khởi tạo quân xe với tọa độ.
     *
     * @param coordinatesX tọa độ X của quân xe.
     * @param coordinatesY tọa độ Y của quân xe.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructor khởi tạo quân xe với tọa độ và màu.
     *
     * @param coordinatesX tọa độ X của quân xe.
     * @param coordinatesY tọa độ Y của quân xe.
     * @param color        màu của quân xe (black hoặc white).
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * Lấy ký hiệu của quân xe.
     *
     * @return ký hiệu của quân xe, trong trường hợp này là "R".
     */
    @Override
    public String getSymbol() {
        return ("R");
    }

    /**
     * Kiểm tra xem quân xe có thể di chuyển đến vị trí (x, y) trên bàn cờ không.
     *
     * @param board bàn cờ hiện tại.
     * @param x     tọa độ X của vị trí đích.
     * @param y     tọa độ Y của vị trí đích.
     * @return true nếu quân xe có thể di chuyển đến vị trí (x, y), false nếu không thể.
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }

        if (x != getCoordinatesX() && y != getCoordinatesY()) {
            return false;
        }

        if (x == getCoordinatesX()) {
            int minY = Math.min(getCoordinatesY(), y);
            int maxY = Math.max(getCoordinatesY(), y);
            for (int i = minY + 1; i < maxY; i++) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        } else {
            int minX = Math.min(getCoordinatesX(), x);
            int maxX = Math.max(getCoordinatesX(), x);
            for (int i = minX + 1; i < maxX; i++) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        }

        Piece destPiece = board.getAt(x, y);
        return destPiece == null || !destPiece.getColor().equals(getColor());
    }
}
