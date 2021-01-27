package com.gameclub.demo.config;

import vip.gameclub.lwlib.model.config.BaseConfig;
import vip.gameclub.lwlib.service.plugin.BasePlugin;

/**
 * @author lw
 * @date 创建时间 2021/1/23 18:12
 * @description
 */
public class TestConfig extends BaseConfig {
    public TestConfig(BasePlugin basePlugin) {
        super(basePlugin, "test.yml", "test");
    }

    public void loadConfig() {
    }

    protected boolean createConfig() {
        return false;
    }
}
