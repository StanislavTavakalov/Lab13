/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.music;

import by.bntu.fitr.povt.jit.lab13.model.exception.NotPositiveLenException;
import java.util.Objects;

/**
 *
 * @author Святослав
 */
public class FolkMusic extends Music {

    private String folk;

    public FolkMusic() {
    }

    public FolkMusic(String folk, int len, int damage, String name) throws NotPositiveLenException {
        super(len, damage, name);
        this.folk = folk;
    }

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

//    @Override
//    public String toString() {
//        return "FolkMusic{" + "len=" + getLen() + ", damage=" + getDamage()
//                + ", name=" + getName() + ", folk=" + folk + '}';
//    }
    
    @Override
    public String toString() {
        return "FolkMusic{" + "len=" + getLenInTimeFormat()+ ", damage=" + getDamage()
                + ", name=" + getName() + ", folk=" + folk + '}';
    }

    @Override
    public String play() {
        return "Play Folk!";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.folk);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FolkMusic other = (FolkMusic) obj;
        if (!Objects.equals(this.folk, other.folk)) {
            return false;
        }
        return true;
    }
    
    

}
