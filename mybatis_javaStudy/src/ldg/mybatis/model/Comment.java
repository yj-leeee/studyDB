package ldg.mybatis.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//3장 (3)54p부터 실습
//캐시 사용을 위해 implements Serializable 추가
@SuppressWarnings("serial")
@Getter @Setter @ToString
public class Comment implements Serializable {
	private Long commentNo;
	private String userId;
	private Date regDate;
	private String commentContent;

//	public Long getCommentNo() {
//		return commentNo;
//	}
//
//	public void setCommentNo(Long commentNo) {
//		this.commentNo = commentNo;
//	}
//
//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public Date getRegDate() {
//		return regDate;
//	}
//
//	public void setRegDate(Date regDate) {
//		this.regDate = regDate;
//	}
//
//	public String getCommentContent() {
//		return commentContent;
//	}
//
//	public void setCommentContent(String commentContent) {
//		this.commentContent = commentContent;
//	}
}