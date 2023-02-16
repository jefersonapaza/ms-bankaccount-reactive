package nttdata.bootcamp.quarkus.bankaccount.service;

import io.smallrye.mutiny.Multi;
import nttdata.bootcamp.quarkus.bankaccount.entity.Bankaccount;

public interface BankAccountService {

    public Multi<Bankaccount> list();


}
