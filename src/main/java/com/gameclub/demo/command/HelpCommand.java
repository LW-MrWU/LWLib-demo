package com.gameclub.demo.command;

import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/21 16:39
 * @description TODO
 */
public class HelpCommand extends BaseCommand {
    private static HelpCommand helpCommand;

    public static HelpCommand getInstance(){
        if(helpCommand == null){
            helpCommand = new HelpCommand("help");
        }
        return helpCommand;
    }
    public HelpCommand(String commandName) {
        super(commandName);
        setUsage("&e/lw help 帮助命令");
    }

    @Override
    public boolean onCommand(CommandSender commandSender, String[] args) {
        showAllHelp(commandSender, MainCommand.getInstance());
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, String[] args) {
        return null;
    }

    @Override
    public String getPermissionNode() {
        return null;
    }

    @Override
    public BaseCommandSenderType commandSenderType() {
        return null;
    }
}
