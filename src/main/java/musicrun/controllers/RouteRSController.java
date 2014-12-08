package musicrun.controllers;

import musicrun.domain.MusicRoute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by paulou on 12/4/14.
 */
@RestController
public class RouteRSController extends BaseRestfulContorller{
/*
    @Autowired
    MusicRouteService musicRouteService;
*/
    @RequestMapping("saveRoute")
    public String saveRoute(@RequestParam(value="route") String route, @RequestParam(value="music") String music){
        MusicRoute musicRoute = new MusicRoute(route, music);
        mongoOperations.save(musicRoute);
        return "Saving Music Route with Route: " + route + " and Music: " + music;
    }
}
