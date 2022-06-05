

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GabrielLuiz
 */

public class Series {
    
    private String serieName;
       private String serieEpisode;

    public String getSerieName() {
        return serieName;
    }

    public void setSerieName(String serieName) {
        this.serieName = serieName;
    }

    public String getSerieEpisode() {
        return serieEpisode;
    }

    public void setSerieEpisode(String serieEpisode) {
        this.serieEpisode = serieEpisode;
    }
    
    public String save(){
    
        try {
        
            FileWriter fw = new FileWriter("series.txt",true);
            PrintWriter pw = new PrintWriter(fw);
       
            pw.println("Serie "+this.serieName);
            pw.println("Episode "+this.serieEpisode);
            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(Series.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            return "Save :)" ;
    
    }
}
