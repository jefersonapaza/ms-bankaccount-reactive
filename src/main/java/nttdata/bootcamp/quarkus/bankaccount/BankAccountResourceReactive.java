package nttdata.bootcamp.quarkus.bankaccount;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import nttdata.bootcamp.quarkus.bankaccount.dto.BankaccountSaveDTO;
import nttdata.bootcamp.quarkus.bankaccount.entity.Bankaccount;
import nttdata.bootcamp.quarkus.bankaccount.service.BankAccountService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@Path("/api/bankaccount")
public class BankAccountResourceReactive {

    @Inject
    private BankAccountService service;



    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<Bankaccount> getAllBankAccount() {
        return service.listAll();
    }


    @GET
    @Path("/all2")
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<Bankaccount> getAllBankAccount2() {
        return service.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Bankaccount> getByNumberAccount(@QueryParam("number") String number) {
        return service.getByNumberAccount(number);
    }

    @POST
    @Path("/saveaccount")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Bankaccount> saveBankAccount(BankaccountSaveDTO bankaccountSaveDTO) {
        return service.saveBankAccount(bankaccountSaveDTO);
    }


    @PUT
    @Path("update/{id}")
    public Uni<Bankaccount>  updateBankAccount(@PathParam("id") String id,Bankaccount bankaccount) {
        return service.updateBankAccountById(id,bankaccount);
    }

    @DELETE
    @Path("{id}")
    public Uni<Boolean> deleteBankAccount(@PathParam("id") String id) {
        return service.deleteBankAccountById(id);
    }




}
