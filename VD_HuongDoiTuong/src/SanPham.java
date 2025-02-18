
public class SanPham {
	//Định nghĩa các thuộc tính
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP; //lưu tên file ảnh >string
	
	
	public SanPham() {
		super();
	}


	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;
	}


	public int getMaSP() {
		return maSP;
	}


	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}


	public String getTenSP() {
		return tenSP;
	}


	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}


	public String getLoaiSP() {
		return loaiSP;
	}


	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}


	public String getAnhSP() {
		return anhSP;
	}


	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}


	@Override
	public String toString() {
		return "[Mã SP=" + maSP + ", Tên SP=" + tenSP + ", Loại SP=" + loaiSP + ", Ảnh SP=" + anhSP + "]";
	}
	
	
	
	
	
//	//Hàm tạo
//	public SanPham() {
//		// khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
//		
//	}
//	public SanPham(int _maSP, String _tenSP, String _loaiSP, String _anhSP) {
//		// khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
//		maSP = _maSP;
//		tenSP = _tenSP;
//		loaiSP = _loaiSP;
//		anhSP = _anhSP;	
//	}
//	
////	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
////		// khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
////		this.maSP = maSP;
////		this.tenSP = tenSP;
////		this.loaiSP = loaiSP;
////		this.anhSP = anhSP;
////		
////	}
//	
//	//Các getter, setter
//	int getMaSP() {
//		return maSP;
//	}
//	public void setMaSP(int _maSP) {
//		maSP = _maSP;
//	}
	
	
}
