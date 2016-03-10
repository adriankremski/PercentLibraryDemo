package com.github.snuffix.percentdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @Bind(R.id.title)
    TextView titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        titleView.setText("Percent library demo");
    }

    @OnClick(R.id.linear)
    public void linerLayoutCase() {
        startActivity(new Intent(this, LinearLayoutActivity.class));
    }

    @OnClick(R.id.percent_frame)
    public void percentFrameCase() {
        startActivity(new Intent(this, PercentFrameLayoutActivity.class));
    }

    @OnClick(R.id.percent_relative)
    public void percentRelativeCase() {
        startActivity(new Intent(this, PercentRelativeLayoutActivity.class));
    }
}
