public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Khởi tạo đối tượng Vehicle với giá trị mặc định.
     * Tạo một đối tượng Vehicle mới với các giá trị mặc định cho thương hiệu, mẫu mã, 
     * số đăng ký và chủ sở hữu là một đối tượng Person mặc định.
     */
    public Vehicle() {
        this.brand = "";
        this.model = "";
        this.registrationNumber = "";
        this.owner = new Person(); // Khởi tạo chủ sở hữu mặc định
    }

    /**
     * Khởi tạo đối tượng Vehicle với các giá trị được chỉ định.
     * 
     * @param brand Thương hiệu của xe
     * @param model Mẫu mã của xe
     * @param registrationNumber Số đăng ký của xe
     * @param owner Chủ sở hữu của xe
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner; // Thiết lập chủ sở hữu
    }

    /**
     * Lấy giá trị thương hiệu của xe.
     * 
     * @return Thương hiệu của xe
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Đặt giá trị thương hiệu cho xe.
     * 
     * @param brand Thương hiệu mới của xe
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Lấy giá trị mẫu mã của xe.
     * 
     * @return Mẫu mã của xe
     */
    public String getModel() {
        return model;
    }

    /**
     * Đặt giá trị mẫu mã cho xe.
     * 
     * @param model Mẫu mã mới của xe
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Lấy giá trị số đăng ký của xe.
     * 
     * @return Số đăng ký của xe
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Đặt giá trị số đăng ký cho xe.
     * 
     * @param registrationNumber Số đăng ký mới của xe
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Lấy đối tượng chủ sở hữu của xe.
     * 
     * @return Chủ sở hữu của xe
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Đặt chủ sở hữu mới cho xe.
     * 
     * @param owner Chủ sở hữu mới của xe
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * Chuyển nhượng quyền sở hữu xe cho một chủ sở hữu mới.
     * 
     * @param newOwner Chủ sở hữu mới của xe
     */
    public void transferOwnership(Person newOwner) {
        this.owner = newOwner; // Chuyển nhượng quyền sở hữu
    }

    /**
     * Phương thức trừu tượng để lấy thông tin chi tiết về phương tiện.
     * Các lớp con phải triển khai phương thức này để trả về thông tin chi tiết.
     * 
     * @return Thông tin chi tiết về phương tiện
     */
    public abstract String getInfo();
}
