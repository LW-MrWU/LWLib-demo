package com.gameclub.demo.command.mysql;

import com.gameclub.demo.MainPlugin;
import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import com.gameclub.lwlib.service.basic.service.plugin.BasePlugin;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lw
 * @date 创建时间 2021/1/26 13:45
 * @description TODO
 */
public class InsertCommand extends BaseCommand {
    public InsertCommand() {
        super("insert", "add");
    }

    public boolean onCommand(CommandSender commandSender, String[] strings) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("test1", "字符串测试");
        map.put("test2", 66);
        map.put("test3", 111.51);
        MainPlugin.getInstance().getBaseMysqlService().insert("test", map);
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
