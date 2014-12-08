package musicrun.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

/**
 * Created by paulou on 12/7/14.
 */
public class BaseRestfulContorller {

    @Autowired
    public MongoOperations mongoOperations;

    public MongoOperations getMongoOperations(){
        return mongoOperations;
    }

    public void setMongoOperations(MongoOperations mongoOperations){
        this.mongoOperations = mongoOperations;
    }

}
