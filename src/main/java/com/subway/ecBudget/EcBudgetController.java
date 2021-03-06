package com.subway.ecEcBudget;


import com.subway.controller.common.BaseController;
import com.subway.domain.app.MyPage;
import com.subway.ecBudget.EcBudget;
import com.subway.ecBudget.EcBudgetSearchService;
import com.subway.ecBudget.EcBudgetService;
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
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * �ɹ�����
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/ecBudget")
public class EcBudgetController extends BaseController {

    @Autowired
    ResourceService resourceService;
    @Autowired
    EcBudgetService ecBudgetService;
    @Autowired
    EcBudgetSearchService ecBudgetSearchService;


    @RequestMapping(value = "/data", method = RequestMethod.POST)
    @ResponseBody
    public MyPage data(HttpSession session, HttpServletRequest request, @RequestParam(value = "current", defaultValue = "0") int current, @RequestParam(value = "rowCount", defaultValue = "10") Long rowCount, @RequestParam(value = "searchPhrase", required = false) String searchPhrase) {
        Map
                <String, String[]> parameterMap = request.getParameterMap();
        Pageable pageable = new PageRequest(current - 1, rowCount.intValue(), super.getSort(parameterMap));
        return new PageUtils().searchBySortService(ecBudgetSearchService, searchPhrase, 2, current, rowCount, pageable);
    }


    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public EcBudget findById(@PathVariable("id") Long id) {
        return ecBudgetService.findById(id);
    }


    /**
     * @param id
     * @return ɾ����Ϣ
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ReturnObject delete(@PathVariable("id") Long id) {
        return ecBudgetService.delete(id);
    }


    /**
     * @param ecBudget ��Ϣ
     * @return ������Ϣ
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ReturnObject save(EcBudget ecBudget) {
        return ecBudgetService.save(ecBudget);
    }


    @ResponseBody
    @RequestMapping(value = "/exportExcel", method = RequestMethod.GET)
    public void exportExcel(HttpServletRequest request, HttpServletResponse response, @RequestParam("param") String param, @RequestParam("docName") String docName, @RequestParam("titles") String titles[], @RequestParam("colNames") String[] colNames) {
        List<EcBudget> dataList = ecBudgetSearchService.findByConditions(param, 2);
        ecBudgetService.setDataList(dataList);
        ecBudgetService.exportExcel(request, response, docName, titles, colNames);
    }


}
