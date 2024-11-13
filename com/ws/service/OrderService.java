package com.ws.service;

import com.ws.model.bo.OrderBo;

public interface OrderService {
    //检查余额
    int validRemainingAmount(OrderBo orderBo);
    //提交订单************
    void submitOrder(OrderBo orderBo);


}
