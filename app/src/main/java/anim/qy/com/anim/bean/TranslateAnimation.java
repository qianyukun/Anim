package anim.qy.com.anim.bean;

import android.view.View;
import android.view.animation.BounceInterpolator;

/**
 * Created by Alter on 2018/3/13.
 */

public class TranslateAnimation extends Anim{

    public TranslateAnimation(int id, String name) {
        super(id, name);
    }

    @Override
    public void doAnim(View view) {
        super.doAnim(view);
        android.view.animation.TranslateAnimation translateAnimation =
                new android.view.animation.TranslateAnimation(1.0f,view.getWidth(),0.0f,0.0f);
        translateAnimation.setDuration(2000);
        translateAnimation.setInterpolator(new BounceInterpolator());
        view.startAnimation(translateAnimation);
    }
}
