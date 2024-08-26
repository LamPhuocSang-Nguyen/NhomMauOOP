import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachNguoi {

    private List<NhomMau> arr;

    public DanhSachNguoi(){
        this.arr = new ArrayList<>();
    }


    public void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap so luong nguoi: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Nhap thong tin nguoi thu "+i);
            System.out.println("1. Nhom 0");
            System.out.println("2. Nhom A");
            System.out.println("3. Nhom B");
            System.out.println("4. Nhom AB");

            System.out.println("Moi ban lua chon nhom mau: ");
            int loai = sc.nextInt();

            if(loai == 1){
                NhomMau p = new O();
                p.nhap();
                this.arr.add(p);
            }
            else if(loai == 2){
                NhomMau p = new A();
                p.nhap();
                this.arr.add(p);
            }
            else if(loai == 3){
                NhomMau p = new B();
                p.nhap();
                this.arr.add(p);
            }
            else {
                NhomMau p = new AB();
                p.nhap();
                this.arr.add(p);
            }
        }
    }

    public void xuat(){
        for(NhomMau a : this.arr){
            a.xuat();
        }
    }
}
