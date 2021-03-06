package com.boye.interbank.payment;

import com.google.common.collect.ImmutableList;
import net.corda.testing.node.MockNetwork;
import net.corda.testing.node.StartedMockNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FlowTests {
    private MockNetwork network;
    private StartedMockNode a;
    private StartedMockNode b;

    @Before
    public void setup() {
        network = new MockNetwork(ImmutableList.of("com.boye.interbank.payment"));
        a = network.createNode();
        b = network.createNode();
        a.registerInitiatedFlow(CentralBankMoneyLendingFlow.Responder.class);
        b.registerInitiatedFlow(CentralBankMoneyLendingFlow.Responder.class);
        network.runNetwork();
    }

    @After
    public void tearDown() {
        network.stopNodes();
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void test() throws Exception {

    }
}
