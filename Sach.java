
public class Sach
{
  private String maSach;
  private String tieuDe;
  private String tacGia;
  private int namXuatBan;
  private int soLuong;
  public Sach() {
      
    }
    public Sach (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong)
    {
    this.maSach = maSach;
    this.tieuDe = tieuDe;
    this.tacGia = tacGia;
    this.namXuatBan = namXuatBan;
    this.soLuong = soLuong;
    
    }
    public String getmaSach()
    {
    return maSach;
    }
    public void setmaSach(String maSach)
    {
        this.maSach=maSach;
        
    }
    public String gettieuDe()
    {
        return tieuDe;
    }
    public void settieuDe(String tieuDe)
    {
        this.tieuDe=tieuDe;
    }
    public String gettacGia()
    {
        return tacGia;

    }
    public void settacGia (String tacGia)
    {
        this.tacGia=tacGia;
    }
    public int getnamXuatBan()
    {
        return namXuatBan;
    }
    public void setnamXuatBan(int namXuatBan)
    {
        this.namXuatBan=namXuatBan;

    }
    public int getsoLuong()
    {
        return soLuong;
    }
    public void setsoLuong(int soLuong)
    {
        this.soLuong=soLuong;
    }
    public void hienthithongtin()
    {
        System.out.println("Ma sach: "+maSach);
        System.out.println("Tieu de: "+tieuDe);
        System.out.println("Tac gia: "+tacGia);
        System.out.println("Nam xuat ban: "+namXuatBan);
        System.out.println("So luong: "+soLuong);
    }
}



