/**
 * Lớp Person đại diện cho một người với các thuộc tính tên và địa chỉ.
 * Cung cấp các phương thức để truy xuất và thay đổi các thuộc tính này.
 */
public class Person {
    private String name;
    private String address;

    /**
     * Constructor để khởi tạo tên và địa chỉ của người.
     *
     * @param name    Tên của người
     * @param address Địa chỉ của người
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Lấy địa chỉ của người.
     *
     * @return Địa chỉ của người
     */
    public String getAddress() {
        return address;
    }

    /**
     * Cập nhật địa chỉ của người.
     *
     * @param address Địa chỉ mới của người
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Lấy tên của người.
     *
     * @return Tên của người
     */
    public String getName() {
        return name;
    }

    /**
     * Cập nhật tên của người.
     *
     * @param name Tên mới của người
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Chuyển đổi đối tượng Person thành chuỗi mô tả.
     *
     * @return Chuỗi mô tả thông tin của người
     */
    @Override
    public String toString() {
        return String.format("Person[name=%s,address=%s]", this.name, this.address);
    }
}
