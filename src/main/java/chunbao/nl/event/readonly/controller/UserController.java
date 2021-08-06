package chunbao.nl.event.readonly.controller;

import chunbao.nl.event.dao.GuiUserRepo;
import chunbao.nl.event.module.GuiUser;
import java.util.Optional;
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
    Optional<GuiUser> optional = guiUserRepo.findById(username);
    if (optional.isPresent()) {
      return optional.get();
    } else {
      return null;
    }
  }
}
