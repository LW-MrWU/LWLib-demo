package com.gameclub.demo.command;

import com.gameclub.demo.MainPlugin;
import com.gameclub.demo.command.mysql.MysqlCommand;
import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import com.gameclub.lwlib.service.basic.service.plugin.BasePlugin;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/21 16:36
 * @description TODO
 */
public class MainCommand extends BaseCommand {
    private static MainCommand mainCommand;

    public static MainCommand getInstance(){
        if(mainCommand == null){
            mainCommand = new MainCommand("lld");
        }
        return mainCommand;
    }

    public MainCommand(String commandName) {
        super(commandName);
        addSubCommands(new MysqlCommand(), new TestCommand(), new HelpCommand(), new ReloadAll(), new ACommand());
    }

    public boolean onCommand(CommandSender commandSender, String[] args) {
        showHelp(commandSender, MainPlugin.getInstance());
        return true;
    }

    public List<String> onTabComplete(CommandSender commandSender, String[] args) {
        return null;
    }

    public BasePlugin getBasePlugin() {
        return MainPlugin.getInstance();
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
