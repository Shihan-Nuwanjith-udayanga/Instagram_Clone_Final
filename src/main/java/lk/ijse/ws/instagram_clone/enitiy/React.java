package lk.ijse.ws.instagram_clone.enitiy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class React {

    @Id
    private Long id;
    @ManyToOne
    private InstaUser reactor;
    @ManyToOne
    private Post post;
    private ReactionEnum reaction;
    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InstaUser getReactor() {
        return reactor;
    }

    public void setReactor(InstaUser reactor) {
        this.reactor = reactor;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public ReactionEnum getReaction() {
        return reaction;
    }

    public void setReaction(ReactionEnum reaction) {
        this.reaction = reaction;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
