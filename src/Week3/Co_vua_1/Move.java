/**
 * Lớp đại diện cho một nước đi trong trò chơi cờ vua.
 * Lớp này lưu trữ thông tin về vị trí bắt đầu, vị trí kết thúc,
 * quân cờ di chuyển và quân cờ bị ăn.
 */
public class Move {
    private int startX;  // Tọa độ X của vị trí bắt đầu
    private int startY;  // Tọa độ Y của vị trí bắt đầu
    private int endX;    // Tọa độ X của vị trí kết thúc
    private int endY;    // Tọa độ Y của vị trí kết thúc
    private Piece movedPiece;  // Quân cờ di chuyển
    private Piece killedPiece; // Quân cờ bị ăn (nếu có)

    /**
     * Constructor khởi tạo một nước đi với quân cờ di chuyển và không có quân bị ăn.
     *
     * @param startX     tọa độ X của vị trí bắt đầu.
     * @param startY     tọa độ Y của vị trí bắt đầu.
     * @param endX       tọa độ X của vị trí kết thúc.
     * @param endY       tọa độ Y của vị trí kết thúc.
     * @param movedPiece quân cờ di chuyển.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = null;  // Không có quân cờ bị ăn trong trường hợp này
    }

    /**
     * Constructor khởi tạo một nước đi với quân cờ di chuyển và quân bị ăn.
     *
     * @param startX      tọa độ X của vị trí bắt đầu.
     * @param startY      tọa độ Y của vị trí bắt đầu.
     * @param endX        tọa độ X của vị trí kết thúc.
     * @param endY        tọa độ Y của vị trí kết thúc.
     * @param movedPiece  quân cờ di chuyển.
     * @param killedPiece quân cờ bị ăn (nếu có).
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * Lấy tọa độ X của vị trí bắt đầu.
     *
     * @return tọa độ X của vị trí bắt đầu.
     */
    public int getStartX() {
        return startX;
    }

    /**
     * Thiết lập tọa độ X của vị trí bắt đầu.
     *
     * @param startX tọa độ X mới của vị trí bắt đầu.
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * Lấy tọa độ Y của vị trí bắt đầu.
     *
     * @return tọa độ Y của vị trí bắt đầu.
     */
    public int getStartY() {
        return startY;
    }

    /**
     * Thiết lập tọa độ Y của vị trí bắt đầu.
     *
     * @param startY tọa độ Y mới của vị trí bắt đầu.
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * Lấy tọa độ X của vị trí kết thúc.
     *
     * @return tọa độ X của vị trí kết thúc.
     */
    public int getEndX() {
        return endX;
    }

    /**
     * Thiết lập tọa độ X của vị trí kết thúc.
     *
     * @param endX tọa độ X mới của vị trí kết thúc.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * Lấy tọa độ Y của vị trí kết thúc.
     *
     * @return tọa độ Y của vị trí kết thúc.
     */
    public int getEndY() {
        return endY;
    }

    /**
     * Thiết lập tọa độ Y của vị trí kết thúc.
     *
     * @param endY tọa độ Y mới của vị trí kết thúc.
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * Lấy quân cờ di chuyển trong nước đi này.
     *
     * @return quân cờ di chuyển.
     */
    public Piece getMovedPiece() {
        return movedPiece;
    }

    /**
     * Thiết lập quân cờ di chuyển cho nước đi này.
     *
     * @param movedPiece quân cờ di chuyển.
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * Lấy quân cờ bị ăn (nếu có) trong nước đi này.
     *
     * @return quân cờ bị ăn.
     */
    public Piece getKilledPiece() {
        return killedPiece;
    }

    /**
     * Thiết lập quân cờ bị ăn cho nước đi này.
     *
     * @param killedPiece quân cờ bị ăn.
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    /**
     * Chuyển thông tin nước đi thành chuỗi string theo định dạng dễ đọc.
     *
     * @return chuỗi đại diện cho nước đi này, ví dụ "white-Ka1".
     */
    public String toString() {
        return movedPiece.getColor()
                + "-"
                + movedPiece.getSymbol()
                + (char) ('a' + endX - 1)
                + endY;
    }
}
