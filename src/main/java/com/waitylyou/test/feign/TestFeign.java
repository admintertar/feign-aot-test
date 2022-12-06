package com.waitylyou.test.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        value = "x-booking-service",
        path = "/v1/booking/longterm-booking-order"
        ,contextId = "com.waitylyou.test.feign.TestFeign"
)
public interface TestFeign {


    @GetMapping({"/select/{id}"})
    Long selectLongtermBookingOrder(@PathVariable("id") Long id);

}
