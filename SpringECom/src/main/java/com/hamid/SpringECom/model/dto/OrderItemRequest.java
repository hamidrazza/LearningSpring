package com.hamid.SpringECom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
