package com.subway.budget;

import com.subway.controller.common.BaseController;
import com.subway.domain.app.MyPage;
import com.subway.object.ReturnObject;
import com.subway.service.app.ResourceService;
import com.subway.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/budget")
public class BudgetController extends BaseController {

    @Autowired
    ResourceService resourceService;
    @Autowired
    BudgetService budgetService;
    @Autowired
    BudgetSearchService budgetSearchService;


    /**
     * @param request
     * @param current
     * @param rowCount
     * @param searchPhrase
     * @return
     */
    @RequestMapping(value = "/data", method = RequestMethod.POST)
    @ResponseBody
    public MyPage data(HttpServletRequest request, @RequestParam(value = "current", defaultValue = "0") int current, @RequestParam(value = "rowCount", defaultValue = "10") Long rowCount, @RequestParam(value = "searchPhrase", required = false) String searchPhrase) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Pageable pageable = new PageRequest(current - 1, rowCount.intValue(), super.getSort(parameterMap));
        return new PageUtils().searchBySortService(budgetSearchService, searchPhrase, 1, current, rowCount, pageable);
    }


    /**
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Budget findById(@PathVariable("id") Long id) {
        return budgetService.findById(id);
    }


    /**
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ReturnObject delete(@PathVariable("id") Long id) {
        return budgetService.delete(id);
    }


    /**
     * @param budget
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ReturnObject save(Budget budget) {
        return budgetService.save(budget);
    }


    /**
     * @param request
     * @param response
     * @param param
     * @param docName
     * @param titles
     * @param colNames
     */
    @ResponseBody
    @RequestMapping(value = "/exportExcel", method = RequestMethod.GET)
    public void exportExcel(HttpServletRequest request, HttpServletResponse response, @RequestParam("param") String param, @RequestParam("docName") String docName, @RequestParam("titles") String titles[], @RequestParam("colNames") String[] colNames) {
        List<Budget> dataList = budgetSearchService.findByConditions(param, 2);
        budgetService.setDataList(dataList);
        budgetService.exportExcel(request, response, docName, titles, colNames);
    }


}
