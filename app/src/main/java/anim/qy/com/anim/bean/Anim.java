package anim.qy.com.anim.bean;

import android.view.View;

/**
 * Created by Alter on 2018/3/13.
 */

public class Anim {
    private int id;
    private String name;

    public Anim(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void doAnim(View view ){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
