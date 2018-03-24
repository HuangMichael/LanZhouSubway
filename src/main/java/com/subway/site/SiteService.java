package com.subway.site;

import com.subway.object.ReturnObject;
import com.subway.service.app.BaseService;
import com.subway.service.commonData.CommonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * վ�����业务�?
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class SiteService extends BaseService {


    @Autowired
    SiteRepository siteRepository;


    @Autowired

    CommonDataService commonDataService;

    /**
     * @return
     */
    public List<Site> findAll() {
        return siteRepository.findAll();
    }


    /**
     * @param pageable
     * @return
     */
    public Page<Site> findAll(Pageable pageable) {
        return siteRepository.findAll(pageable);
    }


    /**
     * @param id
     * @return
     */
    public Site findById(Long id) {
        return siteRepository.getOne(id);
    }


    /**
     * @param id id
     * @return ����idɾ������
     */
    public ReturnObject delete(Long id) {
        siteRepository.delete(id);
        Site site = siteRepository.getOne(id);
        return commonDataService.getReturnType(site == null, "��¼ɾ���ɹ�", "��¼ɾ��ʧ��");
    }

}
