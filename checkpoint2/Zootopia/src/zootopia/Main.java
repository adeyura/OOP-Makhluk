/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this templWate file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootopia;
/**
 *
 * @author Asus pc
 */
public class Main {
    private static Zootopia main;
    public static Zootopia getMain() {
        return main;
    }
    public static void main(String args[]) {
        main = new Zootopia();
        main.setVisible(true);
        main.setAlwaysOnTop(true);
    }
    
}
