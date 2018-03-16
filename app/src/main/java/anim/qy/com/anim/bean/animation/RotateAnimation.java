package anim.qy.com.anim.bean.animation;

import android.view.View;
import android.view.animation.BounceInterpolator;

import anim.qy.com.anim.bean.Anim;

/**
 * Created by Alter on 2018/3/13.
 */

public class RotateAnimation extends Anim {

    public RotateAnimation(int id, String name) {
        super(id, name);
    }

    @Override
    public void doAnim(View view) {
        super.doAnim(view);
        android.view.animation.RotateAnimation rotateAnimation =
                new android.view.animation.RotateAnimation(0.0f,360.0f,
                        view.getWidth()/2,view.getHeight()/2);
        rotateAnimation.setDuration(2000);
        rotateAnimation.setInterpolator(new BounceInterpolator());
        view.startAnimation(rotateAnimation);
    }
}
