package com.gameclub.demo.command;

import com.gameclub.demo.MainPlugin;
import com.gameclub.model.command.BaseCommand;
import com.gameclub.model.enumModel.BaseCommandSenderType;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/21 17:02
 * @description TODO
 */
public class ACommand extends BaseCommand {
    private static ACommand aCommand;

    public static ACommand getInstance(){
        if(aCommand == null){
            aCommand = new ACommand("acommand");
        }
        return aCommand;
    }
    public ACommand(String commandName) {
        super(commandName);
        addSubCommands(Bcommand.getInstance());
        setUsage("&e/lw acommand 测试命令");
        setPermission("lw.admin");
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
        return this.getPermission();
    }

    @Override
    public BaseCommandSenderType commandSenderType() {
        return null;
    }
}
