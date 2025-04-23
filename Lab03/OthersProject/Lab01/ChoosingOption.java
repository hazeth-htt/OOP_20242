import java.util.Stack;

class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static final double LUONG_MAX = Double.MAX_VALUE;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        setLuongCoBan(luongCoBan);
        setHeSoLuong(heSoLuong);
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        if (luongCoBan > 0) {
            this.luongCoBan = luongCoBan;
        } else {
            System.out.println("Lỗi: Lương cơ bản phải lớn hơn 0.");
        }
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        if (heSoLuong > 0) {
            this.heSoLuong = heSoLuong;
        } else {
            System.out.println("Lỗi: Hệ số lương phải lớn hơn 0.");
        }
    }

    public boolean tangHeSoLuong(double heSo) {
        if (heSo > 0) {
            this.heSoLuong += heSo;
            return true;
        }
        return false;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương: " + tinhLuong());
    }
}

class TruongPhong extends NhanVien {
    private double phuCap;
    private int soNamDuongChuc;

    public TruongPhong() {
        super("Chưa xác định", 5000000, 1.0);
        this.phuCap = 0;
        this.soNamDuongChuc = 0;
    }

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public int getSoNamDuongChuc() {
        return soNamDuongChuc;
    }

    public void setSoNamDuongChuc(int soNamDuongChuc) {
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap;
    }

    @Override
    public void inTTin() {
        super.inTTin();
        System.out.println("Phụ cấp: " + phuCap);
        System.out.println("Số năm đương chức: " + soNamDuongChuc);
    }
}

public class MainTest {
    public static void main(String[] args) {
        TruongPhong tp1 = new TruongPhong();
        System.out.println("--- Trưởng phòng mặc định ---");
        tp1.inTTin();

        System.out.println("\n--- Trưởng phòng có tham số ---");
        TruongPhong tp2 = new TruongPhong("Đỗ Thị D", 7000000, 2.2, 1500000, 3);
        tp2.inTTin();
    }
}