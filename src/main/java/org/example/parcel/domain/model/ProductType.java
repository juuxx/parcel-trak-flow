package org.example.parcel.domain.model;

public enum ProductType {
	GENERAL,         // 일반택배
	GENERAL_DEDICATED, // 일반전담택배
	FRESH            // 신선택배
	;

	public static ProductType from(String productType) {
		//
		return productType.equalsIgnoreCase("전담택배") ? GENERAL_DEDICATED : GENERAL;
	}
}
