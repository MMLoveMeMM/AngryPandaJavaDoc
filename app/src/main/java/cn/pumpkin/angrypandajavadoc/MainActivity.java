package cn.pumpkin.angrypandajavadoc;

import android.app.Activity;
import android.os.Bundle;

import cn.pumpkin.angrypandajavadoc.utils.Tools;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int nums = Tools.addSum(11,22);

    }
}
