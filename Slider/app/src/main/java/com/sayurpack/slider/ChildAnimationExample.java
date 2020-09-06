package com.sayurpack.slider;

import android.view.View;

import com.daimajia.slider.library.Animations.BaseAnimationInterface;

public class ChildAnimationExample implements BaseAnimationInterface {
    @Override
    public void onPrepareCurrentItemLeaveScreen(View current) {
        current.findViewById(com.daimajia.slider.library.R.id.description_layout).setVisibility(View.INVISIBLE);
    }

    @Override
    public void onPrepareNextItemShowInScreen(View next) {
        next.findViewById(com.daimajia.slider.library.R.id.description_layout).setVisibility(View.INVISIBLE);
    }

    @Override
    public void onCurrentItemDisappear(View view) {

    }

    @Override
    public void onNextItemAppear(View view) {
        view.findViewById(com.daimajia.slider.library.R.id.description_layout).setVisibility(View.INVISIBLE);
    }
}
