import java.util.List;

public class QuickSort {
    /**
     * Phương thức sắp xếp mặc định sử dụng phần tử cuối cùng làm pivot.
     *
     * @param arr Danh sách (List) cần sắp xếp
     * @param low Chỉ số bắt đầu của danh sách cần sắp xếp
     * @param high Chỉ số kết thúc của danh sách cần sắp xếp
     */
    public static <T extends Comparable<T>> void sort(List<T> arr, int low, int high) {
        if (low < high) {
            // Tìm chỉ số của pivot và chia danh sách thành hai phần
            int pivotIndex = partition(arr, low, high);

            // Tiến hành đệ quy để sắp xếp nửa trên và nửa dưới
            sort(arr, pivotIndex + 1, high); // Sắp xếp nửa trên
            sort(arr, low, pivotIndex - 1); // Sắp xếp nửa dưới
        }
    }

    /**
     * Phương thức phân vùng (partition) sử dụng phần tử cuối cùng làm pivot.
     *
     * @param arr Danh sách (List) cần phân vùng
     * @param low Chỉ số bắt đầu
     * @param high Chỉ số kết thúc
     * @return Chỉ số của pivot trong danh sách
     */
    private static <T extends Comparable<T>> int partition(List<T> arr, int low, int high) {
        int pivotIndex = low; // Chỉ số tạm thời của pivot
        T pivotVal = arr.get(high); // Phần tử cuối cùng được chọn làm pivot
        for (int i = low; i < high; i++) {
            // Nếu phần tử hiện tại nhỏ hơn pivot, hoán đổi với phần tử ở vị trí pivotIndex
            if (arr.get(i).compareTo(pivotVal) < 0) {
                swap(arr, i, pivotIndex); // Hoán đổi các phần tử
                pivotIndex++; // Di chuyển pivotIndex sang bên phải
            }
        }
        // Đặt pivot vào đúng vị trí của nó trong danh sách
        swap(arr, high, pivotIndex);
        return pivotIndex; // Trả về chỉ số của pivot
    }

    /**
     * Phương thức hoán đổi hai phần tử trong danh sách tại hai chỉ số cho trước.
     *
     * @param arr Danh sách (List)
     * @param idx1 Chỉ số của phần tử thứ nhất
     * @param idx2 Chỉ số của phần tử thứ hai
     */
    private static <T extends Comparable<T>> void swap(List<T> arr, int idx1, int idx2) {
        T tmp = arr.get(idx1); // Lưu phần tử tại chỉ số idx1
        arr.set(idx1, arr.get(idx2)); // Đặt phần tử tại idx2 vào vị trí idx1
        arr.set(idx2, tmp); // Đặt phần tử tạm thời vào vị trí idx2
    }
}
