package huongdoituong;

public class Square {
	private float fcanh;
	public float getFcanh() {
		return fcanh;
	}
	public void setFcanh(float fcanh) {
		this.fcanh = fcanh;
	}
	public Square() {
		this.setFcanh(1);
	}
	public Square(float fcanh) {
		this.setFcanh(fcanh);
	}
	public void TinhChuVi() {
		System.out.println("Chu Vi La: "+this.getFcanh() * 4);
	}
	public void TinhDienTich() {
		System.out.println("Dien Tich La : "+this.getFcanh()*this.getFcanh());
	}
	public void HienThi() {
		this.TinhChuVi();
		this.TinhDienTich();
	}
}
