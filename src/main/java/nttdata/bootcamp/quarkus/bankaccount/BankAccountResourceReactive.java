package nttdata.bootcamp.quarkus.bankaccount;

import entity.Comment;
import io.smallrye.mutiny.Multi;
import nttdata.bootcamp.quarkus.bankaccount.entity.Bankaccount;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/clients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BankAccountResourceReactive {



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<Bankaccount> list() {
        return Comment.streamAllComments();
    }

}
