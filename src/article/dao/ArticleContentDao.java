package article.dao;

import java.sql.*;

import article.model.ArticleContent;
import jdbc.JdbcUtil;

public class ArticleContentDao {
	
	 public ArticleContent insert(Connection conn, ArticleContent content) throws SQLException {
		 
		 PreparedStatement pstmt = null;
		 
		 try {
			 pstmt = conn.prepareStatement("insert into article_content"
					 +"(article_no,article_content) values (?,?)");
			 pstmt.setLong(1,content.getNumber());
			 pstmt.setString(3,content.getContent());
			 int insertedCount = pstmt.executeUpdate();
			 if(insertedCount > 0) {
				 return content;
			 } else {
				 return content;
			 }
			 
		 } finally {
			 JdbcUtil.close(pstmt);
		 }
	 }
}
