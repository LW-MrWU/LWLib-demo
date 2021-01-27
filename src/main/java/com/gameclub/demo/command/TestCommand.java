package com.gameclub.demo.command;

import vip.gameclub.lwlib.model.command.BaseCommand;
import vip.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import org.bukkit.command.CommandSender;
import vip.gameclub.lwlib.service.plugin.BasePlugin;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/24 13:43
 * @description
 */
public class TestCommand extends BaseCommand {

    public TestCommand() {
        super("test");
    }

    public boolean onCommand(CommandSender commandSender, String[] strings) {
        return false;
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
        return null;
    }
}
