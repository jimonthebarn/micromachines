package com.mircomachines;

import java.io.Serializable;

public abstract class Command implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String tenant;
	
	public Command(String tenant) {
		super();
		this.tenant = tenant;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	
	public abstract String key();
	
	

}
