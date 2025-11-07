import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList; // Danh sách các phương tiện sở hữu

    /**
     * Constructor mặc định cho đối tượng Person.
     * Khởi tạo đối tượng Person với giá trị mặc định
     */
    public Person() {
        this.name = "";
        this.address = "";
        this.vehicleList = new ArrayList<>(); // Khởi tạo danh sách phương tiện rỗng
    }

    /**
     * Constructor cho đối tượng Person với tên và địa chỉ được chỉ định.
     *
     * @param name Tên của người
     * @param address Địa chỉ của người
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        vehicleList = new ArrayList<>(); // Khởi tạo danh sách phương tiện rỗng
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
     * Đặt tên cho người.
     *
     * @param name Tên mới cho người
     */
    public void setName(String name) {
        this.name = name;
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
     * Đặt địa chỉ cho người.
     *
     * @param address Địa chỉ mới cho người
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Lấy danh sách các phương tiện sở hữu.
     *
     * @return Danh sách các phương tiện
     */
    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    /**
     * Đặt danh sách phương tiện sở hữu.
     *
     * @param vehicleList Danh sách các phương tiện mới
     */
    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    /**
     * Thêm một phương tiện vào danh sách sở hữu của người.
     *
     * @param vehicle Phương tiện muốn thêm vào danh sách
     */
    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle); // Thêm phương tiện vào danh sách
    }

    /**
     * Xóa phương tiện khỏi danh sách sở hữu theo số đăng ký.
     *
     * @param registrationNumber Số đăng ký của phương tiện cần xóa
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : this.vehicleList) {
            // Kiểm tra nếu số đăng ký của phương tiện trùng khớp
            if (Objects.equals(vehicle.getRegistrationNumber(), registrationNumber)) {
                this.vehicleList.remove(vehicle); // Xóa phương tiện khỏi danh sách
                break;
            }
        }
    }

    /**
     * Lấy thông tin về các phương tiện sở hữu.
     *
     * @return Chuỗi thông tin về các phương tiện
     */
    public String getVehiclesInfo() {
        StringBuilder vehicleInfo = new StringBuilder();
        vehicleInfo.append(String.format("%s has", this.name));

        // Kiểm tra nếu không có phương tiện nào
        if (Objects.isNull(this.vehicleList) || this.vehicleList.isEmpty()) {
            vehicleInfo.append(" no vehicle!"); 
            return vehicleInfo.toString();
        }

        vehicleInfo.append(":").append("\n\n");
        // Lặp qua danh sách phương tiện và lấy thông tin của từng phương tiện
        for (Vehicle vehicle : this.vehicleList) {
            vehicleInfo.append(vehicle.getInfo()).append("\n");
        }

        return vehicleInfo.toString(); // Trả về thông tin tất cả phương tiện sở hữu
    }
}
