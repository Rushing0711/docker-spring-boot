package com.coding.docker.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coding.docker.entity.TUser;
import com.coding.docker.service.TUserService;
import com.coding.docker.mapper.TUserMapper;
import org.springframework.stereotype.Service;

/**
* @author wenqiu
* @description 针对表【t_user(用户表)】的数据库操作Service实现
* @createDate 2025-05-25 14:51:12
*/
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser>
    implements TUserService{

}




