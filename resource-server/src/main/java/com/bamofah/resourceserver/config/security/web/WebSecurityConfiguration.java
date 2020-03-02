package com.bamofah.resourceserver.config.security.web;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableGlobalMethodSecurity(
        prePostEnabled = true
)
public class WebSecurityConfiguration {
}
