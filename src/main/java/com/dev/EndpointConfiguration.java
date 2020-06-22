package com.dev;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dev.endpoints.IssuerWebServiceSoapImpl;

@Configuration
public class EndpointConfiguration {

	
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, new IssuerWebServiceSoapImpl());
		endpoint.publish("/IssuerWebServiceSoap");
		
		return endpoint;
	}
	
}
