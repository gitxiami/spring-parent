package com.yaomy.common.enums;

/**
 * @Description: 认证模式枚举类
 * @ProjectName: com.uufund.auth.master
 * @Package: com.uufund.auth.enums.EnumGrantType
 * @Author: 姚明洋
 * @Date: 2019/7/26 17:38
 * @Version: 1.0
 */
public enum GrantTypeEnum {
    PASSWORD("password", "密码模式"),
    REFRESH_TOKEN("refresh_token", "刷新token");

    private final String grant_type;
    private final String grant_name;

    private GrantTypeEnum(String grant_type, String grant_name){
        this.grant_type = grant_type;
        this.grant_name = grant_name;
    }

    public String getGrant_type() {
        return grant_type;
    }

}
