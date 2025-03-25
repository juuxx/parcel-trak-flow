package org.example.parcel.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExternalParcelReservationRequest {
	private String externalReservationId;   // 외부 예약번호
	private String waybillNo;               // 운송장 (우리 시스템에서 채번)
	private LocalDateTime reservedAt;
	private String productType;             // 일반 / 출고일반 / 신선
	private String deliveryType;            // 일반택배 / 전담택배
	private String holidayType;             // 명절 구분값

	private String senderName;
	private String senderAddress;
	private String senderPhone;

	private String receiverName;
	private String receiverAddress;
	private String receiverPhone;

	private String itemName;
	private int itemCount;

	private String receivedBranchCode;
}
