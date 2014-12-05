package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by paulou on 12/4/14.
 */
@RestController
public class RouteRSController {

    @RequestMapping("saveRoute")
    public String saveRoute(){
        return "saving route..";
    }
}
