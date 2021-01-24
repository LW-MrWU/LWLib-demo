package com.gameclub.demo.command;

import com.gameclub.demo.MainPlugin;
import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import com.gameclub.lwlib.service.basic.service.plugin.BasePlugin;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/21 16:39
 * @description TODO
 */
public class HelpCommand extends BaseCommand {
    public HelpCommand() {
        super("help", "h");
    }

    public boolean onCommand(CommandSender commandSender, String[] args) {
        showAllHelp(commandSender, MainCommand.getInstance(), MainPlugin.getInstance());
        return true;
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
        return "&e/lw help 帮助命令";
    }
}
