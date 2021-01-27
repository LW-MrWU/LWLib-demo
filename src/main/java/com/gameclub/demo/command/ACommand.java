package com.gameclub.demo.command;

import com.gameclub.demo.MainPlugin;
import com.gameclub.demo.vault.VaultService;
import vip.gameclub.lwlib.model.command.BaseCommand;
import vip.gameclub.lwlib.model.config.BaseConfig;
import vip.gameclub.lwlib.model.config.BaseLanguageConfig;
import vip.gameclub.lwlib.model.enumModel.BaseCommandSenderType;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;
import vip.gameclub.lwlib.service.plugin.BasePlugin;

import java.util.Iterator;
import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/21 17:02
 * @description TODO
 */
public class ACommand extends BaseCommand {
    public ACommand() {
        super("acommand");
        //addSubCommands(Bcommand.getInstance());
    }

    public boolean onCommand(CommandSender commandSender, String[] args) {
        Player player = (Player)commandSender;
        //showHelp(commandSender, MainPlugin.getInstance());
        Iterator var = Bukkit.getWorlds().iterator();
        while (var.hasNext()){
            World world = (World) var.next();
            VaultService.getInstance().getChat().setPlayerPrefix(world.getName(), player, "[这个有点厉害呀]");
        }
        try {
            this.setTag(player, "[称号测试]");
        } catch (Exception var14) {
            var14.printStackTrace();
        }
        return true;
    }

    public List<String> onTabComplete(CommandSender commandSender, String[] args) {
        return null;
    }

    public BasePlugin getBasePlugin() {
        return MainPlugin.getInstance();
    }

    public String getPermissionNode() {
        return "lw.admin";
    }

    public BaseCommandSenderType getCommandSenderType() {
        return null;
    }

    public String getUsageHelp() {
        return "&e/lw acommand 测试命令";
    }

    public void setTag(Player p, String prefix) throws Exception {
        if (prefix.length() > 16) {
            prefix = prefix.substring(0, 16);
        }

        Scoreboard board = Bukkit.getScoreboardManager().getMainScoreboard();
        Team t = board.getTeam(p.getName());
        if (t == null) {
            t = board.registerNewTeam(p.getName());
            t.setPrefix(prefix);
            t.setDisplayName("displayNameNull");
            t.addEntry(p.getName());
        } else {
            t = board.getTeam(p.getName());
            t.setPrefix(prefix);
            t.setDisplayName("displayName");
            t.setSuffix("[后缀]");
            t.addEntry(p.getName());
        }

        Iterator var5 = Bukkit.getOnlinePlayers().iterator();

        while(var5.hasNext()) {
            Player o = (Player)var5.next();
            o.setScoreboard(board);
        }

    }
}
