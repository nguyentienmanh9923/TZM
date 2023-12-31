/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import validation.Check;

/**
 *
 * @author Dell
 */
public class TwoLegNoFly extends Animal {

    static final String FLY = "No Fly";
    public int swings;

    public TwoLegNoFly() {
        id = "";
        name = "";
        leg = 2;
        swings = 2;
        weight = 0;
        characteristic = "";
    }

    public TwoLegNoFly(String id, String name, double weight, String characteristic) {
        super(id, name, 2, weight, characteristic);
        this.swings = 2;
    }

    public int getSwings() {
        return swings;
    }

    public void setSwings(int swings) {
        this.swings = swings;
    }

    @Override
    public void input() {
        name = Check.getAName("Enter animal's Name: ", "Name has just alphabet, please !!!").trim();
        weight = Check.getADouble("Enter animal's Weight: ",
                "Weight's Animal is a positive number and in 0-5000kg, please !!!", 0, 5000);
        characteristic = Check.getAName("Enter animal's Characteristic: ",
                "Don't have any special character, please !!!").trim();
    }

    @Override
    public void showinfo() {
        String msg = new String();
        msg = String.format("|%-10s|%-15s|%5d|%30s|%14.2f|%15d|%10s|",
                id, name, leg, characteristic, weight, swings, FLY);
        System.out.println(msg);
    }

    @Override
    public String toStringMySelf() {
        return id + ";" + name + ";" + leg + ";" + characteristic + ";" + weight + ";" + swings + ";" + FLY;
    }

}
