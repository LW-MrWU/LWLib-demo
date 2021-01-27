package com.gameclub.demo.config;

import com.gameclub.demo.MainPlugin;
import vip.gameclub.lwlib.model.config.BaseConfig;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lw
 * @date 创建时间 2021/1/24 12:44
 * @description
 */
public class PlayerConfig extends BaseConfig {

    private List<String> prefix;
    private String useprefix;
    private String nickColor;

    public PlayerConfig(String fileName) {
        super(MainPlugin.getInstance(), fileName, "player");
    }

    public void loadConfig() {
        this.setUseprefix(getFileConfiguration().getString("user.prefix.useprefix"));
        this.setNickColor(getFileConfiguration().getString("user.prefix.nickColor"));
        List<?> userprefixs = getFileConfiguration().getList("user.prefix.prefix");
        if(userprefixs!=null) {
            this.setprefix(new ArrayList<String>());
            for(int i=0;i<userprefixs.size();i++) {
                String tempprefix = userprefixs.get(i).toString();
                this.getprefix().add(tempprefix);
            }
        }
    }

    protected boolean createConfig() {
        boolean state = false;

        if(!this.createNewConfigFile()) {
            return false;
        }

        setProperties("user.prefix.useprefix", "");
        setProperties("user.prefix.nickColor", "&c");
        setProperties("user.prefix.prefix", new ArrayList<String>());

        try {
            this.getFileConfiguration().save(getFile());
            state = true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return state;
    }

    public List<String> getprefix() {
        return prefix;
    }

    public void setprefix(List<String> prefix) {
        setProperties("user.prefix.prefix", prefix);
        this.prefix = prefix;
    }

    public String getUseprefix() {
        return useprefix;
    }

    public void setUseprefix(String useprefix) {
        setProperties("user.prefix.useprefix", useprefix);
        this.useprefix = useprefix;
    }

    public String getNickColor() {
        return nickColor;
    }

    public void setNickColor(String nickColor) {
        setProperties("user.prefix.nickColor", nickColor);
        this.nickColor = nickColor;
    }
}
