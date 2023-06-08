package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CanBo;
import model.ChuyenNganh;
import model.SinhVien;
import repository.DAO_CanBoQuanLy;
import repository.DAO_ChuyenNganh;

/**
 *
 * @author Hello
 */
public class CanBoService {
    private DAO_CanBoQuanLy canBorepo = new DAO_CanBoQuanLy();
    private DAO_ChuyenNganh chuyenNganhRepo = new DAO_ChuyenNganh();
    
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
 ////////////////////////chuyenNganh///////////////////////////////////
    public ArrayList<ChuyenNganh> selectChuyenNganh(){
        ArrayList<ChuyenNganh> lstCN = new ArrayList<>();
        lstCN=chuyenNganhRepo.findAll();
        return lstCN;
    }
    public ChuyenNganh updateChuyenNganh(ChuyenNganh cn){
         chuyenNganhRepo.update(cn);
         return cn;
    }
    public ChuyenNganh saveChuyenNganh(ChuyenNganh cn){
        chuyenNganhRepo.save(cn);
        return cn;
    }
    public ChuyenNganh selectChuyenNganhByID(String id){
        ChuyenNganh cn = new ChuyenNganh();
        cn=chuyenNganhRepo.findById(id);
        return cn;
    }
    public String deleteChuyenNganh(String id){
        return chuyenNganhRepo.delete(id);
    }
 ////////////////////////////////   
}
