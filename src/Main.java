public class Main {
    public static void main(String[] args) {
        // DanhSachNguoi ds = new DanhSachNguoi();
        // ds.nhap();
        // ds.xuat();

        // Cau2
        System.out.println("Cau2");
        System.out.println("Nhap nhap nhom mau cua cha: ");
        NhomMau nhomMau = new NhomMau();
        NhomMau cha = nhomMau.nhapNhomMau();

        System.out.println("Nhap nhom mau cua me: ");
        NhomMau me = nhomMau.nhapNhomMau();

        System.out.println("Nhap nhom mau cua con: ");
        NhomMau con = nhomMau.nhapNhomMau();

        System.out.printf("Cha: ");
        cha.xuat();
        System.out.printf("Me: ");
        me.xuat();
        System.out.printf("Con: ");
        con.xuat();

        if (me.kiemTraDiTruyen(cha, con)) {
            System.out.println("Gia dinh dung theo quy luat dy truyen hoc");
        } else {
            System.out.println("Co gi do sai sai !");
        }

    }
}