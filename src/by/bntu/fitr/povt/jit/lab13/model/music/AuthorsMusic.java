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
public class AuthorsMusic extends Music {

    private String author;

    public AuthorsMusic() {
    }

    public AuthorsMusic(String author, int len, int damage, String name) throws NotPositiveLenException {
        super(len, damage, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    @Override
//    public String toString() {
//        return "AuthorsMusic{" + "len=" + getLen() + ", damage=" + getDamage()
//                + ", name=" + getName() + ", author=" + author + '}';
//    }
    
    @Override
    public String toString() {
        return "AuthorsMusic{" + "len=" + getLenInTimeFormat() + ", damage=" + getDamage()
                + ", name=" + getName() + ", author=" + author + '}';
    }

    @Override
    public String play() {
        return "Play AuthorsMusic!";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.author);
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
        final AuthorsMusic other = (AuthorsMusic) obj;
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }

    
}
