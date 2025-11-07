public class MotorBike extends Vehicle {
    private boolean hasSidecar; // Xe có gắn sidecar hay không

    /**
     * Constructor mặc định cho đối tượng MotorBike.
     * Khởi tạo đối tượng MotorBike với giá trị mặc định: không có sidecar.
     */
    public MotorBike() {
        super(); // Gọi constructor của lớp cha (Vehicle)
        this.hasSidecar = false; // Mặc định không có sidecar
    }

    /**
     * Constructor cho đối tượng MotorBike với thông tin về việc có gắn sidecar hay không.
     *
     * @param hasSidecar True nếu xe có gắn sidecar, false nếu không.
     */
    public MotorBike(boolean hasSidecar) {
        super(); // Gọi constructor của lớp cha (Vehicle)
        this.hasSidecar = hasSidecar;
    }

    /**
     * Constructor cho đối tượng MotorBike với tất cả các thông tin chi tiết.
     *
     * @param brand Thương hiệu của xe
     * @param model Mẫu mã của xe
     * @param registrationNumber Số đăng ký của xe
     * @param owner Chủ sở hữu của xe
     * @param hasSidecar True nếu xe có gắn sidecar, false nếu không.
     */
    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner); // Gọi constructor của lớp cha (Vehicle)
        this.hasSidecar = hasSidecar; // Thiết lập thông tin về sidecar
    }

    /**
     * Lấy thông tin chi tiết của xe máy.
     *
     * @return Chuỗi mô tả chi tiết về xe máy
     */
    public String getInfo() {
        return "Motor Bike:\n"
                + "\t" + String.format("Brand: %s", brand) + "\n"
                + "\t" + String.format("Model: %s", model) + "\n"
                + "\t" + String.format("Registration Number: %s", registrationNumber) + "\n"
                + "\t" + String.format("Has Side Car: %s", hasSidecar) + "\n"
                + "\t" + String.format("Belongs to %s - %s", owner.getName(), owner.getAddress());
    }

    /**
     * Kiểm tra xem xe có gắn sidecar hay không.
     *
     * @return true nếu xe có gắn sidecar, false nếu không.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * Đặt giá trị cho thuộc tính sidecar của xe.
     *
     * @param hasSidecar True nếu xe có sidecar, false nếu không.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar; // Cập nhật thông tin sidecar
    }
}
