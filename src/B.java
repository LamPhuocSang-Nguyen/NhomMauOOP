public class B extends NhomMau {
    public B() {
        this.Loai = _B;
    }

    @Override
    public boolean kiemTraDiTruyen(NhomMau Cha, NhomMau Con) {
        if (Cha.Loai == _A) {
            return true;
        } else if (Cha.Loai == _B) {
            if (Con.Loai == _B || Con.Loai == _O) {
                return true;
            }
        } else if (Cha.Loai == _AB) {
            if (Con.Loai != _O) {
                return true;
            }
        } else if (Cha.Loai == _O) {
            if (Con.Loai == _B || Con.Loai == _O) {
                return true;
            }
        }

        return false;
    }
}
