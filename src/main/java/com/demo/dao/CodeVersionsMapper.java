package com.demo.dao;

import com.demo.entity.CodeVersions;

import java.util.List;

/**
 * CodeVersionsMapper
 *
 * @author <a href="mailto:393803588@qq.com">HanL(liuhan3)</a>
 * @date 2017/11/21
 */
public interface CodeVersionsMapper extends Mapper {

    List<CodeVersions> findAll();
}
