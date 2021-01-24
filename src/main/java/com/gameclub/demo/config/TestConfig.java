package com.gameclub.demo.config;

import com.gameclub.demo.MainPlugin;
import com.gameclub.lwlib.model.config.BaseConfig;
import com.gameclub.lwlib.service.basic.service.plugin.BasePlugin;
import org.bukkit.configuration.file.FileConfiguration;

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
