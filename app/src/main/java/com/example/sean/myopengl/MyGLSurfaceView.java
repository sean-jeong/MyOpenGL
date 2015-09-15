package com.example.sean.myopengl;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by sean on 9/15/15.
 */
public class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        mRenderer = new MyGLRenderer();

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer);

        // Render the view only when there is a change in the drawing area
        // This setting prevents the GLSurfaceView frame from being redrawn until you call requestRender(),
        // which is more efficient for this sample app
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

    }





}
