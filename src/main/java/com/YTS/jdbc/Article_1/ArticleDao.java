package com.YTS.jdbc.Article_1;

import java.util.List;
import com.YTS.jdbc.Article.Article;
import org.springframework.stereotype.Repository;
/**
 * Data Access Object.<br>
 * 데이터베이스에 접속해서 데이터를 조작하는 인터페이스.
 * 
 * @author Jacob
 */
@Repository("articleDao")
public interface ArticleDao {

	/**
	 * 목록
	 */
	List<Article> listArticles();

	/**
	 * 조회
	 */
	Article getArticle(String articleId);

	/**
	 * 등록
	 * 
	 * @return 추가된 행의 갯수
	 */
	int addArticle(Article article);

	/**
	 * 수정
	 * 
	 * @return 수정된 행의 갯수
	 */
	int updateArticle(Article article);

	/**
	 * 삭제
	 * 
	 * @return 삭제된 행의 갯수
	 */
	int deleteArticle(String articleId);
}