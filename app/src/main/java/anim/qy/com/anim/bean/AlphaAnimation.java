package anim.qy.com.anim.bean;

import android.view.View;

/**
 * Created by Alter on 2018/3/13.
 */

public class AlphaAnimation extends Anim{

    public AlphaAnimation(int id, String name) {
        super(id, name);
    }

    @Override
    public void doAnim(View view) {
        super.doAnim(view);
        android.view.animation.AlphaAnimation alphaAnimation =
                new android.view.animation.AlphaAnimation(0.0f,1.0f);
        alphaAnimation.setDuration(2000);
        view.startAnimation(alphaAnimation);
    }
}
