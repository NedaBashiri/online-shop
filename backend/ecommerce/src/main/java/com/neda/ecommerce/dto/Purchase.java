package com.neda.ecommerce.dto;

import com.neda.ecommerce.entity.Address;
import com.neda.ecommerce.entity.Customer;
import com.neda.ecommerce.entity.Order;
import com.neda.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
