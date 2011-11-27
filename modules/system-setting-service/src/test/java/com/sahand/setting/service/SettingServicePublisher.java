package com.sahand.setting.service;

import javax.xml.ws.Endpoint;

public class SettingServicePublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/wx/SettingService", new SettingSetupImpl());
	}
}
