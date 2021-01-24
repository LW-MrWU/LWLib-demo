package com.gameclub.demo.command;

import com.gameclub.demo.MainPlugin;
import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.config.BaseConfig;
import com.gameclub.lwlib.model.config.BaseLanguageConfig;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import com.gameclub.lwlib.service.basic.service.plugin.BasePlugin;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/21 17:02
 * @description TODO
 */
public class ACommand extends BaseCommand {
    public ACommand() {
        super("acommand");
        //addSubCommands(Bcommand.getInstance());
    }

    public boolean onCommand(CommandSender commandSender, String[] args) {
        //showHelp(commandSender, MainPlugin.getInstance());
        BaseConfig baseConfig = MainPlugin.getInstance().getBaseConfigService().getConfig(BaseLanguageConfig.getConfigName());
        baseConfig.setProperties("CONFIG_RELOAD_SUCCESS", null);
        baseConfig.saveConfig();
        return true;
    }

    public List<String> onTabComplete(CommandSender commandSender, String[] args) {
        return null;
    }

    public BasePlugin getBasePlugin() {
        return MainPlugin.getInstance();
    }

    public String getPermissionNode() {
        return "lw.admin";
    }

    public BaseCommandSenderType getCommandSenderType() {
        return null;
    }

    public String getUsageHelp() {
        return "&e/lw acommand 测试命令";
    }
}
