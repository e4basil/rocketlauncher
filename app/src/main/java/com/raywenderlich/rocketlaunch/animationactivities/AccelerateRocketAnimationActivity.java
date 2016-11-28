package com.raywenderlich.rocketlaunch.animationactivities;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;

public class AccelerateRocketAnimationActivity extends BaseAnimationActivity {
    @Override
    protected void onStartAnimation() {
        ValueAnimator animator = ValueAnimator.ofFloat(0, -mScreenHeight);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value = (float) animation.getAnimatedValue();
                mRocket.setTranslationY(value);
            }
        });

        animator.setInterpolator(new AccelerateInterpolator(1.5f));
        animator.setDuration(DEFAULT_ANIMATION_DURATION);
        animator.start();
    }
}
