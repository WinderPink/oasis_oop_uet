public class Car extends Vehicle {
    private int numberOfDoors; // Số cửa của xe

    /**
     * Constructor mặc định cho đối tượng Car.
     * Khởi tạo đối tượng Car với số cửa là 0.
     */
    public Car() {
        super(); // Gọi constructor của lớp cha (Vehicle)
        this.numberOfDoors = 0; // Số cửa mặc định
    }

    /**
     * Constructor cho đối tượng Car với số cửa được chỉ định.
     *
     * @param numberOfDoors Số cửa của xe
     */
    public Car(int numberOfDoors) {
        super(); // Gọi constructor của lớp cha (Vehicle)
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Constructor cho đối tượng Car với tất cả thông tin chi tiết.
     *
     * @param brand Thương hiệu của xe
     * @param model Mẫu mã của xe
     * @param registrationNumber Số đăng ký của xe
     * @param owner Chủ sở hữu của xe
     * @param numberOfDoors Số cửa của xe
     */
    public Car(String brand, String model,
               String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner); // Gọi constructor của lớp cha (Vehicle)
        this.numberOfDoors = numberOfDoors; // Thiết lập số cửa cho xe
    }

    /**
     * Lấy thông tin chi tiết của xe.
     * 
     * @return Chuỗi mô tả chi tiết về xe (thương hiệu, mẫu mã, số đăng ký, số cửa, chủ sở hữu)
     */
    public String getInfo() {
        return "Car:\n"
                + "\t" + String.format("Brand: %s", brand) + "\n"
                + "\t" + String.format("Model: %s", model) + "\n"
                + "\t" + String.format("Registration Number: %s", registrationNumber) + "\n"
                + "\t" + String.format("Number of Doors: %s", numberOfDoors) + "\n"
                + "\t" + String.format("Belongs to %s - %s", owner.getName(), owner.getAddress());
    }

    /**
     * Lấy số cửa của xe.
     * 
     * @return Số cửa của xe
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Đặt số cửa của xe.
     * 
     * @param numberOfDoors Số cửa mới của xe
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors; // Cập nhật số cửa của xe
    }
}
