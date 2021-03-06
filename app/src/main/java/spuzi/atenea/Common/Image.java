package spuzi.atenea.Common;

/**
 * Created by spuzi on 23/03/2017.
 */

public class Image extends Data {

    private int width;
    private int height;

    public Image (){
        super();
        this.width = 0;
        this.height = 0;
    }

    public Image ( byte[] content , int width , int height ){
        super(content);
        this.width = width;
        this.height = height;
    }

    /** GETTERS Y SETTERS **/
    public int getWidth () {
        return width;
    }

    public void setWidth ( int width ) {
        this.width = width;
    }

    public int getHeight () {
        return height;
    }

    public void setHeight ( int height ) {
        this.height = height;
    }
}
