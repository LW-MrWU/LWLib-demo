package com.gameclub.demo;

import com.gameclub.demo.command.MainCommand;
import com.gameclub.demo.config.DefaultConfig;
import com.gameclub.lwlib.model.enumModel.BaseSysMsgEnum;
import com.gameclub.lwlib.service.basic.service.plugin.BasePlugin;

/**
 * @author lw
 * @date 创建时间 2021/1/22 17:19
 * @description TODO
 */
public class MainPlugin extends BasePlugin {
    private static MainPlugin mainPlugin;

    public static MainPlugin getInstance(){
        return mainPlugin;
    }

    public boolean enable() {
        mainPlugin = this;//初始化配置文件
        initConfig();

        initCommand();
        //成功加载提示
        getBaseLogService().infoByLanguage(BaseSysMsgEnum.SUCCESS_LOAD.name(), BaseSysMsgEnum.SUCCESS_LOAD.getValue());

        return true;
    }

    public boolean disable() {
        return false;
    }

    /**
     * 初始化配置文件
     * @author lw
     * @date 2021/1/19 14:11
     * @param []
     * @return void
     */
    private void initConfig(){
        DefaultConfig defaultConfig = new DefaultConfig();
    }

    /**
     * 初始化命令
     * @author lw
     * @date 2021/1/22 18:12
     * @param []
     * @return void
     */
    private void initCommand(){
        MainCommand mainCommand = MainCommand.getInstance();
        this.registerCommand(mainCommand);
    }
}
