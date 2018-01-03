package dao;

import java.util.ArrayList;

import model.SanPham;

public class GioHangDAO {

    public static ArrayList<SanPham> dsSanPham = new ArrayList<>();
    public static ArrayList<SanPham> gioHang = new ArrayList<>();

    public GioHangDAO() {
        dsSanPham.removeAll(dsSanPham);
        SanPham ip = new SanPham("IP001", "Iphong 7s plus", "img/ip7.jpg", "19000000", "1");
        SanPham ss = new SanPham("SS601", "SamSung", "img/ss8.jpg", "13000000", "1");
        SanPham sn = new SanPham("SN401", "Sony", "img/sony.png", "12000000", "1");
        SanPham oppo = new SanPham("OP301", "Oppo f3", "img/oppo.jpg", "10000000", "1");
        dsSanPham.add(ip);
        dsSanPham.add(ss);
        dsSanPham.add(sn);
        dsSanPham.add(oppo);

    }

    public boolean kiemTraSanPhamCoTrongGioHangChua(String maSanPham) {
        for (int i = 0; i < gioHang.size(); i++) {
            if (gioHang.get(i).getMaSanPham().equals(maSanPham)) {
                return true;
            }
        }
        return false;
    }

    public boolean themVaoGioHang(String maSanPham) {
        boolean kiemTra = kiemTraSanPhamCoTrongGioHangChua(maSanPham);
        for (int i = 0; i < dsSanPham.size(); i++) {
            if (dsSanPham.get(i).getMaSanPham().equals(maSanPham) && kiemTra == false) {
                gioHang.add(dsSanPham.get(i));
                return true;
            }
        }
        if (kiemTra == true) {
            int index = gioHang.size();
            for (int i = 0; i < index; i++) {
                if (gioHang.get(i).getMaSanPham().equals(maSanPham)) {
                    gioHang.get(i).setSoLuongMua(Integer.parseInt(gioHang.get(i).getSoLuongMua()) + 1 + "");
                    index = i;
                }
            }
        }
        return false;
    }

    public boolean xoaSanPhamRaKkoiGioHang(String maSanPham) {
        for (int i = 0; i < gioHang.size(); i++) {
            if (gioHang.get(i).getMaSanPham().equals(maSanPham)) {
                gioHang.remove(i);
                return true;
            }
        }
        return false;
    }

    public static ArrayList<SanPham> getDsSanPham() {
        return dsSanPham;
    }

    public static void setDsSanPham(ArrayList<SanPham> dsSanPham) {
        GioHangDAO.dsSanPham = dsSanPham;
    }

    public static ArrayList<SanPham> getGioHang() {
        return gioHang;
    }

    public static void setGioHang(ArrayList<SanPham> gioHang) {
        GioHangDAO.gioHang = gioHang;
    }

}
