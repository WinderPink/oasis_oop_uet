import java.util.ArrayList;

/**
 * Lớp đại diện cho bàn cờ vua, bao gồm các quân cờ và các thao tác quản lý quân cờ trên bàn.
 */
public class Board {
    private ArrayList<Piece> pieces;  // Danh sách các quân cờ trên bàn
    public static final int WIDTH = 8; // Chiều rộng của bàn cờ (8 cột)
    public static final int HEIGHT = 8; // Chiều cao của bàn cờ (8 hàng)

    /**
     * Constructor khởi tạo bàn cờ với một danh sách rỗng các quân cờ.
     */
    public Board() {
        pieces = new ArrayList<Piece>();
    }

    /**
     * Kiểm tra tính hợp lệ của tọa độ trên bàn cờ.
     *
     * @param x tọa độ X cần kiểm tra.
     * @param y tọa độ Y cần kiểm tra.
     * @return true nếu tọa độ hợp lệ, false nếu không hợp lệ (vượt quá phạm vi bàn cờ).
     */
    public boolean validate(int x, int y) {
        return (x >= 1 && y >= 1 && x <= 8 && y <= 8);
    }

    /**
     * Thêm quân cờ vào bàn cờ.
     *
     * @param piece quân cờ cần thêm vào bàn.
     */
    public void addPiece(Piece piece) {
        // Kiểm tra nếu quân cờ có tọa độ hợp lệ và vị trí đó chưa có quân cờ nào.
        if (getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            pieces.add(piece);
        }
    }

    /**
     * Lấy quân cờ tại một tọa độ cụ thể trên bàn cờ.
     *
     * @param x tọa độ X của vị trí cần lấy quân cờ.
     * @param y tọa độ Y của vị trí cần lấy quân cờ.
     * @return quân cờ tại tọa độ (x, y), hoặc null nếu không có quân cờ tại đó.
     */
    public Piece getAt(int x, int y) {
        if (Piece.checkValidCoordinates(x, y)) {
            for (Piece p : pieces) {
                if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                    return p;
                }
            }
        }
        return null;
    }

    /**
     * Xóa quân cờ tại một tọa độ trên bàn cờ.
     *
     * @param x tọa độ X của vị trí cần xóa quân cờ.
     * @param y tọa độ Y của vị trí cần xóa quân cờ.
     */
    public void removeAt(int x, int y) {
        if (Piece.checkValidCoordinates(x, y)) {
            pieces.remove(getAt(x, y));
        }
    }

    /**
     * Lấy danh sách tất cả các quân cờ trên bàn.
     *
     * @return danh sách các quân cờ trên bàn cờ.
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * Thiết lập danh sách quân cờ trên bàn cờ.
     *
     * @param pieces danh sách quân cờ mới.
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
