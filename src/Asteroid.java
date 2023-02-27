import GLOOP.*;
public class Asteroid{ 
    private GLKugel kugel1;
    //[...]

    public Asteroid(){
        kugel1 = new GLKugel(0,1000,0, 50, "src/img/Krater.jpg");
        //[...]
    }

    public void bewegeDich(){
        kugel1.verschiebe(0,-0.5,0);
        //[...]
    }

    //[...]
}
