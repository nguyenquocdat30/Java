/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.BaiHat;
import java.util.ArrayList;
/**
 *
 * @author BOE
 */
public class DsBaiHat {
    private ArrayList<BaiHat> DsKara;
    public DsBaiHat()
    {
        DsKara = new ArrayList<BaiHat>();
    }
    public void ThemBaiHat(String maBai,String tenBai,String tacGia)
    {
        BaiHat e = new BaiHat(maBai,tenBai,tacGia);
        DsKara.add(e);
    }
    public void InsertBaiHat(BaiHat e)
    {
        DsKara.add(e);
    }
    public void DeleteBaiHat(String maSo)
    {
        BaiHat temp = null;
        for(int i=0;i<DsKara.size();i++)
        {
            temp =  DsKara.get(i);
            if(temp.getMaSo() == maSo)
            {
                break;
            }
        }
        DsKara.remove(temp);
    }
    public void ShowBaiHat()
    {
        for(int i=0;i<DsKara.size();i++)
        {
            BaiHat temp =  DsKara.get(i);
            temp.ShowBaiHat();
        }
    }
}
