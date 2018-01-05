package monpkg.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import monpkg.entities.Counter;
import monpkg.services.BadCounter;
import monpkg.services.CounterManager;
import monpkg.services.CounterRemover;
import monpkg.services.MessageManager;

import org.junit.Assert;
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
        try {
			cm.createCounter2("C3", 10);
			//cm.createCounter("pan", -1);
		} catch (BadCounter e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Counter c = cm.getCounter("C1");
        //cm.createCounter("kevin", 100);
   
        Assert.assertTrue(10 == c.getValue());
    }
    
    

}