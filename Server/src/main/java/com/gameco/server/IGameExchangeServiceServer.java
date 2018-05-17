
package com.gameco.server;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-06-03T01:53:06.363+04:00
 * Generated source version: 3.1.6
 * 
 */
 
public class IGameExchangeServiceServer{

    protected IGameExchangeServiceServer() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new com.gameco.server.GameExchangeService();
        String address = "http://localhost:9090/GameExchangeServicePort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new IGameExchangeServiceServer();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
 
 