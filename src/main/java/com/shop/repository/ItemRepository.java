package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ItemRepository extends JpaRepository<Item, Long>,
        QuerydslPredicateExecutor<Item>, ItemRepositoryCustom {


    List<Item> findByItemNm(String itemNm);

    List<Item> findByMadeByCompany(String madeByCompany);

    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

    List<Item> findByPriceLessThan(Integer price);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

    @Query("select i from Item i where i.itemDetail like " +
            "%:itemDetail% order by i.price desc")
    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);

    @Query(value="select * from item i where i.item_detail like " +
            "%:itemDetail% order by i.price desc", nativeQuery = true)
    List<Item> findByItemDetailByNative(@Param("itemDetail") String itemDetail);

    @Modifying  // 연결된 외래키값을 삭제해주는 작업
    @Query("DELETE FROM CartItem c WHERE c.item.id = :itemId")
    void deleteCartItemByItemId(Long itemId);

    @Modifying
    @Query("DELETE FROM OrderItem o WHERE o.item.id = :itemId")
    void deleteOrderItemByItemId(Long itemId);

    @Modifying
    @Query("DELETE FROM ItemImg i WHERE i.item.id = :itemId")
    void deleteItemImgByItemId(Long itemId);

    boolean existsByItemNm(String itemNm);  // 상품명 비교

}