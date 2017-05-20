package com.finepointstudios.roomdb2;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by danielmalone on 5/20/17.
 */

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    private int asdf;

    @ColumnInfo(name = "first_name")
    private String firstName;

    public int getAsdf() {
        return asdf;
    }

    public void setAsdf(int asdf) {
        this.asdf = asdf;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
