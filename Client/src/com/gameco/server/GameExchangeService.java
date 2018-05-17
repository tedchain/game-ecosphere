package com.gameco.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-06-03T02:19:39.922+04:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "GameExchangeService", 
                  wsdlLocation = "file:/P:/prjct/GamesEcosystem/Server/src/main/webapp/wsdl/gameexchangeservice.wsdl",
                  targetNamespace = "http://server.gameco.com/") 
public class GameExchangeService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.gameco.com/", "GameExchangeService");
    public final static QName GameExchangeServicePort = new QName("http://server.gameco.com/", "GameExchangeServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/P:/prjct/GamesEcosystem/Server/src/main/webapp/wsdl/gameexchangeservice.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GameExchangeService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/P:/prjct/GamesEcosystem/Server/src/main/webapp/wsdl/gameexchangeservice.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GameExchangeService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GameExchangeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GameExchangeService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GameExchangeService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GameExchangeService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GameExchangeService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns IGameExchangeService
     */
    @WebEndpoint(name = "GameExchangeServicePort")
    public IGameExchangeService getGameExchangeServicePort() {
        return super.getPort(GameExchangeServicePort, IGameExchangeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IGameExchangeService
     */
    @WebEndpoint(name = "GameExchangeServicePort")
    public IGameExchangeService getGameExchangeServicePort(WebServiceFeature... features) {
        return super.getPort(GameExchangeServicePort, IGameExchangeService.class, features);
    }

}
