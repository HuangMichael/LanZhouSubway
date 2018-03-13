package com.subway.eqClass;

import java.util.List;
import java.util.Map;

import com.subway.service.app.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import com.subway.service.commonData.CommonDataService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.subway.object.ReturnObject;
/**
* �豸����ҵ����
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class EqClassService extends BaseService {


@Autowired
EqClassRepository eqClassRepository;


@Autowired
CommonDataService commonDataService;

public List
<EqClass> findAll() {
return  eqClassRepository.findAll();
}


public Page< EqClass> findAll(Pageable pageable) {
return  eqClassRepository.findAll(pageable);
}


/**
* @param id id
* @return ����idɾ������
*/
public ReturnObject delete(Long id) {
eqClassRepository.delete(id);
EqClass eqClass = eqClassRepository.getOne(id);
return commonDataService.getReturnType(eqClass == null, "��¼ɾ���ɹ�", "��¼ɾ��ʧ��");
}


/**
* @param eqClass
* @return ������Ϣ
*/
public ReturnObject save(EqClass eqClass) {

eqClass = eqClassRepository.save(eqClass);
return commonDataService.getReturnType(eqClass != null, "��¼����ɹ���", "��¼ɾ��ʧ��!");
}


public  EqClass findById(Long id) {
return  eqClassRepository.getOne(id);
}

}
