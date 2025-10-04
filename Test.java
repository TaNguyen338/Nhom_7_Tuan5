public class Test 
{
    public static void main(String[] args) {
        Sach sach1 = new Sach("S001", "Lap trinh Java co ban", "Nguyen Van A", 2022, 10);
        Sach sach2 = new Sach("S002", "Cau truc du lieu va giai thuat", "Tran Thi B", 2023, 5);
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        sach1.setSoLuong(15);
        System.out.println("So luong moi cua sach " + sach1.getTieuDe() + ": " + sach1.getSoLuong());
    }
}
