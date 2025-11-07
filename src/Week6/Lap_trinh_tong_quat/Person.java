public class Person implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String address;

    /**
     * Constructor mặc định cho đối tượng Person.
     * Khởi tạo giá trị mặc định cho các thuộc tính của Person.
     */
    public Person() {
        this.name = ""; // Tên mặc định là chuỗi rỗng
        this.age = 0;    // Tuổi mặc định là 0
        this.address = ""; // Địa chỉ mặc định là chuỗi rỗng
    }

    /**
     * Constructor cho đối tượng Person với tham số đầu vào.
     *
     * @param name    Tên của người
     * @param age     Tuổi của người
     * @param address Địa chỉ của người
     */
    public Person(String name, int age, String address) {
        this.name = name;       // Gán tên cho đối tượng Person
        this.age = age;         // Gán tuổi cho đối tượng Person
        this.address = address; // Gán địa chỉ cho đối tượng Person
    }

    public String getName() {
        return name; // Trả về tên của người
    }

    public void setName(String name) {
        this.name = name; // Cập nhật tên cho người
    }

    public int getAge() {
        return age; // Trả về tuổi của người
    }

    public void setAge(int age) {
        this.age = age; // Cập nhật tuổi cho người
    }

    public String getAddress() {
        return address; // Trả về địa chỉ của người
    }

    public void setAddress(String address) {
        this.address = address; // Cập nhật địa chỉ cho người
    }

    /**
     * Phương thức compareTo được ghi đè từ interface Comparable để so sánh hai đối tượng Person.
     * So sánh theo tên trước, nếu tên bằng nhau sẽ so sánh theo tuổi.
     *
     * @param o Đối tượng Person cần so sánh
     * @return Kết quả so sánh: giá trị âm nếu nhỏ hơn, dương nếu lớn hơn, và 0 nếu bằng nhau
     */
    @Override
    public int compareTo(Person o) {
        // So sánh tên theo thứ tự chữ cái
        int nameCompare = this.name.compareTo(o.getName());
        
        // Nếu tên khác nhau, trả về kết quả so sánh tên
        // Nếu tên bằng nhau, tiếp tục so sánh theo tuổi
        return nameCompare != 0
                ? nameCompare
                : Integer.compare(this.age, o.getAge());
    }
}
