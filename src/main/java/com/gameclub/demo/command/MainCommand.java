package com.gameclub.demo.command;

import com.gameclub.demo.MainPlugin;
import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
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
        super(MainPlugin.getInstance(), commandName);
        addSubCommands(HelpCommand.getInstance(), ReloadAll.getInstance(), ACommand.getInstance());
    }

    @Override
    public boolean onCommand(CommandSender commandSender, String[] args) {
        showHelp(commandSender, MainPlugin.getInstance());
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
