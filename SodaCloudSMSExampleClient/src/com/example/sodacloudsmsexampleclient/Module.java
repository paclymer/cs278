package com.example.sodacloudsmsexampleclient;

import java.util.Map;

import org.magnum.soda.example.sms.SMSManager;
import org.magnum.soda.example.sms.SMSManagerImpl;

import android.content.Context;




/**
 * Asgn Step 4: Create an implementation of this interface
 * that creates a mapping of classes to specific object instances.
 * The goal of this module implementation will be to decouple the
 * use of the "components" from their creation. 
 * 
 */
public class Module {

	/**
	 * 
	 * This method returns the component that is bound to a given
	 * type.
	 * 
	 * @param type - type type of component to retrieve
	 * @return
	 */
	
	private QRCodeObjRefExtractor qrcode_;
	private SMSManagerImpl mgr_;
	
	public Module(SMSManagerImpl mgr, QRCodeObjRefExtractor qrcode) {
		mgr_ = mgr;
		qrcode_ = qrcode;
	}
	
	public <T> T getComponent(Class<T> type) {
		if(type == mgr_.getClass()) {
			return (T)mgr_;
		}
		return (T)qrcode_;
	}
	
	
	/**
	 * 
	 * Bind a component to a type.
	 * 
	 * @param type - the type to bind the component to
	 * @param component - the object instance to associate with the type key
	 */
	//public <T> void setComponent(Class<T> type, T component) {
	//	map.put(type.toString(), component);
	//}
	
}
