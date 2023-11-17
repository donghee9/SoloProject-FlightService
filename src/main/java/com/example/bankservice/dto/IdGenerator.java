package com.example.bankservice.dto;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private  static final AtomicInteger userId=new AtomicInteger(0);
    private  static final AtomicInteger accountId =new AtomicInteger(0);
    private  static final AtomicInteger bankStatementId=new AtomicInteger(0);

    public static int getNextUserId(){
        return userId.incrementAndGet();
    }
    public static int getNextAccountId(){
        return accountId.incrementAndGet();

    }

    public static int getBankStatementHistory() {
        return bankStatementId.incrementAndGet();
    }
}
