package com.gameclub.demo.command;

import com.gameclub.demo.MainPlugin;
import vip.gameclub.lwlib.model.command.BaseCommand;
import vip.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import org.bukkit.command.CommandSender;
import vip.gameclub.lwlib.service.plugin.BasePlugin;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/23 15:17
 * @description 重载配置
 */
public class ReloadAll extends BaseCommand {

    public ReloadAll() {
        super("reload");
    }

    public boolean onCommand(CommandSender commandSender, String[] strings) {
        MainPlugin.getInstance().getBaseConfigService().reloadAll();
        return true;
    }

    public List<String> onTabComplete(CommandSender commandSender, String[] strings) {
        return null;
    }

    public BasePlugin getBasePlugin() {
        return null;
    }

    public String getPermissionNode() {
        return null;
    }

    public BaseCommandSenderType getCommandSenderType() {
        return null;
    }

    public String getUsageHelp() {
        return "/lld reload -重载插件";
    }
}
