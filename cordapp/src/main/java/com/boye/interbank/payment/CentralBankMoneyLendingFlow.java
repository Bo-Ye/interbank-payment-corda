package com.boye.interbank.payment;

import co.paralleluniverse.fibers.Suspendable;
import net.corda.core.flows.*;
import net.corda.core.transactions.SignedTransaction;
import net.corda.core.utilities.ProgressTracker;

public class CentralBankMoneyLendingFlow {
    @InitiatingFlow
    @StartableByRPC
    public static class Initiator extends FlowLogic<SignedTransaction> {
        private ProgressTracker progressTracker = new ProgressTracker();

        @Suspendable
        @Override
        public SignedTransaction call() {
            return null;
        }

        @Override
        public ProgressTracker getProgressTracker() {
            return progressTracker;
        }
    }

    @InitiatedBy(Initiator.class)
    public static class Responder extends FlowLogic<SignedTransaction> {
        private FlowSession counterpartySession;

        public Responder(FlowSession counterpartySession) {
            this.counterpartySession = counterpartySession;
        }

        @Suspendable
        @Override
        public SignedTransaction call() {
            return null;
        }
    }
}
