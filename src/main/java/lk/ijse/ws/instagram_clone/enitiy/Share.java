package lk.ijse.ws.instagram_clone.enitiy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Share {

    @Id
    private Long id;
    @ManyToOne
    private InstaUser sharedUser;
    @ManyToOne
    private Post post;
    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InstaUser getSharedUser() {
        return sharedUser;
    }

    public void setSharedUser(InstaUser sharedUser) {
        this.sharedUser = sharedUser;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
