package com.base.data;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

	private CustomerContextHolder contextHolder;

	@Override
	protected Object determineCurrentLookupKey() {
		return contextHolder.getCustomerType();
	}

	public CustomerContextHolder getContextHolder() {
		return contextHolder;
	}

	public void setContextHolder(CustomerContextHolder contextHolder) {
		this.contextHolder = contextHolder;
	}

}
