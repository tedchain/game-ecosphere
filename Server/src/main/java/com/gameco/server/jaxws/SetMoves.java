
package com.gameco.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.6
 * Fri Jun 03 01:53:05 SAMT 2016
 * Generated source version: 3.1.6
 */

@XmlRootElement(name = "setMoves", namespace = "http://server.gameco.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setMoves", namespace = "http://server.gameco.com/")

public class SetMoves {

    @XmlElement(name = "arg0")
    private com.gameco.game.GameHistory arg0;

    public com.gameco.game.GameHistory getArg0() {
        return this.arg0;
    }

    public void setArg0(com.gameco.game.GameHistory newArg0)  {
        this.arg0 = newArg0;
    }

}

