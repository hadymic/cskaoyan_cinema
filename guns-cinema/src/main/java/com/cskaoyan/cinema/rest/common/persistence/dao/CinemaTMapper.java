package com.cskaoyan.cinema.rest.common.persistence.dao;

import com.cskaoyan.cinema.rest.common.persistence.model.CinemaT;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cskaoyan.cinema.vo.cinema.CinemaInfoVo;
import com.cskaoyan.cinema.vo.cinema.CinemaVo;
import com.cskaoyan.cinema.vo.cinema.FilmFields;
import com.cskaoyan.cinema.vo.cinema.FilmMsgVo;


import java.util.List;

/**
 * <p>
 * 影院信息表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2019-10-14
 */
public interface CinemaTMapper extends BaseMapper<CinemaT> {

    List<CinemaVo> queryCinemaMsg(Integer brandId, Integer areaId);

    List<FilmMsgVo> queryFilmMsg(String cinemaId);

  CinemaInfoVo selectCinemaMsg(String cinemaId);

    List<FilmFields> queryHall(Integer filmId);
}
