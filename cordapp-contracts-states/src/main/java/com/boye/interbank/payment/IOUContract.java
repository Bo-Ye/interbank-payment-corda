package com.boye.interbank.payment;

import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.Contract;
import net.corda.core.transactions.LedgerTransaction;

public class IOUContract implements Contract {
    public static final String IOU_CONTRACT_ID = "com.boye.interbank.payment.IOUContract";

    @Override
    public void verify(LedgerTransaction tx) {
    }

    public interface Commands extends CommandData {
        class Create implements Commands {
        }
    }
}