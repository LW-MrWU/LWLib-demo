package com.gameclub.demo.vault;

import com.gameclub.demo.MainPlugin;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.plugin.RegisteredServiceProvider;

/**
 * @author lw
 * @date 创建时间 2021/1/25 11:37
 * @description TODO
 */
public class VaultService {
    private static VaultService vaultService;

    public static VaultService getInstance(){
        if(vaultService == null){
            vaultService = new VaultService();
        }
        return vaultService;
    }

    private Chat chat = null;

    public boolean initVault() {
        boolean hasNull = false;
        RegisteredServiceProvider<Chat> chatProvider = MainPlugin.getInstance().getServer().getServicesManager().getRegistration(Chat.class);
        if (chatProvider != null && (this.chat = (Chat)chatProvider.getProvider()) == null) {
            hasNull = true;
        }

        return !hasNull;
    }

    public Chat getChat() {
        return this.chat;
    }
}
