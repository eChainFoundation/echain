package com.echain.dao;

import com.echain.common.util.MyMapper;
import com.echain.entity.EcDapp;
import org.apache.ibatis.annotations.Param;

public interface EcDappDao extends MyMapper<EcDapp> {

    EcDapp selectByDappName(@Param("dappName") String dappName);
}