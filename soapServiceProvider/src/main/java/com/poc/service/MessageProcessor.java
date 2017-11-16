package com.poc.service;

import org.apache.camel.Exchange;

import com.redhat.gpe.training.Customer;
import com.redhat.gpe.training.SaveCustomer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageProcessor {
	private static final Logger log = LoggerFactory.getLogger(MessageProcessor.class);

	public void processPayload(Exchange exchange) {
		log.info("MessageProcessor | processPayload() | Entry");
		Object obj = exchange.getIn().getBody();
		log.info("MessageProcessor | processPayload() | received payload :: ", obj);
		SaveCustomer saveCustomer = (SaveCustomer) obj;
		Customer customer = saveCustomer.getCustomer();
		log.info("MessageProcessor | Customer Name:: {}", customer.getName());
		log.info("MessageProcessor | Customer DOB:: {}", customer.getBirthDate());
		log.info("MessageProcessor | Customer Reveneue:: {}", customer.getRevenue());
		log.info("MessageProcessor | Exiting now.");
	}

}
