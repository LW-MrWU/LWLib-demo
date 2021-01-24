package com.gameclub.demo.listener;

import com.gameclub.demo.MainPlugin;
import com.gameclub.demo.config.PlayerConfig;
import com.gameclub.lwlib.listener.BaseListener;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author lw
 * @date 创建时间 2021/1/24 12:53
 * @description
 */
public class PlayerListener extends BaseListener {

    @EventHandler
    public void onPlayJoin(PlayerJoinEvent event) {
        System.out.println("PlayerListener onPlayJoin");

        Player player = event.getPlayer();
        String uuid = player.getUniqueId().toString();

        //createUserConfig
        PlayerConfig playerConfig = new PlayerConfig(uuid+".yml");
        if(playerConfig.isInit()) {
            String prefix = playerConfig.getUseprefix();
            String nickNameColor = playerConfig.getNickColor();
            System.out.println("prefix:"+prefix);
            System.out.println("nickNameColor:"+nickNameColor);
        }

    }
}
