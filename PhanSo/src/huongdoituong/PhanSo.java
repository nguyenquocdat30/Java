package huongdoituong;

public class PhanSo {
	private int nTuSo;
	private int nMauSo;
	// getter - setter
	public int getnTuSo() {
		return nTuSo;
	}
	public void setnTuSo(int nTuSo) {
		this.nTuSo = nTuSo;
	}
	public int getnMauSo() {
		return nMauSo;
	}
	public void setnMauSo(int nMauSo) {
		this.nMauSo = nMauSo;
	}
	// constructor
	public PhanSo() {
		this.nTuSo = 0;
		this.nMauSo = 1;
	}
	public PhanSo(int tuSo,int mauSo) {
		this.nTuSo = tuSo;
		this.nMauSo = mauSo;
	}
	// Ham tinh tong, hieu, tich, thuong 2 PhanSo
	public PhanSo CongPhanSo(PhanSo ps) {
		PhanSo temp = new PhanSo();
		temp.nTuSo = this.nTuSo * ps.nMauSo + this.nMauSo * ps.nTuSo;
		temp.nMauSo = this.nMauSo * ps.nMauSo;
		return temp;
	}
	public PhanSo TruPhanSo(PhanSo ps) {
		PhanSo temp = new PhanSo();
		temp.nTuSo = this.nTuSo * ps.nMauSo - this.nMauSo * ps.nTuSo;
		temp.nMauSo = this.nMauSo * ps.nMauSo;
		return temp;
	}
	public PhanSo NhanPhanSo(PhanSo ps) {
		PhanSo temp = new PhanSo();
		temp.nTuSo = this.nTuSo * ps.nTuSo;
		temp.nMauSo = this.nMauSo * ps.nMauSo;
		return temp;
	}
	public PhanSo ChiaPhanSo(PhanSo ps) {
		PhanSo temp = new PhanSo();
		temp.nTuSo = this.nTuSo * ps.nMauSo;
		temp.nMauSo = this.nMauSo * ps.nTuSo;
		return temp;
	}
	// Ham tim uoc chung lon nhat (UCLN)
	public int UCLN(int a,int b) {
		while(a != b) {
			if(a>b)
				a-=b;
			else
				b-=a;
		}
		return a;
	}
	// toi gian PhanSo
	public PhanSo ToiGianPhanSo() {
		int nUcln = UCLN(this.nTuSo,this.nMauSo);
		this.nTuSo = this.nTuSo/nUcln;
		this.nMauSo = this.nMauSo/nUcln;
		return this;
	}
	public int SoSanhPhanSo(PhanSo ps) {
		this.nTuSo = this.nTuSo*ps.nMauSo;
		ps.nTuSo = ps.nTuSo*this.nMauSo;
		if(this.nTuSo > ps.nTuSo)
			return 1;
		else if(this.nTuSo < ps.nTuSo)
			return -1;
		else 
			return 0;
	}
}
