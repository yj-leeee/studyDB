package ldg.mybatis.repository.mapper;

import java.util.List;
import java.util.Map;

import ldg.mybatis.model.Comment;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

public interface CommentMapper {

	Comment selectCommentByPrimaryKey(Long commentNo);

}