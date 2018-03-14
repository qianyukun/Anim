package anim.qy.com.anim.bean;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;

/**
 * Created by Alter on 2018/3/13.
 */

public class ScaleAnimation extends Anim{

    public ScaleAnimation(int id, String name) {
        super(id, name);
    }

    @Override
    public void doAnim(View view) {
        super.doAnim(view);
        android.view.animation.ScaleAnimation scaleAnimation =
                new android.view.animation.ScaleAnimation(
                0.1f, 1.0f, // Start and end values for the X axis scaling
                0.1f, 1.0f, // Start and end values for the Y axis scaling
                Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(2000);
        scaleAnimation.setInterpolator(new BounceInterpolator());
        view.startAnimation(scaleAnimation);
    }
}
