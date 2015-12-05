package ca.wince.wengine;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.opengl.GLSurfaceView;

import ca.wince.wengtestapp.R;

/**
 This is the implimentation of GLSurfaceView from opengl es 2.0+
 */
public class WView extends GLSurfaceView{

    //MEMBER VARS
    //Renderer
    private final WRenderer wRenderer;
    //END MEMBER VARS

    //CONSTRUCTORS
    public WView(Context context){
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        //Initialize Renderer
        wRenderer = new WRenderer();

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(wRenderer);

        // Render the view only when there is a change in the drawing data
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
    //END CONSTRUCTORS
}
