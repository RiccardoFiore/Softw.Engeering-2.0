
package edu.uniroma1.msecs.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ExamImplService", targetNamespace = "http://server.msecs.uniroma1.edu/", wsdlLocation = "http://localhost:8080/MovieDatabase?wsdl")
public class ExamImplService
    extends Service
{

    private final static URL EXAMIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EXAMIMPLSERVICE_EXCEPTION;
    private final static QName EXAMIMPLSERVICE_QNAME = new QName("http://server.msecs.uniroma1.edu/", "ExamImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/MovieDatabase?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXAMIMPLSERVICE_WSDL_LOCATION = url;
        EXAMIMPLSERVICE_EXCEPTION = e;
    }

    public ExamImplService() {
        super(__getWsdlLocation(), EXAMIMPLSERVICE_QNAME);
    }

    public ExamImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXAMIMPLSERVICE_QNAME, features);
    }

    public ExamImplService(URL wsdlLocation) {
        super(wsdlLocation, EXAMIMPLSERVICE_QNAME);
    }

    public ExamImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXAMIMPLSERVICE_QNAME, features);
    }

    public ExamImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExamImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Exam
     */
    @WebEndpoint(name = "ExamImplPort")
    public Exam getExamImplPort() {
        return super.getPort(new QName("http://server.msecs.uniroma1.edu/", "ExamImplPort"), Exam.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Exam
     */
    @WebEndpoint(name = "ExamImplPort")
    public Exam getExamImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.msecs.uniroma1.edu/", "ExamImplPort"), Exam.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXAMIMPLSERVICE_EXCEPTION!= null) {
            throw EXAMIMPLSERVICE_EXCEPTION;
        }
        return EXAMIMPLSERVICE_WSDL_LOCATION;
    }

}
