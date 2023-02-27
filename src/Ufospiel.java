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
            if (tastatur.links() && UFO.gibX() > -600) {
                UFO.bewegeLinks();
            }
            if (tastatur.rechts() && UFO.gibX() < 600) {
                UFO.bewegeRechts();
            }
            if (tastatur.oben() && UFO.gibY() < 700){
                UFO.bewegeHoch();
            }
            if (tastatur.unten() && UFO.gibY() > -300){
                UFO.bewegeRunter();
            }
            Sys.warte();
        }
        Sys.beenden(); 
    }

}
