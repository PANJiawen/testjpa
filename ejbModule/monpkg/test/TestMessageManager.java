package monpkg.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import monpkg.entities.Counter;
import monpkg.services.CounterManager;
import monpkg.services.MessageManager;
import org.junit.Test;

public class TestMessageManager {

//    @EJB
//    MessageManager messageManager;
    @EJB
    CounterManager cm;

    public TestMessageManager() throws Exception {
        EJBContainer.createEJBContainer().getContext().bind("inject", this);
        //assertNotNull(messageManager);
        assertNotNull(cm);
    }

//    @Test
//    public void testAddMessage() throws Exception {
//        messageManager.addMessage("Hello");
//        messageManager.addMessage("Salut");
//    	 // messageManager.check();
//    }
    


    @Test
    public void testCounterManager() {
        assertNotNull(cm);
        cm.createCounter("C1", 10);
        Counter c = cm.getCounter("C1");
        assertTrue(10 == c.getValue());
    }

}