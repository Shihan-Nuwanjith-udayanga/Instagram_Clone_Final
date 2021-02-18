package lk.ijse.ws.instagram_clone.service.impl;

import lk.ijse.ws.instagram_clone.enitiy.InstaUser;
import lk.ijse.ws.instagram_clone.repository.InstaUserRepo;
import lk.ijse.ws.instagram_clone.service.InstaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstaUserServiceImpl implements InstaUserService {

    @Autowired
    private InstaUserRepo instaUserRepo;

    @Override
    public boolean saveUser(InstaUser user) {
        try {
            instaUserRepo.save(user);
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
}
