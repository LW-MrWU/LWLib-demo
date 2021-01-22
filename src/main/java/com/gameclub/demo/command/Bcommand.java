package com.gameclub.demo.command;

import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/21 17:31
 * @description TODO
 */
public class Bcommand extends BaseCommand {
    private static Bcommand bCommand;

    public static Bcommand getInstance(){
        if(bCommand == null){
            bCommand = new Bcommand("bcommand");
        }
        return bCommand;
    }

    public Bcommand(String commandName) {
        super(commandName);
        setUsage("&e/lw acommand bcommand 测试命令B");
    }

    @Override
    public boolean onCommand(CommandSender commandSender, String[] args) {
        return false;
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
