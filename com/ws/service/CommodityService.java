package com.ws.service;

import com.ws.model.bo.CommodityQueryBo;
import com.ws.model.vo.CommodityVo;
import com.ws.util.Page;

public interface CommodityService {

    Page<CommodityVo> pageQuery(CommodityQueryBo queryBo);

    CommodityVo detail(Integer id);

    CommodityVo detail(String code);
}
