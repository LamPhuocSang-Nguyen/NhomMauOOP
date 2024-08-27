public class A extends NhomMau {
    public A() {
        this.Loai = _A;
    }

    @Override
    public boolean kiemTraDiTruyen(NhomMau Cha, NhomMau Con) {
        if (Cha.Loai == _A || Cha.Loai == _O) {
            if (Con.Loai == _A || Con.Loai == _O) {
                return true;
            }
        } else if (Cha.Loai == _B) {
            return true;
        } else if (Cha.Loai == _AB) {
            if (Con.Loai != _O) {
                return true;
            }
        }

        return false;
    }

}
