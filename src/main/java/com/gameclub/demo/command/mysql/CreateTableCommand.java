package com.gameclub.demo.command.mysql;

import com.gameclub.demo.MainPlugin;
import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import com.gameclub.lwlib.model.enumModel.MysqlDataTypeEnum;
import com.gameclub.lwlib.service.basic.service.plugin.BasePlugin;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lw
 * @date 创建时间 2021/1/26 13:39
 * @description TODO
 */
public class CreateTableCommand extends BaseCommand {
    public CreateTableCommand() {
        super("createtable", "ct");
    }

    public boolean onCommand(CommandSender commandSender, String[] strings) {
        Map<String, MysqlDataTypeEnum> map = new HashMap<String, MysqlDataTypeEnum>();
        map.put("test1", MysqlDataTypeEnum.VARCHAR);
        map.put("test2", MysqlDataTypeEnum.INT);
        map.put("test3", MysqlDataTypeEnum.DOUBLE);
        boolean flag = MainPlugin.getInstance().getBaseMysqlService().createTable("test", map);
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
        return "/sql ct -创建一个测试表单";
    }
}
