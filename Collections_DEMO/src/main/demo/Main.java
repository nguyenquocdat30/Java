/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.demo;

import collections.demo.*;
/**
 *
 * @author BOE
 */
public class Main {
    public static void main(String[] args)
    {
        ArrayListExample app = new ArrayListExample();
        app.AddDS();
        app.ViewDS();
        app.ChangeDS(2,"B2");
        app.ViewDS();
        app.DeleteDS(0);
        app.ViewDS();
    }
}
