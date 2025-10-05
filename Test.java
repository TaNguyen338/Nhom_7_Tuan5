import java.util.ArrayList;
public class Test {
    private ArrayList<Sach> danhSachSach;
    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }
    public void hienThiTatCaSach() {
        for (Sach sach : danhSachSach) {
            sach.hienThiThongTin();
            System.out.println("--------------------");
        }
    }
    public Sach timSachTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                return sach;
            }
        }
        return null;
    }
}