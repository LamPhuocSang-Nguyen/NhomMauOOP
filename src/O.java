public class O extends NhomMau {
    public O() {
        this.Loai = _O;
    }

    @Override
    public boolean kiemTraDiTruyen(NhomMau Cha, NhomMau Con) {
        if (Cha.Loai == _A) {
            if (Con.Loai == _A || Con.Loai == _O) {
                return true;
            }
        } else if (Cha.Loai == _B) {
            if (Con.Loai == _B || Con.Loai == _O) {
                return true;
            }
        } else if (Cha.Loai == _AB) {
            if (Con.Loai == _A || Con.Loai == _B) {
                return true;
            }
        }

        else if (Cha.Loai == _O) {
            if (Con.Loai == _O) {
                return true;
            }
        }

        return false;
    }
}
