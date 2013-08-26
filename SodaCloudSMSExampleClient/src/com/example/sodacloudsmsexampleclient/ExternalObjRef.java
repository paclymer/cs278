package com.example.sodacloudsmsexampleclient;

import org.magnum.soda.proxy.ObjRef;


/**
 * Asgn Step 6: Create an implementation of this
 * interface.
 * 
 */
public class ExternalObjRef {

	private ObjRef oref_;
	private String server_;
	
	public ExternalObjRef(ObjRef oref, String server) {
		oref_ = oref;
		server_ = server;
	}
	
	public ObjRef getObjRef() {
		return oref_;
	}
	
	public String getPubSubHost() {
		return server_;
	}
		
	/**
	 * The toString() implementation should return
	 * a String in the following format:
	 * 
	 * getPubSubHost()+"|"+getObjRef().getUri()
	 * 
	 * 
	 * @return
	 */
	public String toString() {
		return getPubSubHost() + "|" + getObjRef().getUri();
	}
	
}
