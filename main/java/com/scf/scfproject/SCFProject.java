package com.scf.scfproject;

import org.bukkit.plugin.java.JavaPlugin;

public final class SCFProject extends JavaPlugin {

    @Override
    public void onEnable() {
        // 加载时自动打印内容
        System.out.println("-------------------\n"+
                "&bSCFPlugin&a已加载！\n"+
                "才不是来找存在感的\n"+
                "-------------------");
    }

    @Override
    public void onDisable() {
        // 加载时自动打印内容
        System.out.println("-------------------\n"+
                "&bSCFPlugin&a已加载！\n"+
                "你听我说 真没在找存在感...\n"+
                "-------------------");
    }
}
