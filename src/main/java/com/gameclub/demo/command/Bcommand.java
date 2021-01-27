package com.gameclub.demo.command;

import vip.gameclub.lwlib.model.command.BaseCommand;
import vip.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import org.bukkit.command.CommandSender;
import vip.gameclub.lwlib.service.plugin.BasePlugin;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/21 17:31
 * @description TODO
 */
public class Bcommand extends BaseCommand {

    public Bcommand() {
        super("bcommand");
    }

    public boolean onCommand(CommandSender commandSender, String[] args) {
        return false;
    }

    public List<String> onTabComplete(CommandSender commandSender, String[] args) {
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
        return "&e/lw acommand bcommand 测试命令B";
    }
}
