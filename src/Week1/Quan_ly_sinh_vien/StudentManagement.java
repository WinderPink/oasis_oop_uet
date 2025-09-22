/**
 * Lop StudentManagement quan ly danh sach sinh vien bang mang.
 */
public class StudentManagement {

    private final Student[] students = new Student[100];
    private int studentsNum = 0;

    /**
     * Kiem tra hai sinh vien co cung nhom lop hay khong.
     *
     * @param s1 sinh vien 1
     * @param s2 sinh vien 2
     * @return true neu cung nhom, false neu khac
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Them mot sinh vien moi vao danh sach.
     * Neu sinh vien da ton tai (trung toan bo thong tin) thi khong them
     *
     * @param newStudent sinh vien moi
     */
    public void addStudent(Student newStudent) {
        for (int i = 0; i < studentsNum; i++) {
            if (students[i].getInfo().equals(newStudent.getInfo())) {
                return; // tranh them trung
            }
        }
        students[studentsNum] = newStudent;
        studentsNum++;
    }

    /**
     * Tra ve thong tin sinh vien theo nhom.
     * @return thong tin sinh vien theo nhom
     */
    public String studentsByGroup() {
        String res = "";
        boolean[] checked = new boolean[studentsNum];
        for (int i = 1; i < studentsNum; i++) {
            checked[i] = false;
        }

        for (int i = 0; i < studentsNum; i++) {
            if (!checked[i]) {
                res += students[i].getGroup() + "\n";
                res += students[i].getInfo() + "\n";
                checked[i] = true;
                for (int j = i + 1; j < studentsNum; j++) {
                    if (sameGroup(students[i], students[j])) {
                        res += students[j].getInfo() + "\n";
                        checked[j] = true;
                    }
                }
            }
        }

        return res;
    }

    /**
     * Xoa mot sinh vien theo ma so ID.
     *
     * @param id ma so sinh vien can xoa
     */
    public void removeStudent(String id) {
        int pos = -1;

        // Tim vi tri sinh vien co id can xoa
        for (int i = 0; i < studentsNum; i++) {
            if (students[i].getId().equals(id)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return; // khong tim thay sinh vien
        }

        // Don cac phan tu phia sau len
        System.arraycopy(students, pos + 1, students, pos, studentsNum - pos - 1);

        // Xoa phan tu cuoi
        students[studentsNum - 1] = null;
        studentsNum--;
    }

    /**
     * Phuong thuc main de chay chuong trinh quan ly sinh vien.
     * Thuc hien cac buoc:
     * 1. Tao doi tuong StudentManagement
     * 2. Tao va them mot so sinh vien vao danh sach
     * 3. In danh sach sinh vien theo nhom
     * 4. Kiem tra hai sinh vien co cung nhom hay khong
     * 5. Xoa mot sinh vien theo ID
     * 6. In lai danh sach sau khi xoa
     */
    public static void main() {

        // Tao vai sinh vien
        Student s1 = new Student("Nguyen Van A", "2023001", "a@uet.vnu.edu.vn");
        s1.setGroup("INT2204");

        Student s2 = new Student("Tran Thi B", "2023002", "b@uet.vnu.edu.vn");
        s2.setGroup("INT2204");

        Student s3 = new Student("Le Van C", "2023003", "c@uet.vnu.edu.vn");
        s3.setGroup("INT2205");

        Student s4 = new Student("Pham Thi D", "2023004", "d@uet.vnu.edu.vn");
        s4.setGroup("INT2205");

        // Tao doi tuong StudentManagement
        StudentManagement sm = new StudentManagement();
        // Them sinh vien vao quan ly
        sm.addStudent(s1);
        sm.addStudent(s2);
        sm.addStudent(s3);
        sm.addStudent(s4);

        // In danh sach theo nhom
        System.out.println("Danh sach sinh vien theo nhom:");
        System.out.println(sm.studentsByGroup());

        // Kiem tra cung nhom
        System.out.println("Kiem tra cung nhom:");
        System.out.println("s1 va s2 cung nhom? " + StudentManagement.sameGroup(s1, s2));
        System.out.println("s1 va s3 cung nhom? " + StudentManagement.sameGroup(s1, s3));

        // Xoa sinh vien
        System.out.println("Xoa sinh vien co ID = 2023002 (Tran Thi B)...");
        sm.removeStudent("2023002");

        // In lai danh sach sau khi xoa
        System.out.println("Danh sach sau khi xoa:");
        System.out.println(sm.studentsByGroup());
    }
}
