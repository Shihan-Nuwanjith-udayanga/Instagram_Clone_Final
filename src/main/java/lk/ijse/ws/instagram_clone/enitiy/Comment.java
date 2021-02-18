package lk.ijse.ws.instagram_clone.enitiy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Comment {

    @Id
    private Long id;
    @ManyToOne
    private InstaUser commenter;
    @ManyToOne
    private Post post;
    private String comment;
    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InstaUser getCommenter() {
        return commenter;
    }

    public void setCommenter(InstaUser commenter) {
        this.commenter = commenter;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
