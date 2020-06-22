package com.dev.endpoints;

import https.paysecure.merchant.CallPaySecure;
import https.paysecure.merchant.CallPaySecureResponse;
import https.paysecure.merchant_soap.IssuerWebServiceSoap;
import https.paysecure.merchant_soap.RequestorCredentials;

public class IssuerWebServiceSoapImpl implements IssuerWebServiceSoap {

	@Override
	public String versionInfo() {
		String v = "1.0.0";
		return v;
	}

	@Override
	public CallPaySecureResponse callPaySecure(RequestorCredentials requestorCredentials, CallPaySecure parameters) {
		CallPaySecureResponse response = new CallPaySecureResponse();
		response.setCallPaySecureResult("Success");
		return response;
	}

}
