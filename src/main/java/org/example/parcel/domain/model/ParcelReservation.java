package org.example.parcel.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.example.parcel.dto.ExternalParcelReservationRequest;
import org.example.parcel.service.DeliveryDatePolicy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParcelReservation {
	private String reservationId;
	private String waybillNo;
	private LocalDateTime reservedAt;
	private LocalDate deliveryDueDate;

	private String customerCode;           // 고객사 코드
	private String collectedBranchCode;    // 집화 예정 점소
	private String deliveryBranchCode;     // 배송 예정 점소

	private DeliveryType deliveryType;     // 일반/전담
	private ProductType productType;       // 일반/출고일반/신선

	private PersonInfo sender;
	private PersonInfo receiver;

	private String itemName;
	private int itemCount;

	public static ParcelReservation fromExternalRequest(
		ExternalParcelReservationRequest req,
		String waybillNo,
		String customerCode,
		String collectedBranch,
		String deliveryBranch
	) {
		return ParcelReservation.builder()
			.reservationId(UUID.randomUUID().toString())
			.waybillNo(waybillNo)
			.reservedAt(req.getReservedAt())
			.deliveryDueDate(DeliveryDatePolicy.calculate(req.getReservedAt()))
			.customerCode(customerCode)
			.collectedBranchCode(collectedBranch)
			.deliveryBranchCode(deliveryBranch)
			.deliveryType(DeliveryType.from(req.getDeliveryType()))
			.productType(ProductType.from(req.getProductType()))
			.sender(new PersonInfo(req.getSenderName(), req.getSenderAddress(), req.getSenderPhone()))
			.receiver(new PersonInfo(req.getReceiverName(), req.getReceiverAddress(), req.getReceiverPhone()))
			.itemName(req.getItemName())
			.itemCount(req.getItemCount())
			.build();
	}
}
