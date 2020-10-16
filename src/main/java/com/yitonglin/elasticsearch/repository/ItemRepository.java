package com.yitonglin.elasticsearch.repository;

import com.yitonglin.elasticsearch.pojo.Item;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends ElasticsearchRepository<Item,Long> {

    /**
     * 自定义方法之根据价格区间查询
     * @param price1
     * @param price2
     * @return
     */
    List<Item> findByPriceBetween(double price1,double price2);
}
