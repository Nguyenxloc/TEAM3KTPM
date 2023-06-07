package service;

import model.CanBo;
import model.GiangVien;
import repository.DAO_GiangVien;

/**
 *
 * @author Hello
 */
public class GiangVienService {
    private DAO_GiangVien giangVienRepo = new DAO_GiangVien();
    
    public Integer xacThucTaiKhoanGiangVien(GiangVien giangVien) throws Exception{
        GiangVien maGVCanTim = giangVienRepo.xacThucTaiKhoanGiangVien(giangVien.getMaGV());
       if(maGVCanTim != null){
           String matKhau = giangVien.getMatKhau();
           if(maGVCanTim.getMatKhau().equals(matKhau)){
               return 1; // tìm thấy tài khoản và mật khẩu
           }else{
               return -1; // Không tìm thấy mật khẩu
           }
       }
       return 0; // Không tìm thấy tên tài khoản (mã GV)
   }
}
