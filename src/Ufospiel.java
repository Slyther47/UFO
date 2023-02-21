import GLOOP.*; 
public class Ufospiel{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo UFO;
    private Asteroid asteroid1,asteroid2,asteroid3;
    //[...]

    public Ufospiel(){
        kamera = new GLEntwicklerkamera(800,600);
        kamera.verschiebe(0,200,500);
        licht  = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        UFO = new Ufo();

        asteroid1 = new Asteroid();
        //[...]
        
        fuehreAus();
    }

    public void fuehreAus(){
        while(!tastatur.esc()){           
            asteroid1.bewegeDich();
            if (tastatur.links())
                UFO.bewegeLinks();
            if (tastatur.rechts())
                UFO.bewegeRechts();

            Sys.warte();
        }
        Sys.beenden(); 
    }

}
