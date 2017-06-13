/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.DsBaiHat;
import DTO.BaiHat;
/**
 *
 * @author BOE
 */
public class Main {
    public static void main(String[] args)
    {
        BLL.DsBaiHat app = new BLL.DsBaiHat();
        app.ThemBaiHat("65782","Con Cá Ăn Con Voi","Quốc Đạt");
        app.ThemBaiHat("78928","Con Vịt Con Gà","YuRa");
        app.ThemBaiHat("89931","Cá Vàng Bơi Bơi Bơi","Trọng Nhân");
        app.ThemBaiHat("98371","Con Vịt","Phước Doãn");
        app.ThemBaiHat("71829","Xanh Xanh","Hoài Tiên");
        app.ShowBaiHat();
        app.DeleteBaiHat("98371");
        System.out.println("============DS SAU KHI XOA===========");
        app.ShowBaiHat();
    }
}
