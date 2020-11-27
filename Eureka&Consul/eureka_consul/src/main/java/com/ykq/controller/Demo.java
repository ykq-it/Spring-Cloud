package com.ykq.controller;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author ykq
 * @Date 2020/11/26
 * @Version v1.0.0
 */
public class Demo {

    List<Sku> skus = new ArrayList<>();

    public Map<String, Map<String, List<Integer>>> demo() {
        Map<String, Map<String, List<Integer>>> attrs = new HashMap<>();

        for (Sku sku : skus) {
            for (Map.Entry<String, String> entry : sku.getSaleAttr().entrySet()) {

                Map<String, List<Integer>> attr = attrs.get(entry.getKey());
                if (null == attr) {
                    attr = new HashMap<>();
                }

                List<Integer> skuList = attr.get(entry.getValue());
                if (null == skuList) {
                    skuList = new ArrayList<>();
                }
                skuList.add(sku.id);

                attr.put(entry.getValue(), skuList);
                attrs.put(entry.getKey(), attr);
            }
        }
        return attrs;
    }

    @Data
    class Sku {
        private int id;
        private int spuId;
        private String name;
        private Map<String, String> saleAttr;
    }

    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("内存", "4GB");
        map.put("颜色", "白色");
        list.add(map);
        System.out.println(list);
    }
}
