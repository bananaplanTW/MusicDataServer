package musicrun.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by paulou on 12/6/14.
 */
@Document(collection = "MusicRoute")
public class MusicRoute {
    @Id
    private String id;

    private String route;

    private String music;

    public MusicRoute(){};

    public MusicRoute(String route, String music){
        this.route = route;
        this.music = music;
    }

    public void setRoute(String route){
        this.route = route;
    }
    public String getRoute(){
        return this.route;
    }
    public void setMusic(String music){
        this.music = music;
    }
    public String getMusic(){
        return this.music;
    }
}
