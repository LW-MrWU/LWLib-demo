package com.gameclub.demo.command.mysql;

import com.gameclub.demo.MainPlugin;
import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import com.gameclub.lwlib.service.basic.service.plugin.BasePlugin;
import org.bukkit.command.CommandSender;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lw
 * @date 创建时间 2021/1/26 14:54
 * @description TODO
 */
public class SelectCommand extends BaseCommand {
    public SelectCommand() {
        super("select");
    }

    public boolean onCommand(CommandSender commandSender, String[] strings) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 1);
        ResultSet resultSet = MainPlugin.getInstance().getBaseMysqlService().select("test", map);
        System.out.println("resultSet:"+resultSet);
        try{
            while (resultSet.next()){
                Long id = resultSet.getLong("id");
                String test1 = resultSet.getString("test1");
                Integer test2 = resultSet.getInt("test2");
                Double test3 = resultSet.getDouble("test3");
                System.out.println("id:"+id);
                System.out.println("test1:"+test1);
                System.out.println("test2:"+test2);
                System.out.println("test3:"+test3);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
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
