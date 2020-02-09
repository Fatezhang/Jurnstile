package com.jiaheng.jurnstile.core;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JurnstileCoreService {
    private String prefix;
    private String suffix;

    public String wrap() {
        return prefix + "===wrapped===" + suffix;
    }
}
