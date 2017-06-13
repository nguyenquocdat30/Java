/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.demo;
import java.util.ArrayList;
/**
 *
 * @author BOE
 */
public class ArrayListExample {
    private ArrayList<String> dsNhanVien;
    public ArrayListExample()
    {
        dsNhanVien = new ArrayList<String>();
    }
    public void AddDS()
    {
        for(int i= 0; i<10;i++)
        {
            dsNhanVien.add("A"+i);
        }
    }
    public void ViewDS()
    {
        System.out.println();
        for(int i=0;i<dsNhanVien.size();i++)
        {
            System.out.print(dsNhanVien.get(i)+"\t");
        }
    }
    public void ChangeDS(int index,String str)
    {
        dsNhanVien.set(index,str);
    }
    public void DeleteDS(int index)
    {
        dsNhanVien.remove(index);
    }
}
