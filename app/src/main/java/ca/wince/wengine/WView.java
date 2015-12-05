package ca.wince.wengine;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 This is the implimentation of GLSurfaceView from opengl es 2.0+
 */
public class WView extends GLSurfaceView{

    private final WRenderer wRenderer;

    public WView(Context context){
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        wRenderer = new WRenderer();

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(wRenderer);
    }

}
