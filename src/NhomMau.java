import java.util.Scanner;

public class NhomMau {
    public static final int _O = 1;
    public static final int _A = 2;
    public static final int _B = 3;
    public static final int _AB = 4;

    protected boolean Rh;
    protected int Loai;


    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Rh:");
        boolean rh =sc.nextBoolean();
        if(rh){
            this.Rh = true;
        }
        else{
            this.Rh = false;
        }
    }

    public void xuat(){
        if(this.Loai == _O){
            System.out.printf("O");
        }
        else if(this.Loai == _A){
            System.out.printf("A");
        }
        else if(this.Loai == _B){
            System.out.printf("B");
        }
        else {
            System.out.printf("AB");
        }


        if(this.Rh){
            System.out.println("+");
        }
        else {
            System.out.println("-");
        }
    }


    public NhomMau nhapNhomMau(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Nhom 0");
        System.out.println("2. Nhom A");
        System.out.println("3. Nhom B");
        System.out.println("4. Nhom AB");

        System.out.println("Moi ban lua chon nhom mau: ");
        int loai = sc.nextInt();

        NhomMau p;

        if(loai == 1){
            p = new O();
            p.nhap();
        }
        else if(loai == 2){
            p = new A();
            p.nhap();
        }
        else if(loai == 3){
            p = new B();
            p.nhap();
        }
        else {
            p = new AB();
            p.nhap();
        }

        return p;
    }

    public boolean kiemTraDiTruyen(NhomMau cha, NhomMau con){
        return true;
    }
}
