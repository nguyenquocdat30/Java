/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author BOE
 */
public class BaiHat {
    private String maSo;
    private String tenBai;
    private String tacGia;

    /**
     * @return the maSo
     */
    public String getMaSo() {
        return maSo;
    }

    /**
     * @param maSo the maSo to set
     */
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    /**
     * @return the tenBai
     */
    public String getTenBai() {
        return tenBai;
    }

    /**
     * @param tenBai the tenBai to set
     */
    public void setTenBai(String tenBai) {
        this.tenBai = tenBai;
    }

    /**
     * @return the tacGia
     */
    public String getTacGia() {
        return tacGia;
    }

    /**
     * @param tacGia the tacGia to set
     */
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    
    public BaiHat()
    {
        this.setMaSo("65712");
        this.setTenBai("Con Co Be Be");
        this.setTacGia("Xuan Mai");
    }
    public BaiHat(String maSo,String tenBai,String tacGia)
    {
        this.setMaSo(maSo);
        this.setTenBai(tenBai);
        this.setTacGia(tacGia);
    }
    public void ShowBaiHat()
    {
        System.out.println(this.getMaSo()+"-"+this.getTenBai()+"-"+this.getTacGia());
    }
}
