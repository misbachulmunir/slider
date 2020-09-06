package com.sayurpack.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Display;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener {
    SliderLayout sliderLayout;

List<Model> list = new ArrayList<>();
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sliderLayout= findViewById(R.id.idslider);
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.RotateDown);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setCustomAnimation(new ChildAnimationExample());
        sliderLayout.setDuration(2000);
        sliderLayout.removeAllSliders();
        list.clear();
        Model model1 = new Model();
        Model model2 = new Model();
        Model model3 = new Model();
        model1.setUrl("https://cdn.jpegmini.com/user/images/slider_puffin_jpegmini_mobile.jpg");
        model3.setUrl("https://www.talkwalker.com/images/2020/blog-headers/image-analysis.png");
        model2.setUrl("https://helpx.adobe.com/content/dam/help/en/stock/how-to/visual-reverse-image-search/jcr_content/main-pars/image/visual-reverse-image-search-v2_intro.jpg");
        list.add(model1);
        list.add(model3);
        list.add(model2);

try {
    for (int i = 0; i < list.size(); i++) {
        TextSliderView textSliderView = new TextSliderView(MainActivity.this);
        Log.d(TAG, "onCreate: "+list.get(i).getUrl());
        textSliderView.description("Gambar"+i).image(list.get(i).getUrl()).setScaleType(BaseSliderView.ScaleType.Fit).setOnSliderClickListener(MainActivity.this);
        sliderLayout.addSlider(textSliderView);
    }
}catch (Exception e){

}



    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }
}