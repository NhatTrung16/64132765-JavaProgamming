import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		// Khai báo danh sách sản phẩm
        ArrayList<SanPham> dsSanPham;
        //Xin mới
        dsSanPham = new ArrayList<SanPham>();
        
        //Nhập 3 sản phẩm
        SanPham sp1 = new SanPham(0, "Kem", "Giải Khát" ,null);
        SanPham sp2 = new SanPham(1, "Cơm", "Đồ Ăn" ,null);
        SanPham sp3 = new SanPham(2, "Phở", "Đồ Ăn" ,null);
        
        //Thêm vào Arraylist
        dsSanPham.add(sp1);
        dsSanPham.add(sp2);
        dsSanPham.add(sp3);
        
//        for (SanPham x: dsSanPham)
//            System.out.println(x.toString());
        
        for (int i= 0; i<dsSanPham.size(); i++) {
            SanPham sp = dsSanPham.get(i);
            System.out.println(sp.toString());
        }

	}

}
