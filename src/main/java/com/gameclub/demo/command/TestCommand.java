package com.gameclub.demo.command;

import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import com.gameclub.lwlib.service.basic.service.plugin.BasePlugin;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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
        /*Player player = commandSender.getServer().getPlayerExact(strings[0]);
        System.out.println("player:"+player);
        String name = player.getName();
        System.out.println("name:"+name);
        player.setDisplayName(strings[1]);
        String displayName = player.getDisplayName();
        System.out.println("displayName:"+displayName);*/
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
