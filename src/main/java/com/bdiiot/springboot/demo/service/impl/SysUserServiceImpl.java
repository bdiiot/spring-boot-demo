package com.bdiiot.springboot.demo.service.impl;

import com.bdiiot.springboot.demo.dao.SysUserMapper;
import com.bdiiot.springboot.demo.model.SysUser;
import com.bdiiot.springboot.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUserId(Long userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }
}
