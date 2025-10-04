public class Test {
    public static void main(String[] args) {
        // Tao doi tuong sach (su dung constructor co tham so)
        Sach s1 = new Sach("S001", "Lap trinh Java co ban", "Nguyen Van A", 2022, 10);
        Sach s2 = new Sach("S002", "Cau truc du lieu va giai thuat", "Tran Thi B", 2021, 5);

        // Hien thi thong tin sach
        s1.hienThiThongTin();
        s2.hienThiThongTin();

        // Tao sach bang constructor rong + setter
        Sach s3 = new Sach();
        s3.setMaSach("S003");
        s3.setTieuDe("Mang may tinh");
        s3.setTacGia("Le Van C");
        s3.setNamXuatBan(2020);
        s3.setSoLuong(8);

        // Hien thi sach thu 3
        s3.hienThiThongTin();
    }
}
