package anim.qy.com.anim.bean.animator;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;

import com.orhanobut.logger.Logger;

import anim.qy.com.anim.bean.Anim;

/**
 * Created by Alter on 2018/3/15.
 */

public class ObjectAnimatorAnim extends Anim{
    public ObjectAnimatorAnim(int id, String name) {
        super(id, name);
    }

    @Override
    public void doAnim(final View view) {
        super.doAnim(view);
        //纵向翻页
        ObjectAnimator alphaAnimator =ObjectAnimator.ofFloat(view,"alpha",0.0f,1.0f);
        alphaAnimator.setDuration(1000);
        alphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float alpha = (float) animation.getAnimatedValue("alpha");
                Logger.d(alpha);
            }
        });

        ObjectAnimator rotationXAnimator = ObjectAnimator.ofFloat(view,"rotationX",-60.0f,0.0f);
        rotationXAnimator.setDuration(1000);
        rotationXAnimator.setInterpolator(new BounceInterpolator());
        rotationXAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                view.setPivotY(0.0f);
            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });


        //横向翻页

        final ObjectAnimator rotationYAnimator = ObjectAnimator.ofFloat(view,"rotationY",-60.0f,0.0f);
        rotationYAnimator.setDuration(1000);


        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(alphaAnimator,rotationXAnimator);
        animatorSet.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                view.setPivotX(0.0f);
                rotationYAnimator.start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        animatorSet.start();
    }
}
