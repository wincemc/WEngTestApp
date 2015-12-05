/*
    THIS IS THE ENGINE (Interface with android and opengl es 2.0+)
 */

package ca.wince.wengine;

import android.app.Activity;
import android.os.Bundle;

public abstract class WActivity extends Activity{

    //STARTING AND PAUSING APPLICATION
    /*
    onCreate() is called when the activity initialized, is the entrance to the activity.
    If the activity was in the paused state, onResume() will be called instead.
     */
    @Override
    public void onCreate(Bundle savedInstance){
        //Call Parent
        super.onCreate(savedInstance);

        //Start
        start();
    }

    /*
    onResume() is called when the activity initialized from the paused state.
    If the activity was dead, onCreate() will be called instead.
     */
    @Override
    public void onResume(){
        //Call Parent
        super.onResume();

        //Start
        start();
    }

    /*
    onPause() is called when the activity initialized from the paused state.
    If the activity was dead, onCreate() will be called instead.
     */
    @Override
    public void onPause(){
        //Call Parent
        super.onPause();

        //Pause
        stop();
    }

    //Ease of use functions
    public abstract void start();
    public abstract void stop();

    //END STARTING AND PAUSING APPLICATION
}

