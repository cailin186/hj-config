package com.hujiang.hjconfig.api.service;


import com.hujiang.hjconfig.core.vo.HJConfigApp;

import java.util.List;

/**
 * Created by suncheng on 11/23/15.
 */
public interface IPropertyConfigService {
    /**
     * 设置一个配置项
     * @param key
     * @param value
     * @param app
     * @return
     */
    String setProperty(String key,String value,HJConfigApp app);

    /**
     * 获取一个配置项
     * @param key
     * @return
     */
    String getProperty(HJConfigApp app,String key);

    /**
     * 获取所有配置
     * @return
     */
    List getAllProperties(HJConfigApp app);

    String deleteProperty(String key,HJConfigApp app);

    String updateProperty(String key,String value,HJConfigApp app);
}
