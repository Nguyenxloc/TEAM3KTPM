package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CanBo;
import model.ChuyenNganh;
import model.Lich;
import model.LichFull;
import model.LopHoc;
import model.MonHoc;
import model.PhongHoc;
import model.SinhVien;
import repository.DAO_CanBoQuanLy;
import repository.DAO_ChuyenNganh;
import repository.DAO_Lich;
import repository.DAO_LichFull;
import repository.DAO_LopHoc;
import repository.DAO_MonHoc;
import repository.DAO_PhongHoc;

/**
 *
 * @author Hello
 */
public class CanBoService {

    private DAO_CanBoQuanLy canBorepo = new DAO_CanBoQuanLy();
    private DAO_ChuyenNganh chuyenNganhRepo = new DAO_ChuyenNganh();
    private DAO_MonHoc monHocRepo = new DAO_MonHoc();
    private DAO_LopHoc lopHocRepo = new DAO_LopHoc();
    private DAO_PhongHoc phongHocRepo = new DAO_PhongHoc();
    private DAO_Lich lichRepo = new DAO_Lich();
    private DAO_LichFull lichFullRepo = new DAO_LichFull();

    public Integer xacThucTaiKhoanCanBo(CanBo canBo) throws Exception {
        CanBo maCBCanTim = canBorepo.xacThucTaiKhoanCanBo(canBo.getMaCB());
        if (maCBCanTim != null) {
            String matKhau = canBo.getMatKhau();
            if (maCBCanTim.getMatKhau().equals(matKhau)) {
                return 1; // tìm thấy tài khoản và mật khẩu
            } else {
                return -1; // Không tìm thấy mật khẩu
            }
        }
        return 0; // Không tìm thấy tên tài khoản (mã CBs)
    }
    ////////////////////////chuyenNganh///////////////////////////////////

    public ArrayList<ChuyenNganh> selectChuyenNganh() {
        ArrayList<ChuyenNganh> lstCN = new ArrayList<>();
        lstCN = chuyenNganhRepo.findAll();
        return lstCN;
    }

    public ChuyenNganh updateChuyenNganh(ChuyenNganh cn) {
        chuyenNganhRepo.update(cn);
        return cn;
    }

    public ChuyenNganh saveChuyenNganh(ChuyenNganh cn) {
        chuyenNganhRepo.save(cn);
        return cn;
    }

    public ChuyenNganh selectChuyenNganhByID(String id) {
        ChuyenNganh cn = new ChuyenNganh();
        cn = chuyenNganhRepo.findById(id);
        return cn;
    }

    public String deleteChuyenNganh(String id) {
        return chuyenNganhRepo.delete(id);
    }
    ////////////////////////////////////////////////////////////
    //////////////////////////////monhoc//////////////////////////

    public ArrayList<MonHoc> selectMonHoc() {
        ArrayList<MonHoc> lstMH = new ArrayList<>();
        lstMH = monHocRepo.findAll();
        return lstMH;
    }

    public MonHoc updateMonHoc(MonHoc mh) {
        monHocRepo.update(mh);
        return mh;
    }

    public MonHoc saveMonHoc(MonHoc mh) {
        monHocRepo.save(mh);
        return mh;
    }

    public MonHoc selectMonHocByID(String id) {
        MonHoc mh = new MonHoc();
        mh = monHocRepo.findById(id);
        return mh;
    }

    public String deleteMonHoc(String id) {
        return monHocRepo.delete(id);
    }
    /////////////////////LopHoc////////////////////////

    public ArrayList<LopHoc> selectLopHoc() {
        ArrayList<LopHoc> lstLH = new ArrayList<>();
        lstLH = lopHocRepo.findAll();
        return lstLH;
    }

    public LopHoc updateLopHoc(LopHoc lh) {
        lopHocRepo.update(lh);
        return lh;
    }

    public LopHoc saveLopHoc(LopHoc lh) {
        lopHocRepo.save(lh);
        return lh;
    }

    public LopHoc selectLopHocByID(String id) {
        LopHoc lh = new LopHoc();
        lh = lopHocRepo.findById(id);
        return lh;
    }

    public String deleteLopHoc(String id) {
        return lopHocRepo.delete(id);
    }

    //////////////////////////////////////////////////
    ///////////////////PhongHoc///////////////////////
    public ArrayList<PhongHoc> selectPhongHoc() {
        ArrayList<PhongHoc> lstPH = new ArrayList<>();
        lstPH = phongHocRepo.findAll();
        return lstPH;
    }

    public PhongHoc updatePhongHoc(PhongHoc ph) {
        phongHocRepo.update(ph);
        return ph;
    }

    public PhongHoc saveLopHoc(PhongHoc ph) {
        phongHocRepo.save(ph);
        return ph;
    }

    public PhongHoc selectPhongHocByID(String id) {
        PhongHoc ph = new PhongHoc();
        ph = phongHocRepo.findById(id);
        return ph;
    }

    public String deletePhongHoc(String id) {
        return phongHocRepo.delete(id);
    }

    ///////////////////LichHoc//////////////////////
    public ArrayList<Lich> selectLich() {
        ArrayList<Lich> lstPH = new ArrayList<>();
        lstPH = lichRepo.findAll();
        return lstPH;
    }

    public Lich updateLich(Lich lh,String maSv,String maMonHoc,String maLopHoc) {
//        lichRepo.update(lh,maSv,maMonHoc,maLopHoc);
        return lh;
    }

    public Lich saveLich(Lich lh) {
        lichRepo.save(lh);
        return lh;
    }

    public Lich selectLichByIdSV(String id) {
        Lich lh = new Lich();
        lh = lichRepo.findByIdSV(id);
        return lh;
    }

    public Lich selectLichByIdGV(String id) {
        Lich lh = new Lich();
        lh = lichRepo.findByIdGV(id);
        return lh;
    }

    public Lich selectLichByIdMHLH(String idmh, String idlh) {
        Lich lh = new Lich();
        lh = lichRepo.findByIdMHLH(idmh, idlh);
        return lh;
    }

    public String deleteLichHoc(String id) {
        return lichRepo.delete(id);
    }

    public ArrayList<String> getDay() {
        return lichRepo.getDay();
    }

    public ArrayList<String> getTime() {
        return lichRepo.getTime();
    }

    ////////////////////////////////////////////////
    ///////////////////LichFull//////////////////////
    public ArrayList<LichFull> selectLichFull() {
        ArrayList<LichFull> lstLichFull = new ArrayList<>();
        lstLichFull = lichFullRepo.findAll();
        return lstLichFull;
    }

    public Lich selectLichFullByIdSV(String id) {
        Lich lh = new Lich();
        lh = lichRepo.findByIdSV(id);
        return lh;
    }

    public Lich selectLichFullByIdGV(String id) {
        Lich lh = new Lich();
        lh = lichRepo.findByIdGV(id);
        return lh;
    }

    public Lich selectLichFullByIdMHLH(String idmh, String idlh) {
        Lich lh = new Lich();
        lh = lichRepo.findByIdMHLH(idmh, idlh);
        return lh;
    }

    ////////////////////////////////////////////////
    //////////////////

    public void update(Lich lich) {
    }
}
