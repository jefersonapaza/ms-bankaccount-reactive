package nttdata.bootcamp.quarkus.bankaccount.service;

import io.smallrye.mutiny.Multi;
import nttdata.bootcamp.quarkus.bankaccount.entity.Bankaccount;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BankAccountServiceImpl implements BankAccountService{


    @Override
    public Multi<Bankaccount> list() {
        return null;
    }
}
