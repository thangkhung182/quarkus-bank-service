package com.trungnguyen.config;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.config.inject.ConfigProperties;

@ConfigProperties(prefix = "bank-support")
@Getter
@Setter
public class BankSupportConfig {
    private String phone;

    private String email;
}
