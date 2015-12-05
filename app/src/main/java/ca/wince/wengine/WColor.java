package ca.wince.wengine;

import android.util.Log;

/**
 * Intended to allow simple color_creation for the end user. Parsed into four floats:
 * Red, Green, Blue, Alpha. All are between 0 and 1.
 *
 * For instance solid red could be (1, 0, 0, 1)
 */
public class WColor{

    //MEMBER VARS
    //Store rgba format
    private float red, green, blue, alpha;

    //CONSTRUCTORS
    /*
      Default - Sets color to white
     */
    public WColor(){
        //Set White
        red = green = blue = 1;

        //Solid
        alpha = 1;
    }

    /*
      Parses hex color
      @color - Hex color integer between 0x000000 and 0xFFFFFFFF (RGB)
     */
    public WColor(int color){

        //Ensure Color is in range
        if(color < 0 || color > 0xFFFFFFFF){
            Log.d("WColor", "Color value: " + color + "could not be parsed. Out Of Range");
            color = 0;
        }

        //Parse Color
        red = ((float)(color >> 16 & 0xFF)) / 255;
        green = ((float)(color >> 8 & 0xFF)) / 255;
        blue = ((float)(color & 0xFF)) / 255;

        //Solid
        alpha = 1;
    }

    /*
      Parses hex color and sets alpha
      @color - Hex color integer between 0x000000 and 0xFFFFFF
      @alpha - Alpha float between 0.0f and 1.0f
     */
    public WColor(int color, float alpha){

        //Parse and Set Color
        this(color);

        //Solid
        this.alpha = alpha;
    }

    /*
      Parses hex color and sets alpha
      @color - Hex color integer between 0x000000 and 0xFFFFFF
      @alpha - Alpha int between 1 and 255 (else 255)
     */
    public WColor(int color, int alpha){

        //Parse and Set Color
        this(color);


        //Ensure in range
        if(alpha < 1 || alpha > 255){
            Log.d("WColor", "Alpha value: " + alpha + "could not be parsed. Out Of Range");
            alpha = 255;
        }

        //Solid
        this.alpha = ((float)(alpha & 0xFF)) / 255;
    }

    //END CONSTRUCTORS

    //GETTERS AND SETTERS
    public float getRed() {
        return red;
    }

    public float getGreen() {
        return green;
    }

    public float getAlpha() {
        return alpha;
    }

    public float getBlue() {
        return blue;
    }
    //END GETTERS AND SETTERS
}
