/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nok;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nitid
 */
@Stateless
public class ReceiveDetailFacade extends AbstractFacade<ReceiveDetail> {

    @PersistenceContext(unitName = "NokPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReceiveDetailFacade() {
        super(ReceiveDetail.class);
    }
    
}
