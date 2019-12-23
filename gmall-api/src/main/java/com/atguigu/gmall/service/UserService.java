package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserService {
    /**
     * 获取所有用户
     * @return null
     */
    List<UmsMember> getAllUser();

    /**
     * 获取所有用户
     * @return null
     * @param memberId 成员Id
     */
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
