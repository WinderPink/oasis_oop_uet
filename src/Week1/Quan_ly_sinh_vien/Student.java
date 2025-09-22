/**
 * Class Student dai dien cho mot sinh vien voi thong tin co ban.
 */
public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Lay ten sinh vien.
     *
     * @return ten sinh vien
     */
    public String getName() {
        return name;
    }

    /**
     * Gan ten sinh vien.
     *
     * @param name ten sinh vien
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Lay ma so sinh vien.
     *
     * @return ma so sinh vien
     */
    public String getId() {
        return id;
    }

    /**
     * Gan ma so sinh vien.
     *
     * @param id ma so sinh vien
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Lay lop nhom cua sinh vien.
     *
     * @return lop nhom
     */
    public String getGroup() {
        return group;
    }

    /**
     * Gan lop nhom cua sinh vien.
     *
     * @param group lop nhom
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Lay email sinh vien.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gan email sinh vien.
     *
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Tra ve chuoi thong tin sinh vien.
     *
     * @return thong tin sinh vien (name - id - group - email)
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /**
     * Constructor mac dinh.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor voi 3 tham so (group mac dinh = K62CB).
     *
     * @param name  ten sinh vien
     * @param id    ma so sinh vien
     * @param email email sinh vien
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Constructor sao chep.
     *
     * @param s sinh vien can sao chep
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}
