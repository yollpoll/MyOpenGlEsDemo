package com.yollpoll.openglesdemo;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.opengles.GL10;

public class MyGLRenderer implements GLSurfaceView.Renderer {

//    public void onSurfaceCreated(GL10 unused, EGLConfig config) {
//        // Set the background frame color
//        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
//    }

    Triangle mTriangle;

    public void onDrawFrame(GL10 unused) {
        // Redraw background color
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        mTriangle.draw();
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, javax.microedition.khronos.egl.EGLConfig eglConfig) {
        mTriangle = new Triangle();
    }

    public void onSurfaceChanged(GL10 unused, int width, int height) {
//        GLES20.glViewport(0, 0, width, height);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    /**
     * 加载并编译着色器代码
     * 渲染器类型type={GLES20.GL_VERTEX_SHADER, GLES20.GL_FRAGMENT_SHADER}
     * 渲染器代码 GLSL
     */
    public static int loadShader(int type, String shaderCode) {

        int shader = GLES20.glCreateShader(type);
        //加载shader代码 glShaderSource 和 glCompileShader
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);

        return shader;
    }

}