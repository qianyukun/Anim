package anim.qy.com.anim.bean;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;

/**
 * Created by Alter on 2018/3/13.
 */

public class CombainAnimation extends Anim{

    public CombainAnimation(int id, String name) {
        super(id, name);
    }

    @Override
    public void doAnim(View view) {
        super.doAnim(view);
        android.view.animation.AlphaAnimation alphaAnimation =
                new android.view.animation.AlphaAnimation(0.0f,1.0f);
        alphaAnimation.setDuration(2000);


        android.view.animation.TranslateAnimation translateAnimation =
                new android.view.animation.TranslateAnimation(1.0f,view.getWidth(),0.0f,0.0f);
        translateAnimation.setDuration(2000);


        android.view.animation.RotateAnimation rotateAnimation =
                new android.view.animation.RotateAnimation(0.0f,360.0f,
                        view.getWidth()/2,view.getHeight()/2);
        rotateAnimation.setDuration(2000);

        android.view.animation.ScaleAnimation scaleAnimation =
                new android.view.animation.ScaleAnimation(
                        0.1f, 1.0f, // Start and end values for the X axis scaling
                        0.1f, 1.0f, // Start and end values for the Y axis scaling
                        Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                        Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(2000);

        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new BounceInterpolator());
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(scaleAnimation);

        view.startAnimation(animationSet);
    }
}
