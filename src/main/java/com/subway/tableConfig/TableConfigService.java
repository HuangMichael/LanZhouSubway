package com.subway.tableConfig;

import java.util.List;
import java.util.Map;

import com.subway.object.ReturnObject;
import com.subway.service.app.BaseService;
import com.subway.service.commonData.CommonDataService;
import com.subway.tableColumnConfig.TableColumnConfig;
import com.subway.tableColumnConfig.TableColumnConfigRepository;
import com.subway.utils.ConstantUtils;
import com.subway.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class TableConfigService extends BaseService {


    @Autowired
    TableConfigRepository tableConfigRepository;


    @Autowired
    TableColumnConfigRepository tableColumnConfigRepository;


    @Autowired
    CommonDataService commonDataService;


    /**
     * @param id
     * @return
     */
    public TableConfig findById(Long id) {
        return tableConfigRepository.getOne(id);
    }


    /**
     * @param id 表配置id
     * @return 更新配置数据
     * 将数据库字段修改为类属性
     */
    public ReturnObject formatConfig(Long id) {
        TableConfig tableConfig = tableConfigRepository.getOne(id);
        List<TableColumnConfig> tableColumnConfigList = tableColumnConfigRepository.findByTableConfigAndStatus(tableConfig, ConstantUtils.STATUS_YES);
        String originName;
        for (TableColumnConfig columnConfig : tableColumnConfigList) {
            originName = columnConfig.getColName();
            if (originName.contains("_")) {
                columnConfig.setColName(StringUtils.convertColName(originName));
            }
            tableColumnConfigRepository.save(columnConfig);
        }
        return commonDataService.getReturnType(!tableColumnConfigList.isEmpty(), "数据列配置格式成功", "数据列配置格式失败");
    }


}
