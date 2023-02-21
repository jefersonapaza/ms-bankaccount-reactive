package nttdata.bootcamp.quarkus.bankaccount.repository;


import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import nttdata.bootcamp.quarkus.bankaccount.entity.Bankaccount;
import org.bson.types.ObjectId;

import jakarta.enterprise.context.ApplicationScoped;



@ApplicationScoped
public class BankaccountRepository implements ReactivePanacheMongoRepository<Bankaccount> {

    public Uni<Bankaccount> findByNumberaccount(String numberAccount) {
        //   return find("numberaccount", numberAccount).firstResult();
        return stream("numberaccount", numberAccount).toUni();
    }

    public Multi<Bankaccount> listAllBankAccounts() {
        return streamAll();
    }

    public Uni<Bankaccount> saveBankAccount(Bankaccount bankaccount) {
        return persist(bankaccount);
    }

    public Uni<Bankaccount> updateBankAccount(String id, Bankaccount bankaccount) {
        bankaccount.setId(new ObjectId(id));
        return update(bankaccount);
    }


    public Uni<Boolean> deleteById(String id){

        Uni<Bankaccount> bankaccountUni = findById(new ObjectId(id));
        return bankaccountUni.map( bankaccount -> {
            bankaccount.setEstadotarjeta("D");
            update(bankaccount);
            Boolean a = true;
            return a;
        });

    }






}
