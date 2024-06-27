package com.furnycrew.furnidream.statistics.controller;

import com.furnycrew.furnidream.statistics.model.dao.OrderSalesStatisticsMapper;
import com.furnycrew.furnidream.statistics.model.dto.OrderSalesStatisticsDto;
import com.furnycrew.furnidream.statistics.model.service.OrderCountRankingService;
import java.util.LinkedHashMap;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/statistics/order/sales")
public class OrderSalesStatisticsController {
    private final OrderSalesStatisticsMapper orderSalesStatisticsMapper;
///app/statistics/order/sales
@GetMapping()
public String calculateSalesStatistics() {
    return "statistics/order/sales/main";
}
    @GetMapping("/chart")
    public String calculateSalesStatistics(Integer year, Model model) {
        List<OrderSalesStatisticsDto> result = orderSalesStatisticsMapper.calculateSalesStatistics(
                year);

        model.addAttribute("result", result);

        return "statistics/order/sales/chart";
    }

}
