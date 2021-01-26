package com.gameclub.demo.command;

import com.gameclub.demo.MainPlugin;
import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import com.gameclub.lwlib.model.enumModel.MysqlDataTypeEnum;
import com.gameclub.lwlib.service.basic.service.plugin.BasePlugin;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
