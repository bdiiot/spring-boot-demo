package com.bdiiot.springboot.demo.service;

import com.bdiiot.springboot.demo.model.SysUser;

import java.util.List;

public interface SysUserService {
    SysUser findByUserId(Long userId);

    List<SysUser> findAll();
}
