/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.openshiftexample;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author sb
 */
@Stateless
@Path("/suma")
public class sumarest {
    @GET
    @Path("/sumar/{msg}/{msg2}")
    public String sumarNumerosGet(@PathParam("msg") long msg, @PathParam("msg2") long msg2) {
        return Long.toString($sumarNumerosGet(msg, msg2));
    }

    long $sumarNumerosGet(long msg, long msg2) {
        return msg + msg2;
    }
}
