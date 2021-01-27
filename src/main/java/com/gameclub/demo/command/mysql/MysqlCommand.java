package com.gameclub.demo.command.mysql;

import com.gameclub.demo.MainPlugin;
import vip.gameclub.lwlib.model.command.BaseCommand;
import vip.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import org.bukkit.command.CommandSender;
import vip.gameclub.lwlib.service.plugin.BasePlugin;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/26 13:35
 * @description TODO
 */
public class MysqlCommand extends BaseCommand {
    public MysqlCommand() {
        super("mysql", "sql");
        addSubCommands(new CreateTableCommand(), new InsertCommand(), new SelectCommand(), new UpdateCommand());
    }

    public boolean onCommand(CommandSender commandSender, String[] strings) {
        showHelp(commandSender, MainPlugin.getInstance());
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
        return null;
    }
}
