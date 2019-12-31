package com.example.recyclerview26112019;

import java.util.ArrayList;

public class Monan {
    private String ten;
    private String mota;
    private Integer hinhanh;
    private Integer gia;

    // alt + insert

    public Monan(String ten, String mota, Integer hinhanh, Integer gia) {
        this.ten = ten;
        this.mota = mota;
        this.hinhanh = hinhanh;
        this.gia = gia;
    }

    public Monan() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(Integer hinhanh) {
        this.hinhanh = hinhanh;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }
    public static ArrayList<Monan> mock(){
        ArrayList<Monan> mArraylistMonan = new ArrayList<>();
        mArraylistMonan.add(new Monan("Bánh Huế Thu Thảo","61 Quang Trung, P. 10, Gò Vấp, TP. HCM",R.drawable.banhhuethuthao,36000));
        mArraylistMonan.add(new Monan("Bún đậu mẹc","376 Lê Văn Thọ, P. 11, Gò Vấp, TP. HCM",R.drawable.bundaumet,44000));
        mArraylistMonan.add(new Monan("Funfarm - Trái Cây Tô & Nước Ép","25/1 Giải Phóng, P. 4, Tân Bình, TP. HCM",R.drawable.funfarm,30000));
        mArraylistMonan.add(new Monan("Lava Coffee - Quang Trung","61 Quang Trung, P. 10, Gò Vấp, TP. HCM",R.drawable.lavacoffee,36000));
        mArraylistMonan.add(new Monan("Pizza Chảnh - Nguyễn Duy Cung","115/20 Nguyễn Duy Cung, Gò Vấp, TP. HCM",R.drawable.pizzachanh,54000));
        return mArraylistMonan;
    }
}
