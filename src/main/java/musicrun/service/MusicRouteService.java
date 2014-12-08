package musicrun.service;

import musicrun.domain.MusicRoute;
import org.springframework.stereotype.Component;

/**
 * Created by paulou on 12/7/14.
 */
@Component
public interface MusicRouteService{
    public MusicRoute findByRoute(String route);
}
