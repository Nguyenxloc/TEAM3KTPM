package service;

import java.sql.SQLException;
import java.util.List;
import model.CanBo;
import repository.DAO_CanBoQuanLy;

/**
 *
 * @author Hello
 */
public class CanBoService {
    private DAO_CanBoQuanLy canBorepo = new DAO_CanBoQuanLy();
    
    public Integer xacThucTaiKhoanCanBo(CanBo canBo) throws Exception{
        CanBo maCBCanTim = canBorepo.xacThucTaiKhoanCanBo(canBo.getMaCB());
       if(maCBCanTim != null){
           String matKhau = canBo.getMatKhau();
           if(maCBCanTim.getMatKhau().equals(matKhau)){
               return 1; // tìm thấy tài khoản và mật khẩu
           }else{
               return -1; // Không tìm thấy mật khẩu
           }
       }
       return 0; // Không tìm thấy tên tài khoản (mã CBs)
   }
}
