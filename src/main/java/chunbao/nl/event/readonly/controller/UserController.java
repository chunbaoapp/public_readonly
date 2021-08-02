package chunbao.nl.event.readonly.controller;

import chunbao.nl.event.module.GuiUser;
import chunbao.nl.event.readonly.dao.GuiUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user-rest")
public class UserController {

  @Autowired GuiUserRepo guiUserRepo;

  @GetMapping(value = "/{username}", produces = "application/json")
  public GuiUser getUser(@PathVariable String username) {
    GuiUser myUser = new GuiUser();
    myUser.setUsername(username);
    myUser.setPassword("PW:" + username);
    guiUserRepo.save(myUser);
    return myUser;
  }
}
