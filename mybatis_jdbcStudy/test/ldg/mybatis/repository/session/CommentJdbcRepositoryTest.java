package ldg.mybatis.repository.session;

import java.util.*;

import ldg.mybatis.model.Comment;

public class CommentJdbcRepositoryTest {
	private final CommentJdbcRepository commentJdbcRepository = new CommentJdbcRepository();

	public void testSelectCommentByPrimaryKey() {
		Long commentNo = 1L;
		Comment comment = commentJdbcRepository.selectCommentByPrimaryKey(commentNo);

		System.out.println(comment);
	}
//	private void testSelectAllComments() {
//		private void testSelectAllComments() 메서드 구현
//		- 클래스의 멤버변수인 commentJdbcRepository로 테스트
//		- selectAllComments()메서드를 호출하여 결과를 출력
//		1장 72p
//	}

	public void testInsertComment() {
		Long commentNo = 1L;
		String userId = "fromm0";
		Date regDate = Calendar.getInstance().getTime();
		String commentContent = "test";

		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setUserId(userId);
		comment.setCommentContent(commentContent);
		comment.setRegDate(regDate);
		commentJdbcRepository.deleteComment(commentNo);
		Integer result = commentJdbcRepository.insertComment(comment);

		System.out.println(result);
	}

	public void testUpdateComment() {
		Long commentNo = 1L;
		String commentContent = "test";

		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setCommentContent(commentContent);
		Integer result = commentJdbcRepository.updateComment(comment);

		System.out.println(result);
	}

	public void testDeleteComment() {
		Long commentNo = 1L;
		Integer result = commentJdbcRepository.deleteComment(commentNo);

		System.out.println(result);
	}

	public void testSelectCommentByCondition() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 2L);
		//		condition.put("commentNoForeach", Arrays.asList(1L, 2L, 3L));
		condition.put("commentNoForeach", new ArrayList<Long>());
		commentJdbcRepository.selectCommentByCondition(condition);
	}

	public static void main(String[] args) {
		CommentJdbcRepositoryTest test = new CommentJdbcRepositoryTest();

		test.testSelectCommentByPrimaryKey();
		test.testInsertComment();
		test.testUpdateComment();
		test.testDeleteComment();
		test.testSelectCommentByCondition();
	}
}