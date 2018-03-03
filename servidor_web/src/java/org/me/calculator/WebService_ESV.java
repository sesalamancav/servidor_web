/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Estudiantes
 */
@WebService(serviceName = "WebService_ESV")
@Stateless()
public class WebService_ESV {


    /**
     * Web service operation
     * @param rx
     * @param tx
     * @return 
     */
    @WebMethod(operationName = "operation")
    public int operation(@WebParam(name = "rx") int rx, @WebParam(name = "tx") int tx) {
        //TODO write your implementation code here:
         int k = rx + tx;
        return k;
    }
    
    
}
