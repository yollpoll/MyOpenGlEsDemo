package com.yollpoll.openglesdemo;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class MainActivity2 extends Activity {
    private GLSurfaceView mGLView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGLView=new MyGLSurfaceView(this);
        setContentView(mGLView);
    }
}
