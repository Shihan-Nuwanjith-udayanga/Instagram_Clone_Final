package lk.ijse.ws.instagram_clone.repository;

import lk.ijse.ws.instagram_clone.enitiy.InstaUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstaUserRepo extends CrudRepository<InstaUser, Long> {
}
