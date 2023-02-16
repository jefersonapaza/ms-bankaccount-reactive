package nttdata.bootcamp.quarkus.bankaccount.entity;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;

import java.util.Date;

public class Bankaccount extends ReactivePanacheMongoEntity {

    public String numberaccount;
    public Date openingdate;

    public String description;

    public Double amount ;

    public String mainaccount;
}
