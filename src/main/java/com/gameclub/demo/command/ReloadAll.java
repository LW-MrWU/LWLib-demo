package com.gameclub.demo.command;

import com.gameclub.demo.MainPlugin;
import com.gameclub.lwlib.model.command.BaseCommand;
import com.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/23 15:17
 * @description 重载配置
 */
public class ReloadAll extends BaseCommand {
    private static ReloadAll reloadAll;

    public static ReloadAll getInstance(){
        if(reloadAll == null){
            reloadAll = new ReloadAll("reload");
        }
        return reloadAll;
    }

    public ReloadAll(String commandName) {
        super(commandName);
        setUsage("/lld reload -重载插件");
    }

    public boolean onCommand(CommandSender commandSender, String[] strings) {
        MainPlugin.getInstance().getBaseConfigService().reloadAll();
        return true;
    }

    public List<String> onTabComplete(CommandSender commandSender, String[] strings) {
        return null;
    }

    public String getPermissionNode() {
        return null;
    }

    public BaseCommandSenderType commandSenderType() {
        return null;
    }
}
