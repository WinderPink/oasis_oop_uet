import java.util.ArrayList;

/**
 * Lớp đại diện cho trò chơi cờ vua.
 * Lớp này quản lý bàn cờ, lịch sử các nước đi, và các thao tác di chuyển quân cờ.
 */
public class Game {
    private Board board;  // Bàn cờ hiện tại của trò chơi
    private ArrayList<Move> moveHistory;  // Lịch sử các nước đi trong trò chơi

    /**
     * Constructor khởi tạo trò chơi với một bàn cờ.
     *
     * @param board bàn cờ ban đầu.
     */
    public Game(Board board) {
        this.board = board;
        this.moveHistory = new ArrayList<Move>();  // Khởi tạo lịch sử các nước đi rỗng
    }

    /**
     * Lấy bàn cờ hiện tại của trò chơi.
     *
     * @return bàn cờ hiện tại.
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Thiết lập bàn cờ cho trò chơi.
     *
     * @param board bàn cờ mới.
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Lấy lịch sử các nước đi của trò chơi.
     *
     * @return lịch sử các nước đi.
     */
    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    /**
     * Thiết lập lịch sử các nước đi cho trò chơi.
     *
     * @param moveHistory lịch sử các nước đi mới.
     */
    public void setMoveHistory(ArrayList<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }

    /**
     * Di chuyển một quân cờ đến vị trí mới trên bàn cờ.
     * Nếu có quân cờ bị ăn, quân đó sẽ bị xóa khỏi bàn cờ.
     * Lịch sử nước đi sẽ được cập nhật.
     *
     * @param piece quân cờ cần di chuyển.
     * @param x     tọa độ X của vị trí đích.
     * @param y     tọa độ Y của vị trí đích.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Move move;
            Piece pieceAt = board.getAt(x, y);
            if (pieceAt != null) {
                move = new Move(
                        piece.getCoordinatesX(),
                        x,
                        piece.getCoordinatesY(),
                        y,
                        piece,
                        pieceAt);
                board.removeAt(x, y);
            } else {
                move = new Move(
                        piece.getCoordinatesX(),
                        x,
                        piece.getCoordinatesY(),
                        y,
                        piece);
            }
            moveHistory.add(move);
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }
}
