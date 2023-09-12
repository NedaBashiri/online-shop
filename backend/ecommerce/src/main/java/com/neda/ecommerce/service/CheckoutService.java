package com.neda.ecommerce.service;

import com.neda.ecommerce.dto.Purchase;
import com.neda.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
