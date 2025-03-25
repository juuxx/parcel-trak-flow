package org.example.parcel.domain.model;

public enum DeliveryType {
	GENERAL, DEDICATED;

	public static DeliveryType from(String value) {
		return value.equalsIgnoreCase("전담택배") ? DEDICATED : GENERAL;
	}
}
