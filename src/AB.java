public class AB extends NhomMau {
    public AB() {
        this.Loai = _AB;
    }

    @Override
    public boolean kiemTraDiTruyen(NhomMau Cha, NhomMau Con) {
        if (Cha.Loai == _A || Cha.Loai == _B || Cha.Loai == _AB) {
            if (Con.Loai != _O) {
                return true;
            }
        }

        else if (Cha.Loai == _O) {
            if (Con.Loai == _A || Con.Loai == _B) {
                return true;
            }
        }

        return false;
    }
}
