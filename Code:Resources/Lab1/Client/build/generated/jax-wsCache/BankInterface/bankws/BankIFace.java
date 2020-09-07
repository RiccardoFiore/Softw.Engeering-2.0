
package bankws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankIFace", targetNamespace = "http://bankws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankIFace {


    /**
     * 
     * @param arg0
     * @return
     *     returns bankws.Operation
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOperationDetailsByID", targetNamespace = "http://bankws/", className = "bankws.GetOperationDetailsByID")
    @ResponseWrapper(localName = "getOperationDetailsByIDResponse", targetNamespace = "http://bankws/", className = "bankws.GetOperationDetailsByIDResponse")
    public Operation getOperationDetailsByID(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOperationsByClientID", targetNamespace = "http://bankws/", className = "bankws.GetOperationsByClientID")
    @ResponseWrapper(localName = "getOperationsByClientIDResponse", targetNamespace = "http://bankws/", className = "bankws.GetOperationsByClientIDResponse")
    public List<Integer> getOperationsByClientID(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}