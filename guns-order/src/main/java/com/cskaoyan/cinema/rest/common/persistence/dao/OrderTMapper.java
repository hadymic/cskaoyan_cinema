package com.cskaoyan.cinema.rest.common.persistence.dao;

import com.cskaoyan.cinema.rest.common.persistence.model.OrderT;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 订单信息表 Mapper 接口
 * </p>
 *
 * @author hadymic
 * @since 2019-10-16
 */
public interface OrderTMapper extends BaseMapper<OrderT> {

<<<<<<< HEAD

=======
>>>>>>> dc3474bf7921386e567846f1c271461bfe896816
    OrderT queryOrderMsg(Integer fieldId);

    Integer queryFilmPrice(Integer fieldId);

 boolean insertDb(OrderT orderT);

    String queryFilmName(Integer filmId);

    String queryFieldTime(Integer fieldId);

    String queryCinema(Integer fieldId);
<<<<<<< HEAD

=======
>>>>>>> dc3474bf7921386e567846f1c271461bfe896816
    /**
     * 查询售出的座位编号列表
     * @param fieldId
     * @return
     */
    List<String> selectSoldSeats(Integer fieldId);
<<<<<<< HEAD

    OrderT queryOrderInfo(@Param("uuid") String orderId);

=======
>>>>>>> dc3474bf7921386e567846f1c271461bfe896816
}
