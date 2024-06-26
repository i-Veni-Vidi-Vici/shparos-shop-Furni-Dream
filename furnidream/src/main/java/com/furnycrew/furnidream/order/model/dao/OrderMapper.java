package com.furnycrew.furnidream.order.model.dao;

import com.furnycrew.furnidream.common.search.SearchCriteria;
import com.furnycrew.furnidream.common.search.UpdateCriteria;
import com.furnycrew.furnidream.order.model.dto.OrderDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@Mapper
public interface OrderMapper {
    List<OrderDto> findOrdersByDateTime(@Param("searchCriteria")SearchCriteria searchCriteria, @Param("offset") int offset, @Param("limit") int limit);

    int countOrderByDateTime(SearchCriteria searchCriteria);

    OrderDto getOrderDetail(SearchCriteria searchCriteria);

    int updateOrderStatus(UpdateCriteria updateCriteria);

    int cancelOrder(UpdateCriteria updateCriteria);

    int createCancelOrder(UpdateCriteria tmpCriteria);

    int updateTrackingNum(UpdateCriteria updateCriteria);
}
