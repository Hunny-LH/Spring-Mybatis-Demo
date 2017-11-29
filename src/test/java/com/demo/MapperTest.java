package com.demo;

import com.demo.dao.CodeVersionsMapper;
import com.demo.entity.CodeVersions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * MapperTest
 *
 * @author <a href="mailto:393803588@qq.com">HanL(liuhan3)</a>
 * @date 2017/11/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Resource
    CodeVersionsMapper mapper;

    @Test
    public void test() {
        List<CodeVersions> results = mapper.findAll();

        results.forEach(System.out::println);

    }

}
