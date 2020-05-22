package com.springboot.utils;

import com.alibaba.fastjson.JSON;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class UtilsApplicationTests {

    @Test
    void contextLoads() {
        /*StringUtils*/
        System.out.println("StringUtils.isEmpty:"+StringUtils.isEmpty(""));
        System.out.println("StringUtils.truncate:"+StringUtils.truncate("abcaadef",2, 4));
        System.out.println("StringUtils.replace:"+StringUtils.replace("abcde", "c", "ddd"));
        System.out.println("StringUtils.join："+StringUtils.join(new String[]{"1", "2", "3"}));
        System.out.println("StringUtils.split:"+StringUtils.split("a,b,c,d,e", ",")[0]);
        System.out.println("StringUtils.split:"+ JSON.toJSONString(StringUtils.split("a,b,c,d,e", ",")));
        Integer[] a = new Integer[]{1,2,3,4,8,9};
        Integer[] b = new Integer[]{1,2,3,4,5,6,7};
        Integer[] c = new Integer[]{1,2,3,4,5,6,7};
        List<Integer> la = Arrays.asList(a);
        List<Integer> lb = Arrays.asList(b);
        List<Integer> lc = Arrays.asList(c);
        System.out.println("CollectionUtils.union："+ArrayUtils.toString(CollectionUtils.union(la, lb)));
        System.out.println("CollectionUtils.isEmpty:"+CollectionUtils.isEmpty(la));
        System.out.println("CollectionUtils.isNotEmpty:"+CollectionUtils.isNotEmpty(la));
        System.out.println("CollectionUtils.isEqualCollection:"+CollectionUtils.isEqualCollection(la, lb));
        System.out.println("CollectionUtils.isEqualCollection:"+CollectionUtils.isEqualCollection(lc, lb));
        System.out.println("CollectionUtils.exists:"+CollectionUtils.exists(la, item->{
            return Integer.valueOf(item.toString()) ==19;
        }));

        System.out.println("CollectionUtils.filter:"+JSON.toJSONString(CollectionUtils.select(la, (item)->{
            return Integer.valueOf(item.toString())>4;
        })));

    }

}
