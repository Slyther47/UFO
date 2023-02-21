import GLOOP.*;
public class Ufo{
    private GLKugel UFO;


    public Ufo(){
        UFO = new GLKugel(0,0,0,50);

    }
 
    public void bewegeLinks(){
        UFO.verschiebe(-1,0,0);
    }

    public void bewegeRechts(){
        UFO.verschiebe(1,0,0);
    } 

    public void explodiere(){
        //[...]
    }

}
