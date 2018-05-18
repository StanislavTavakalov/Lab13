/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.music;

import by.bntu.fitr.povt.jit.lab13.model.exception.NotPositiveLenException;

/**
 *
 * @author Святослав
 */
public abstract class Music{

    private int len;
    private int damage;
    private String name;

    public Music() {
    }

    public Music(int len, int damage, String name) throws NotPositiveLenException {
        if (len > 0 && damage >= 0) {
            this.len = len;
            this.damage = damage;
            this.name = name;
        } else {
            throw new NotPositiveLenException();
        }

    }

    public int getLen() {
        return len;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setLen(int len) throws NotPositiveLenException {
        if (len > 0) {
            this.len = len;

        } else {
            throw new NotPositiveLenException();
        }
    }
    
    public String getLenInTimeFormat(){
        int minut = len/60;
        if(minut > 0){
            return minut + ":" + len%60;
        }
        return "0:" + len%60;
    }

//    @Override
//    public String toString() {
//        return "Music{" + "len=" + len + ", damage=" + damage + ", name=" + name + '}';
//    }

    
    @Override
    public String toString() {
        return "Music{" + "len=" + getLenInTimeFormat() + ", damage=" + damage + ", name=" + name + '}';
    }

    public abstract String play();

    /*
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
