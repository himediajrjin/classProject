package com.hi.board.mapper;

import com.hi.board.domain.ReplyDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface ReplyMapper {

    // insert
    @Insert("insert into tbl_reply (bno, reply, memIdx) values (#{bno},#{reply},#{memIdx})")
    @Options(useGeneratedKeys = true, keyProperty = "rno", keyColumn = "rno")
    int insertReply(ReplyDTO reply);

}
