package devoir.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import org.junit.Assert;
import org.junit.Test;

import devoir.services.Services;

public class ClientTest {


    @EJB
    Services sr;


    public ClientTest() throws Exception {
        EJBContainer.createEJBContainer().getContext().bind("inject", this);
        assertNotNull(sr);
    }

    @Test
    public void testCounterManager() {

    	sr.createActivity("Bonjour",2);
    }
    
    

}