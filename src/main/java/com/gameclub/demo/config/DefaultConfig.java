package com.gameclub.demo.config;

import com.gameclub.demo.MainPlugin;
import com.gameclub.lwlib.model.config.BaseDefaultConfig;

/**
 * @author lw
 * @date 创建时间 2021/1/22 16:54
 * @description TODO
 */
public class DefaultConfig extends BaseDefaultConfig {
    public DefaultConfig() {
        super(MainPlugin.getInstance());
    }

    @Override
    protected void loadDefaultConfig() {
        TestConfig testConfig = new TestConfig(MainPlugin.getInstance());
    }
}
